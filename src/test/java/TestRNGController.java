import at.goldinger.RNGController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRNGController {

    @Test
    public void Test_maxValue(){
        RNGController random = new RNGController();
        int numb = random.RNG(500, 600);
        Assertions.assertTrue(numb <= 600);
    }
    @Test
    public void Test_minValue(){
        RNGController random = new RNGController();
        int numb = random.RNG(500, 600);
        Assertions.assertTrue(numb >= 500);
    }

}
