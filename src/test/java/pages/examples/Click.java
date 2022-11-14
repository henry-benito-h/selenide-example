package pages.examples;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.GeneralTimeout;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Click {
    private static final SelenideElement CONTAINER = $(".container h3");
    private static final SelenideElement BAD_BUTTON = $("#badButton");

    public Click() {
        CONTAINER.should(text("Click")).should(Condition.visible, GeneralTimeout.COMMON);
    }

    public void clickOnButton() {
        BAD_BUTTON.click();
    }

    public SelenideElement getBadButton() {
        return BAD_BUTTON;
    }
}
