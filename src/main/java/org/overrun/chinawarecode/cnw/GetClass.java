package org.overrun.chinawarecode.cnw;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import static java.nio.charset.StandardCharsets.UTF_8;

public class GetClass {
    public static Set<Class<?>> getClasses(String pack, Class<? extends Annotation> clazz) {
        Set<Class<?>> classes = new LinkedHashSet<>();
        boolean recursive = true;
        String packageDirName = pack.replace('.', '/');
        Enumeration<URL> dirs;
        try {
            dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
            while (dirs.hasMoreElements()) {
                URL url = dirs.nextElement();
                String protocol = url.getProtocol();
                if ("file".equals(protocol)) {
                    String path = URLDecoder.decode(url.getFile(), UTF_8);
                    findClassInPaackageByFile(pack, path, recursive, classes, clazz);
                } else if ("jar".equals(protocol)) {
                    System.out.println("jar类型的扫描");
                    JarFile jar;
                    try {
                        jar = ((JarURLConnection) url.openConnection()).getJarFile();
                        Enumeration<JarEntry> entries = jar.entries();
                        findClassInPaackageByJar(pack, entries, packageDirName, recursive, classes, clazz);
                    } catch (IOException ignored) {}
                }
            }
        } catch (Throwable ignored) {}
        return classes;
    }

    private static void findClassInPaackageByJar(String pack, Enumeration<JarEntry> entries, String packageDirName, boolean recursive, Set<Class<?>> classes, Class<? extends Annotation> clazz) {
        while (entries.hasMoreElements()) {
            JarEntry entry = entries.nextElement();
            String name = entry.getName();
            if (name.charAt(0) == '/') {
                name = name.substring(1);
            }
            if (name.startsWith(packageDirName)) {
                int idx = name.lastIndexOf('/');
                if (idx != -1) {
                    pack = name.substring(0, idx).replace('/', '.');
                }
                if ((idx != - 1) || recursive) {
                    if (name.endsWith(".class") && !entry.isDirectory()) {
                        String className = name.substring(pack.length() + 1, name.length() - 6);
                        try {
                            Class<?> aClass = Class.forName(pack + '.' + className);
                            if (aClass.isAnnotationPresent(clazz)) {
                                classes.add(aClass);
                            }

                        } catch (ClassNotFoundException ignored) {}
                    }
                }
            }
        }
    }

    private static void findClassInPaackageByFile(String packageName, String path, boolean recursive, Set<Class<?>> classes, Class<? extends Annotation> clazz) {
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            return;
        }
        File[] dirFiles = dir.listFiles(pathname -> (recursive && pathname.isDirectory()) || (pathname.getName().endsWith(".class")));
        for (final var file : dirFiles) {
            if (file.isDirectory()) {
                findClassInPaackageByFile(packageName + "." + file.getName(), file.getAbsolutePath(), recursive, classes, clazz);
            } else {
                String className = file.getName().substring(0, file.getName().length() - 6);
                try {
                    Class<?> aClass = Thread.currentThread().getContextClassLoader().loadClass(packageName + '.' + className);
                    if (aClass.isAnnotationPresent(clazz)) {
                        classes.add(aClass);
                    }
                } catch (ClassNotFoundException ignored) {}
            }
        }
    }
}
