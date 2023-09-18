package appleInsider;


import core.BaseSelenideTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("AppleTest")
public class AppleTest extends BaseSelenideTest {

    private final static String BASE_URL = "https://www.apple.com/ru/";
    private final static String SEARCH_STRING = "iPhone 15";
    private final static String EXPECTED_WORD = "iOS 15";

    @Test
    public void checkHref(){
        Assertions.assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getTextFirstArticle()
                .contains(EXPECTED_WORD));
    }
}
