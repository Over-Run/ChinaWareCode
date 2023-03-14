package org.overrun.chinawarecode.api;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"ResultOfMethodCallIgnored", "DuplicatedCode"})
public class Loader {

    private static final List<String> codes = new ArrayList<>();

    public static List<String> getCodes() {
        return new ArrayList<>(codes);
    }
    private static int mode = 0;

    /**
     * @param dir 文件夹
     */
    public static void load(@NotNull File dir) {
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File[] files = dir.listFiles();
        if (files != null) {
            load(files);
        }
    }

    public static void load(@Nonnull File[] files) {
        for (File file : files) {
            loadFile(file);
        }
    }

    private static void loadFile(@Nonnull File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            final StringBuilder sb = new StringBuilder();
            br.lines().forEach(s -> {
                if (mode == 0) {
                    if (s.contains(";")) codes.add(s);
                    else if (s.contains("{")) {
                        if (!s.contains("}")) mode++;
                        sb.append(s).append("\n");
                    } else if (s.contains("}")) {
                        mode--;
                        sb.append(s).append("\n");
                    }
                } else {
                    sb.append(s).append("\n");
                    if (s.contains("{")) {
                        if (!s.contains("}")) mode++;
                    } else if (s.contains("}")) {
                        mode--;
                        if (mode == 0) {
                            codes.add(sb.toString());
                            sb.delete(0, sb.length() - 1);
                        }
                    }
                }
            });
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
