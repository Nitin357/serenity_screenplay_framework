package aurora.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import aurora.navigation.NavigateTo;
import aurora.pageActions.QuotesActions;

public class QuoteStepDefinitions {

    @Given("{actor} on Aurora Testing")
    public void navigateAuroraHomePage(Actor actor) throws InterruptedException {
        actor.wasAbleTo(NavigateTo.theAuroraHomePage());
        Thread.sleep(3000);
    }

    @When("{actor} click Quotes Tab")
    public void clickQuotesTab(Actor actor) {
        actor.attemptsTo(
                QuotesActions.clickQuotesTab());

    }

    @Then("{actor} should Able to click Create New Quotes Button")
    public void clickCreateNewQuote(Actor actor) {
        actor.attemptsTo(
                QuotesActions.clickCreateNewQuote());
    }
    @Then("{actor} should Able to click First existing quote")
    public void clickFirstExistingQuote(Actor actor) throws InterruptedException {
        Thread.sleep(3000);
        actor.attemptsTo(
                QuotesActions.clickFirstExistingQuote());
        Thread.sleep(3000);
    }

    @Then("{actor} Select Client as {string}")
    public void select_client_name(Actor actor, String client) {
        actor.attemptsTo(QuotesActions.selectClient(client)
        );
    }
    @Then("{actor} Select Client contact as {string}")
    public void select_client_contact(Actor actor, String clientContact) {
        actor.attemptsTo(QuotesActions.selectClientContact(clientContact)
        );
    }
    @Then("{actor} Select Team as {string}")
    public void select_team(Actor actor, String team) {
        actor.attemptsTo(QuotesActions.selectTeam(team)
        );
    }
    @Then("{actor} Enter Bid Description as {string}")
    public void enter_bid_Description(Actor actor, String bidDesc) {
        actor.attemptsTo(QuotesActions.enterBidDesc(bidDesc)
        );
    }
    @Then("{actor} Select Quote format as {string}")
    public void select_quote_format(Actor actor, String quoteFormat) {
        actor.attemptsTo(QuotesActions.selectQuoteFormat(quoteFormat)
        );
    }
    @Then("{actor} Select RWS Quote Contact as {string}")
    public void select_rws_quote_contact(Actor actor, String rwsQuoteContact) {
        actor.attemptsTo(QuotesActions.selectRWSQuoteConatct(rwsQuoteContact)
        );
    }
    @Then("{actor} Click Create New Quote form Button")
    public void click_create_new_quote_form_btn(Actor actor) throws InterruptedException {
        actor.attemptsTo(
                QuotesActions.clickCreateNewQuoteFormBtn());
        Thread.sleep(5000);
    }
}
