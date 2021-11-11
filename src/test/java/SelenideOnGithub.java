import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import javax.swing.*;
import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideOnGithub {

    @BeforeAll
    static void beforeALl () {
        Configuration.startMaximized = true;
    }

    @Test
    void selenideSearhOnGithub() {
        //Откройте страницу Selenide в Github
        open("https://github.com/");
        $("[data-test-selector='nav-search-input']").setValue("Selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();

        //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        //сначала найду
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        //теперь проверю, что видно, и кликну
        $(byText("SoftAssertions")).shouldBe(visible).click();

        //проверю наличие примера кода для JUnit5
        $("#wiki-body").shouldHave(text("JUnit5"));
        //sleep(5000);
    }
}
