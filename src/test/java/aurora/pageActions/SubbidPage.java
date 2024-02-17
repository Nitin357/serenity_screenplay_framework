package aurora.pageActions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubbidPage {

    static Target EDIT_DETAILS = Target.the("Edit Details").located(By.xpath("//span[@class=\"clickable no-child-pointers\"][3]"));
    static Target QUOTE_TYPE = Target.the("Quote type").located(By.id("bidScenarioId"));//Default Scenario
    static Target ESTIMATED_LAUNCH_DATE = Target.the("Estimated Launch Date").located(By.id("edit-expectedLaunchDate"));
    static Target TODAY_DATE = Target.the("Today Date").located(By.xpath("//span[@class=\"flatpickr-day today\"]"));
    static Target REQ_PROJ_DELIVERY_DATE = Target.the("Requested Project Delivery Date").located(By.id("edit-requestedDeliveryDate"));

    static Target EXP_REV_REC_DATE = Target.the("Expected Revenue Recognition Date").located(By.id("edit-expectedRevenueRecognitionDate"));

    static Target SAVE_BTN = Target.the("Save Button").located(By.xpath("//button[text()=' Save']"));

}
