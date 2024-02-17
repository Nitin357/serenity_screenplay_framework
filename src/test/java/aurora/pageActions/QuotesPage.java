package aurora.pageActions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class QuotesPage {

    static Target QUOTES_TAB = Target.the("Quotes Tab").located(By.id("bids_menu"));
    static Target CREATE_NEW_QUOTE = Target.the("Create new Quote").located(By.id("aur-new-quote"));
    static Target FIRST_EXISTING_QUOTE = Target.the("First Existing Quote").located(By.xpath("//table[@class='hightable']//tbody//tr[2]//td[1]"));
    static Target CLIENT = Target.the("Client").located(By.name("clientId"));
    static Target CLIENT_CONTACT = Target.the("Client contact").located(By.name("clientContactId"));
    static Target TEAM = Target.the("Team").located(By.name("teamId"));
    static Target BID_DESC = Target.the("Bid Description").located(By.name("bidDescription"));
    static Target QUOTE_FORMAT = Target.the("Quote format").located(By.name("quoteType"));
    static Target RWS_QUOTE_CONTACT = Target.the("RWS Quote Contact").located(By.name("assignedTo"));
    static Target CREATE_NEW_QUOTE_FORM_BTN = Target.the("Create new Quote Form btn").located(By.xpath("//button[text()=\"Create New Quote\"]"));


}
