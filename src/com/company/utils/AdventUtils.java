package com.company.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AdventUtils {

    public static Stream<String> getFile(String path) throws IOException {
       return Files.lines(Paths.get(path));
    }


}
