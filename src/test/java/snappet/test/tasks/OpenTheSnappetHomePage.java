package snappet.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import snappet.test.ui.SnappetHomePage;

public class OpenTheSnappetHomePage implements Task{
    private SnappetHomePage snappetHomePage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(snappetHomePage)
        );
    }
}
