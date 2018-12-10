package AnalyzerPackage;
import Input_OutputPackage.InputFromFile;
import java.util.ArrayList;

public class MultiAnalyzer {

    public MultiAnalyzer(ArrayList<Analyzer> analyzers) {
        analyzers.add(analyzerCountNumberOfWords);
        analyzers.add(analyzerTheFrequencyOfTheLetters);
        analyzers.add(analyzerTheLongestWords);
        analyzers.add(analyzerTheMostPopularWords);
    }

    private AnalyzerCountNumberOfWords analyzerCountNumberOfWords = new AnalyzerCountNumberOfWords();
    private AnalyzerTheFrequencyOfTheLetters analyzerTheFrequencyOfTheLetters = new AnalyzerTheFrequencyOfTheLetters();
    private AnalyzerTheMostPopularWords analyzerTheMostPopularWords = new AnalyzerTheMostPopularWords();
    private AnalyzerTheLongestWords analyzerTheLongestWords = new AnalyzerTheLongestWords();

    public void perform(){
        String text = InputFromFile.readTextFromFile();
        System.out.println(analyzerCountNumberOfWords.analyze(text));
        System.out.println(analyzerTheMostPopularWords.analyze(text));
        System.out.println(analyzerTheLongestWords.analyze(text));
        System.out.println(analyzerTheFrequencyOfTheLetters.analyze(text));

    }
}

