import AnalyzerPackage.AnalyzerTheLongestWords;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AnalyzerTheLongestWordsTest {

    private AnalyzerTheLongestWords analyzerTheLongestWords;

    @Before
    public void setUp(){
        analyzerTheLongestWords = new AnalyzerTheLongestWords();
    }

    @Test
    public void testTheLongestWords(){
        List<String> expected = new LinkedList<>();
        expected.add("Aneta");
        expected.add("pies,");
        expected.add("Anet");
        expected.add("kot");
        List<String> actual = analyzerTheLongestWords.analyze("Aneta kot pies, Anet");
        assertEquals(expected,actual);
    }
}
