package aurora.pageActions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BreakDownPage {

    //static Target BREAKDOWN_TAB = Target.the("Breakdown Tab").located(By.xpath("//ul[@class='tabs']/li[3]/a"));
    static Target BREAKDOWN_TAB = Target.the("Breakdown Tab").located(By.cssSelector("ul.tabs li:nth-child(3) a"));

    static Target COMPONENT_INSTRUMENT_BTN = Target.the("Component/Instrument").located(By.xpath("//span[@class=\"clickable    no-child-pointers\"][1]"));
    static Target COMPONENT_TXT = Target.the("Component text field").located(By.id("component_name"));//Inst-1
    static Target COMPONENT_SAVE_BTN = Target.the("Save Button").located(By.id("saveCustomFields"));
    static Target LANG_PAIR_BTN = Target.the("Language Pair").located(By.xpath("//span[@class=\"clickable    no-child-pointers\"][2]"));
    static Target LANGUAGE_PAIRS_SELECT= Target.the("Language Pairs Select").located(By.id("add-lp-languages"));//English -> French (France)//36875
    static Target COMPONENT_SELECT = Target.the("Component Select").located(By.id("add-lp-components"));//Inst-1
    static Target LANG_PAIR_SAVE_BUTTON = Target.the("Lang. Pair Save Button").located(By.className("schedule-button btn-submit"));
    static Target LINE_ITEM_BTN = Target.the("Line Item").located(By.xpath("//span[@class=\"clickable    no-child-pointers\"][3]"));
    static Target LINE_ITEM_TYPE = Target.the("Line Item type select").located(By.id("nri_select_type"));//DTP//2
    static Target LINE_SERVICE_ITEM = Target.the("Line Service item select").located(By.id("id_ri_descr_all"));//Format Only
    static Target WORD_QUANTITY_TXT = Target.the("Word quantity text").located(By.id("addLineItemQuantity"));//678
    static Target LINE_SAVE_AND_CLOSE_BTN = Target.the("Line Save&Close Button").located(By.xpath("//button[@class='schedule-button btn-nri-save'][2]"));
    static Target DISCOUNT_BTN = Target.the("Discount").located(By.xpath("//span[@class=\"clickable    no-child-pointers\"][4]"));
    static Target DISCOUNT_AMOUNT_TXT = Target.the("Discount Amount txt").located(By.id("amountDis"));
    static Target PERCENT_RADIO_BTN = Target.the("% Radio button").located(By.xpath("//input[@value='percentage']"));
    static Target ADD_DISCOUNT_BTN = Target.the("Add Discount button").located(By.xpath("//button[@class='schedule-button details-action add-discount']"));
    static Target EDIT_MODE_BTN = Target.the("Edit Mode button").located(By.xpath("//button[text()='Edit Mode']"));
    static Target EXPAND_BREAKDOWN = Target.the("Expand Breakdown").located(By.xpath("//i[@data-action=\"open\"]"));
    static Target RATE_TXT = Target.the("Rate Textbox").located(By.xpath("//input[@type='number']"));
    static Target SAVE_EDIT_BTN = Target.the("Save Button after Edit").located(By.xpath("//button[text()='Save']"));


}
