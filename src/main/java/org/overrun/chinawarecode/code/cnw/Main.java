package org.overrun.chinawarecode.code.cnw;

import java.io.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class Main {
    public static final Map<String, Method> methods = new HashMap<>();
    public static void load(String all, File dirFile) {
        if (!dirFile.exists()) {
            dirFile.mkdirs();
        }
        File[] files = dirFile.listFiles();
        if (files != null) {
            for (var f: files) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    String line;
                    StringBuilder sb = new StringBuilder();
                    while ((line = br.readLine()) != null) {
                        sb.append(line).append("\n");
                    }

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        String replace =
                all
                        .replace("\n", "${enter}")
                        .replace("\t", "${tab}");//巧妙的对换行换
        System.out.println(replace);
    }

    public static void main(String[] args) {
        String a = """
                    abb
                    cc
                    dd"
                """;
        load(a, new File(System.getProperty("user.dir"), "test"));
    }
}
