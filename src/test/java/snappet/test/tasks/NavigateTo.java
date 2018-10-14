package snappet.test.tasks;

import snappet.test.model.navMenu;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import snappet.test.ui.NavigationBar;
import snappet.test.ui.SnappetHomePage;

public class NavigateTo implements Task {

    private final navMenu page;
    private SnappetHomePage theSnappetHomePage;

    public NavigateTo(navMenu page) {
        this.page = page;
    }

    @Override
    @Step("{0} navigates to the #page page")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(NavigationBar.page(page))
        );
    }

    public static Performable thePage(navMenu page) {
        return Instrumented.instanceOf(NavigateTo.class).withProperties(page);
    }
}