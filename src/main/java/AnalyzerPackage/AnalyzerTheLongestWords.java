package AnalyzerPackage;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyzerTheLongestWords implements Analyzer {

    public List<String> analyze(String text) {

        List<String> stringList;
        stringList = Arrays.asList(text.split("[ .]"));
        return stringList.stream().distinct().sorted(Comparator.comparing(String::length).reversed()).limit(10).collect(Collectors.toList());
    }
}
