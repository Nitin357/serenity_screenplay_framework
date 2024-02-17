package aurora.pageActions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
public class BreakDownActions  {


    public static Performable clickBreakdownTab() {
        return Task.where("{0} Click Breakdown Tab",
                Click.on(BreakDownPage.BREAKDOWN_TAB));

    }



    public static Performable clickComponentInstrumentBtn() {
        return Task.where("{0} Click Component/Instrument Button",
                Click.on(BreakDownPage.COMPONENT_INSTRUMENT_BTN));
    }
    public static Performable enterComponentTxt(String component) {
        return Task.where("{0} Enter Component",
                Enter.theValue(component).into(BreakDownPage.COMPONENT_TXT));
    }
    public static Performable clickComponentSave() {
        return Task.where("{0} Click Component/Instrument Save Button",
                Click.on(BreakDownPage.COMPONENT_SAVE_BTN));
    }
    public static Performable clickLangPairBtn() {
        return Task.where("{0} Click Lang. Pair Button",
                Click.on(BreakDownPage.LANG_PAIR_BTN));
    }
    public static Performable selectLangPairs(String langPairs) {
        return Task.where("{0} Select Language Pairs",
                SelectFromOptions.byVisibleText(langPairs).from(BreakDownPage.LANGUAGE_PAIRS_SELECT));
    }
    public static Performable selectComponent(String component) {
        return Task.where("{0} Select Component",
                SelectFromOptions.byVisibleText(component).from(BreakDownPage.COMPONENT_SELECT));
    }
    public static Performable clickLangPairSaveBtn() {
        return Task.where("{0} Click Language Pairs Save Button",
                Click.on(BreakDownPage.LANG_PAIR_SAVE_BUTTON));

    }
    public static Performable clickLineItemBtn()
    {
        return Task.where("{0} Click Line Item Button",
                Click.on(BreakDownPage.LINE_ITEM_BTN));
    }
    public static Performable selectLineItemType(String lineItemType) {
        return Task.where("{0} Select Line Item Type",
                SelectFromOptions.byVisibleText(lineItemType).from(BreakDownPage.LINE_ITEM_TYPE));
    }
    public static Performable selectLineServiceItem(String lineServiceItem) {
        return Task.where("{0} Select Line Service Item",
                SelectFromOptions.byVisibleText(lineServiceItem).from(BreakDownPage.LINE_SERVICE_ITEM));
    }
    public static Performable enterWordQuantityTxt(String wordQuantity) {
        return Task.where("{0} Enter Word quantity",
                Enter.theValue(wordQuantity).into(BreakDownPage.WORD_QUANTITY_TXT));
    }
    public static Performable clickLineSaveAndCloseBtn()
    {
        return Task.where("{0} Click Line Item Save And Close Button",
                Click.on(BreakDownPage.LINE_SAVE_AND_CLOSE_BTN));
    }
    public static Performable clickDiscountBtn()
    {
        return Task.where("{0} Click Discount Button",
                Click.on(BreakDownPage.DISCOUNT_BTN));
    }
    public static Performable enterDiscountAmtTxt(String discountAmt) {
        return Task.where("{0} Enter Discount Amount",
                Enter.theValue(discountAmt).into(BreakDownPage.DISCOUNT_AMOUNT_TXT));
    }
    public static Performable clickPercentageRadioBtn()
    {
        return Task.where("{0} Click Percentage Radio Button",
                Click.on(BreakDownPage.PERCENT_RADIO_BTN));
    }

    public static Performable clickAddDiscountBtn()
    {
        return Task.where("{0} Click Add Discount Button",
                Click.on(BreakDownPage.ADD_DISCOUNT_BTN));
    }
    public static Performable clickEditModeBtn()
    {
        return Task.where("{0} Click Edit Mode Button",
                Click.on(BreakDownPage.EDIT_MODE_BTN));
    }
    public static Performable clickExpandBreakdownBtn()
    {
        return Task.where("{0} Click Expand Breakdown Button",
                Click.on(BreakDownPage.EXPAND_BREAKDOWN));
    }
    public static Performable enterRateTxt(String rate) {
        return Task.where("{0} Enter Rate Text",
                Enter.theValue(rate).into(BreakDownPage.RATE_TXT));
    }
    public static Performable clickSaveAfterEditBtn()
    {
        return Task.where("{0} Click Save Button After Edit",
                Click.on(BreakDownPage.SAVE_EDIT_BTN));
    }


}
