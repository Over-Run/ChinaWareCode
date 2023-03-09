package org.overrun.chinawarecode.code.cnw;

import java.io.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class Main {
    public static void load(File dirFile) {
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
                    System.out.println(sb);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        load(new File(System.getProperty("user.dir"), "test"));
    }
}
