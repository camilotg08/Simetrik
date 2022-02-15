package ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {
    private SearchPage() {

    }
    public static final Target INPUT_SEARCH = Target.the("Input Search")
            .locatedBy("//input[@name='q']");
    public static final Target MESSAGE_RESULTS = Target.the("Message of the results")
            .locatedBy("//div[contains(@id, 'result-stats')]");
}
