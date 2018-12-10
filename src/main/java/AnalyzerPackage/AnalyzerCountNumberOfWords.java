package AnalyzerPackage;

import java.util.stream.Stream;

public class AnalyzerCountNumberOfWords implements Analyzer {

    public Integer analyze(String text) {

        if (text.equals("")) {
            return 0;
        } else {
            long sum = Stream.of(text.toLowerCase().split(" ")).parallel().count();
            return Math.toIntExact(sum);
        }
    }
}