package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import ui.SearchPage;

import static utilities.Constants.BUSQUEDA;

public class Search implements Task {

    public static Search inThePage() {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(BUSQUEDA).into(SearchPage.INPUT_SEARCH).thenHit(Keys.ENTER)
        );
    }
}
