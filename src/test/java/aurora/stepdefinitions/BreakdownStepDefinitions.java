package aurora.stepdefinitions;

import aurora.pageActions.BreakDownActions;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;

public class BreakdownStepDefinitions {

    @Then("{actor} Click Breakdown Tab")
    public void click_breakdown_tab(Actor actor) throws InterruptedException {
        Thread.sleep(4000);
        actor.attemptsTo(BreakDownActions.clickBreakdownTab());
        Thread.sleep(4000);
    }


    @Then("{actor} Click ComponenetInstrument Button")
    public void heClickComponenetInstrumentButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickComponentInstrumentBtn());
        Thread.sleep(2000);
    }

    @Then("{actor} Enter Component as {string}")
    public void heEnterComponentAs(Actor actor, String component) {
        actor.attemptsTo(BreakDownActions.enterComponentTxt(component));
    }

    @Then("{actor} Click Save Component Button")
    public void heClickSaveComponentButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickComponentSave());
        Thread.sleep(1000);
    }

    @Then("{actor} Click Lang. pair Button")
    public void heClickLangPairButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickLangPairBtn());
        Thread.sleep(2000);
    }

    @Then("{actor} Select Language Pair as {string}")
    public void heSelectLanguagePairAs(Actor actor, String langPair) {
        actor.attemptsTo(BreakDownActions.selectLangPairs(langPair));
    }

    @Then("{actor} Select Component as {string}")
    public void heSelectComponentAs(Actor actor, String comp) {
        actor.attemptsTo(BreakDownActions.selectComponent(comp));
    }

    @Then("{actor} Click Save Lang. Pair Button")
    public void heClickSaveLangPairButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickLangPairSaveBtn());
        Thread.sleep(2000);
    }

    @Then("{actor} Click Line item Button")
    public void heClickLineItemButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickLineItemBtn());
        Thread.sleep(3000);
    }

    @Then("{actor} Select Type as {string}")
    public void heSelectTypeAs(Actor actor, String itemType) {
        actor.attemptsTo(BreakDownActions.selectLineItemType(itemType));
    }

    @Then("{actor} Select Service Item as {string}")
    public void heSelectServiceItemAs(Actor actor, String serviceItem) {
        actor.attemptsTo(BreakDownActions.selectLineServiceItem(serviceItem));
    }

    @Then("{actor} Enter Word quantity as {string}")
    public void heEnterWordQuantityAs(Actor actor, String wordQty) {
        actor.attemptsTo(BreakDownActions.enterWordQuantityTxt(wordQty));
    }

    @Then("{actor} Click Save And Close Button")
    public void heClickSaveAndCloseButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickLineSaveAndCloseBtn());
        Thread.sleep(3000);
    }

    @Then("{actor} Click Discount Button")
    public void heClickDiscountButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickDiscountBtn());
        Thread.sleep(3000);
    }

    @Then("{actor} Enter Discount amount as {string}")
    public void heEnterDiscountAmountAs(Actor actor, String discountAmt) {
        actor.attemptsTo(BreakDownActions.enterDiscountAmtTxt(discountAmt));
    }

    @Then("{actor} Click % radio Button")
    public void heClickRadioButton(Actor actor) {
        actor.attemptsTo(BreakDownActions.clickPercentageRadioBtn());
    }

    @Then("{actor} Click Add Discount Button")
    public void heClickAddDiscountButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickAddDiscountBtn());
        Thread.sleep(3000);
    }

    @Then("{actor} Click Edit Mode Button")
    public void heClickEditModeButton(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickEditModeBtn());
        Thread.sleep(2000);
    }

    @Then("{actor} Click Expand Breakdown")
    public void heClickExpandBreakdown(Actor actor) {
        actor.attemptsTo(BreakDownActions.clickExpandBreakdownBtn());
    }

    @Then("{actor} Enter Rate as {string}")
    public void heEnterRateAs(Actor actor, String rate) {
        actor.attemptsTo(BreakDownActions.enterRateTxt(rate));
    }

    @Then("{actor} Click Save Button after edit")
    public void heClickSaveButtonAfterEdit(Actor actor) throws InterruptedException {
        actor.attemptsTo(BreakDownActions.clickSaveAfterEditBtn());
        Thread.sleep(15000);
    }
}
