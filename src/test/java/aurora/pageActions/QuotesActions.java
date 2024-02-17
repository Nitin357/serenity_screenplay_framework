package aurora.pageActions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class QuotesActions {

    public static Performable clickQuotesTab() {
        return Task.where("{0} Click Quotes Tab",
                Click.on(QuotesPage.QUOTES_TAB));
    }

    public static Performable clickCreateNewQuote() {
        return Task.where("{0} Click on Create New Quote Button",
                Click.on(QuotesPage.CREATE_NEW_QUOTE));
    }
    public static Performable clickFirstExistingQuote() {
        return Task.where("{0} Click on First Existing Quote",
                Click.on(QuotesPage.FIRST_EXISTING_QUOTE));
    }
    public static Performable selectClient(String clientName) {
        return Task.where("{0} Select Client Name",
                SelectFromOptions.byVisibleText(clientName).from(QuotesPage.CLIENT));
    }
    public static Performable selectClientContact(String clientContact) {
        return Task.where("{0} Select Client Contact",
                SelectFromOptions.byVisibleText(clientContact).from(QuotesPage.CLIENT_CONTACT));
    }
    public static Performable selectTeam(String Team) {
        return Task.where("{0} Select Team",
                SelectFromOptions.byVisibleText(Team).from(QuotesPage.TEAM));
    }
    public static Performable enterBidDesc(String bidDesc) {
        return Task.where("{0} Enter Bid Description",
                Enter.theValue(bidDesc).into(QuotesPage.BID_DESC));
    }
    public static Performable selectQuoteFormat(String quoteFormat) {
        return Task.where("{0} Select Quote Format",
                SelectFromOptions.byVisibleText(quoteFormat).from(QuotesPage.QUOTE_FORMAT));
    }
    public static Performable selectRWSQuoteConatct(String rwsQuoteContact) {
        return Task.where("{0} Select RWS Quote Contact",
                SelectFromOptions.byVisibleText(rwsQuoteContact).from(QuotesPage.RWS_QUOTE_CONTACT));

    }

    public static Performable clickCreateNewQuoteFormBtn()
    {
        return Task.where("{0} Click on Create New Quote Form Button",
                Click.on(QuotesPage.CREATE_NEW_QUOTE_FORM_BTN));
    }
}
