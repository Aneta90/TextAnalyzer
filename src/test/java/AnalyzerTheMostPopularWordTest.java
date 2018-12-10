import AnalyzerPackage.AnalyzerTheMostPopularWords;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;

public class AnalyzerTheMostPopularWordTest {

    private AnalyzerTheMostPopularWords analyzerTheMostPopularWords;

    @Before
    public void setUp(){
        analyzerTheMostPopularWords = new AnalyzerTheMostPopularWords();
    }

    @Test
    public void testTheMostPopularWords(){
        Map<String,Long> expected = new HashMap<>();
        expected.put("aneta", 2L);
        expected.put("kuba",2L);
        expected.put("wrobel.",1L);
        expected.put("aneta,",1L);
        Map actual = analyzerTheMostPopularWords.analyze("Aneta Wrobel. Aneta, Aneta Kuba Kuba");
        assertEquals(expected,actual);
    }

}
