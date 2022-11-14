package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.GeneralTimeout;

import static com.codeborne.selenide.Selenide.$;

public class Overview {
    private static final SelenideElement CONTAINER = $("#overview");

    public Overview() {
        CONTAINER.should(Condition.visible, GeneralTimeout.COMMON);
    }

    public void selectExample(String href) {
        SelenideElement linkForExample= $(String.format("a[href='%s']", href));
        linkForExample.scrollIntoView(true);
        linkForExample.should(Condition.appear).click();
        linkForExample.should(Condition.disappear);
    }
}
