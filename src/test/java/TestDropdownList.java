import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestDropdownList {
    @Test
     void testDropdownList() {
        open ("https://the-internet.herokuapp.com/dropdown");
        $("#dropdown").click();
        $("#dropdown").$(byText("Option 1")).click();
$("option[selected=selected]").shouldHave(text("Option 1"));

        System.out.println("qwqwqw");
    }



}
