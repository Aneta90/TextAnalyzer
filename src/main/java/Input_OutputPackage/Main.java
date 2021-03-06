package Input_OutputPackage;

import AnalyzerPackage.*;
import com.detectlanguage.errors.APIError;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws APIError {

        ArrayList<Analyzer> analyzers = new ArrayList<>();
        analyzers.add(new AnalyzerCountNumberOfWords());
        analyzers.add(new AnalyzerTheFrequencyOfTheLetters());
        analyzers.add(new AnalyzerTheLongestWords());
        analyzers.add(new AnalyzerTheMostPopularWords());

        MultiAnalyzer multiAnalyzer = new MultiAnalyzer(analyzers);
        multiAnalyzer.perform();
    }
}
