package aurora.pageActions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class SubbidActions {

    public static Performable clickEditDetailsBtn() {
        return Task.where("{0} Click Edit Details Button",
                Click.on(SubbidPage.EDIT_DETAILS));
    }

    public static Performable selectQuoteType(String quoteType) {
        return Task.where("{0} Select Quote Type",
                SelectFromOptions.byVisibleText(quoteType).from(SubbidPage.QUOTE_TYPE));
    }
    public static Performable selectEstiLaunchDate() {
        return Task.where("{0} Click and Press Arrow Down and Enter",
                Click.on(SubbidPage.ESTIMATED_LAUNCH_DATE),
                Hit.the(Keys.ARROW_DOWN).into(SubbidPage.TODAY_DATE),
                Hit.the(Keys.ENTER).into(SubbidPage.TODAY_DATE)
        );

    }
    public static Performable selectReqProjDeliveryDate() {
        return Task.where("{0} Double-Click and Press Arrow Down Three Times and Enter",
                Click.on(SubbidPage.REQ_PROJ_DELIVERY_DATE),
                Hit.the(Keys.ARROW_DOWN).into(SubbidPage.TODAY_DATE),
                Hit.the(Keys.ARROW_RIGHT).into(SubbidPage.TODAY_DATE),
                Hit.the(Keys.ENTER).into(SubbidPage.TODAY_DATE)
        );

    }
    public static Performable selectExpeRevRecDate() {
        return Task.where("{0} Double-Click and Press Arrow Down Three Times and Enter",
                Click.on(SubbidPage.EXP_REV_REC_DATE),
                Hit.the(Keys.ARROW_DOWN).into(SubbidPage.TODAY_DATE),
                Hit.the(Keys.ARROW_RIGHT).into(SubbidPage.TODAY_DATE),
                Hit.the(Keys.ARROW_RIGHT).into(SubbidPage.TODAY_DATE),
                Hit.the(Keys.ENTER).into(SubbidPage.TODAY_DATE)
        );

    }
    public static Performable clickSaveBtn() {
        return Task.where("{0} Click Save Button",
                Click.on(SubbidPage.SAVE_BTN));
    }
}
