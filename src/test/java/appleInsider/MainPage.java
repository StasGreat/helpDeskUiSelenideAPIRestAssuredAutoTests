package appleInsider;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Главная страница сайта Appleinsider.ru
 */
public class MainPage {

    private final SelenideElement searchButton = $(By.id("ac-gn-link-search"));
    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * Выполняется поиск на сайте среди статей и нажимается кнопка Enter
     *
     * @param searchString поисковая строка
     */
    protected SearchPage search(String searchString) {
        searchButton.click();
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
