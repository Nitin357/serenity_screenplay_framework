package aurora.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theAuroraHomePage() {
        return Task.where("{0} opens the Aurora home page",
                Open.browserOn().the(AuroraHomePage.class));
    }
}
