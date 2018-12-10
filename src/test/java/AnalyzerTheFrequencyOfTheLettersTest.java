import AnalyzerPackage.AnalyzerTheFrequencyOfTheLetters;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AnalyzerTheFrequencyOfTheLettersTest {

    private AnalyzerTheFrequencyOfTheLetters analyzerTheFrequencyOfTheLetters;

    @Before
    public void setUp(){
        analyzerTheFrequencyOfTheLetters = new AnalyzerTheFrequencyOfTheLetters();
    }

    @Test
    public void testFrequencyOfWords(){

            Map<Character,Double> expected = new HashMap<Character, Double>();
            expected.put('a',0.4);
            expected.put('n',0.2);
            expected.put('e',0.2);
            expected.put('t',0.2);
            Map actual = analyzerTheFrequencyOfTheLetters.analyze("Aneta");
            assertEquals(expected,actual);
        }
    }


