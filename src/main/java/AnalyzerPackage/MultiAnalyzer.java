package AnalyzerPackage;
import Input_OutputPackage.InputFromFile;
import com.detectlanguage.DetectLanguage;
import com.detectlanguage.errors.APIError;
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

    public void perform() throws APIError {
        DetectLanguage.apiKey = "980a6dd66173cdf8739a042175a572a0";
        String text = InputFromFile.readTextFromFile();
        String language = DetectLanguage.simpleDetect(text);
        System.out.println("Number of words in the text " + analyzerCountNumberOfWords.analyze(text));
        System.out.println("The most popular words are " + analyzerTheMostPopularWords.analyze(text));
        System.out.println("The longest words are " + analyzerTheLongestWords.analyze(text));
        System.out.println("Frequency of each letter " + analyzerTheFrequencyOfTheLetters.analyze(text));
        System.out.println("Language used in the text: " + language);

    }
}

