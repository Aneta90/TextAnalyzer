package AnalyzerPackage;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class AnalyzerTheMostPopularWords implements Analyzer<Map<String,Long>> {

    public Map<String, Long> analyze(String text) {

        List<String> popularWords = Arrays.asList(text.toLowerCase().split(" "));
        Map<String, Long> collect = popularWords.stream().collect(groupingBy(Function.identity(), counting()));

        return collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (v1, v2) -> {
                    throw new IllegalStateException();
                },
                LinkedHashMap::new
        ));
    }

    public static void main(String[] args) {
        AnalyzerTheMostPopularWords analyzerTheMostPopularWords = new AnalyzerTheMostPopularWords();
        System.out.println(analyzerTheMostPopularWords.analyze("Aneta Bartek aneta Bartek Gosia Gosia Gosia"));

    }
}
