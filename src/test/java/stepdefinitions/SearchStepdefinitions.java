package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Enter;
import tasks.Search;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static questions.CheckResults.checkResults;

public class SearchStepdefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that I am in the webpage$")
    public void thatIAmInTheWebpage() {
        theActorCalled("I").wasAbleTo(Enter.inThePage());
    }


    @When("^the search engine give me results$")
    public void theSearchEngineGiveMeResults() {
        theActorInTheSpotlight().attemptsTo(Search.inThePage());
    }

    @Then("^the results are different from (\\d+)$")
    public void theResultsAreDifferentFrom(int arg1) {
        theActorInTheSpotlight().should(seeThat(checkResults()));
    }

}
