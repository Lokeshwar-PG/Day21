import org.example.moodanalyserexception.MoodAnalyser;
import org.example.moodanalyserexception.MoodAnalysisException;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserExceptionTest {
    MoodAnalyser exceptionDemo = new MoodAnalyser(null);

    @Test
    public void testHappy() throws MoodAnalysisException {
        String mood = exceptionDemo.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void testSad() throws MoodAnalysisException {
        String mood = exceptionDemo.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));

    }


}
