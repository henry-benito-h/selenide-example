import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import common.References;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.Overview;
import pages.examples.Click;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest {
    @BeforeEach
    void setup() {
        Configuration.browser="firefox";
        Configuration.baseUrl="http://uitestingplayground.com/";
        open(Configuration.baseUrl);
    }

    @Test
    void example() {
        String attribute = "className";
        String expectedValue = ".*success.*";

        new Overview().selectExample(References.CLICK);
        Click clickPage = new Click();
        assertTrue(clickPage.getBadButton().has(not(Condition.attributeMatching(attribute, expectedValue))));
        clickPage.clickOnButton();
        assertTrue(clickPage.getBadButton().has(Condition.attributeMatching(attribute, expectedValue)));
    }
}
