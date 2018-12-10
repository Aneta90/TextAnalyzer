import AnalyzerPackage.AnalyzerCountNumberOfWords;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnalyzerCountNumberOfWordsTest {

    private AnalyzerCountNumberOfWords analyzerCountNumberOfWords;

    @Before
    public void setUp() {
        analyzerCountNumberOfWords = new AnalyzerCountNumberOfWords();
    }

    @Test
    public void testNumberOfWords(){
        int expected =2;
        int actual = analyzerCountNumberOfWords.analyze("Ane Wro");
        assertEquals(expected,actual);
    }

    @Test
    public void testNumberOfWordsWithSpecialCharacters(){
        int expected =3;
        int actual = analyzerCountNumberOfWords.analyze("Ane - Wro");
        assertEquals(expected,actual);
    }

    @Test
    public void testNullString(){
        int expected=0;
        int actual = analyzerCountNumberOfWords.analyze("");
        assertEquals(expected,actual);
    }

}
