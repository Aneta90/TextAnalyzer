package AnalyzerPackage;
import java.util.HashMap;
import java.util.Map;

public class AnalyzerTheFrequencyOfTheLetters implements Analyzer {

    public Map<Character,Double> analyze(String text) {

        Map<Character,Double> wordFrequency = new HashMap<>();
        String textIgnoreUpperCase = text.toLowerCase().replaceAll("[^a-zA-Z]+", "");
        for (char c: textIgnoreUpperCase.toCharArray()){
                  wordFrequency.merge(c,1.0/text.length(),Double::sum);
        }
        return wordFrequency;
    }

}
