package com.cursor;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryCreator {
    public static void createOutOfMemoryError() {
        List<String> strings = new ArrayList<>();
        while (true) {
            strings.add(new String("Java"));
        }
    }
}
