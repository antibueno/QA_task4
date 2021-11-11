import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DrugsAndDrops {
    @BeforeAll
    static void beforeALl () {
        Configuration.startMaximized = true;
    }

    @Test
    void drugsAndDrops () {
        //открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //перенести прямоугольник А на место Б
        $("#column-a").dragAndDropTo("#column-b");
        //проверить, что поменялись
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));


    }
}
