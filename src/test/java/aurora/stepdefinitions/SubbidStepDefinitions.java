package aurora.stepdefinitions;

import aurora.pageActions.SubbidActions;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;

public class SubbidStepDefinitions {

    @Then("{actor} Click Edit Details Button")
    public void click_edit_details_btn(Actor actor) {
        actor.attemptsTo(SubbidActions.clickEditDetailsBtn());
    }

    @Then("{actor} Select Quote type as {string}")
    public void select_quote_type(Actor actor, String quoteType) {
        actor.attemptsTo(SubbidActions.selectQuoteType(quoteType));
    }
    @Then("{actor} Select Estimated Launch Date")
    public void select_estimated_launch_date(Actor actor) throws InterruptedException {
        actor.attemptsTo(SubbidActions.selectEstiLaunchDate());
        Thread.sleep(2000);
    }
    @Then("{actor} Select Requested Project Delivery Date")
    public void select_requested_project_delivery_date(Actor actor) throws InterruptedException {
        actor.attemptsTo(SubbidActions.selectReqProjDeliveryDate());
        Thread.sleep(2000);
    }
    @Then("{actor} Select Expected Revenue Recognition Date")
    public void select_expected_revenue_recognition_date(Actor actor) throws InterruptedException {
        actor.attemptsTo(SubbidActions.selectExpeRevRecDate());
        Thread.sleep(2000);
    }
    @Then("{actor} Click Save Button")
    public void click_save_btn(Actor actor) throws InterruptedException {
        actor.attemptsTo(SubbidActions.clickSaveBtn());
        Thread.sleep(5000);
    }
}

