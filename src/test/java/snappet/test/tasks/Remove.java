package snappet.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import snappet.test.ui.CreateLessonElements;
import snappet.test.ui.HomePageElements;
import snappet.test.ui.PanelLessonElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static snappet.test.ui.PanelLessonElements.*;

public class Remove implements Task {


    @Step("Remove a lesson form the home page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EditBtn),
                WaitUntil.the(EditionPanel, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(RemoveBtn),
                WaitUntil.the(RemoveMsg, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(RemoveConfirm)
        );
    }

    public static Remove Lesson() {
        return instrumented(Remove.class);
    }

}
