package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static ui.SearchPage.MESSAGE_RESULTS;

public class CheckResults implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(MESSAGE_RESULTS, isPresent());
        return MESSAGE_RESULTS.resolveFor(actor).isPresent();
    }

    public static CheckResults checkResults () {
        return new CheckResults();
    }
}
