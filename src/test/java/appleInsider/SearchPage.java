package appleInsider;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final ElementsCollection articleTitles = $$x("//h2");

    /**
     * Возвращает href из первой статьи
     */
    protected String getHrefFromFirstArticle(){
        return articleTitles.first().getAttribute("href");
    }
    protected String getTextFirstArticle(){
        return articleTitles.first().getText();
    }

}