package snappet.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;
import snappet.test.ui.PanelLessonElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static snappet.test.ui.PanelLessonElements.*;

public class Edit implements Task {


    @Step("Edits a lesson form the home page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EditBtn),
                WaitUntil.the(EditionPanel, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(SubjectName),
                Enter.theValue("Edition text test").into(SubjectName),
                Click.on(GradeSelector),
                Click.on(GradeOption)
        );
    }

    public static Edit Lesson() {
        return instrumented(Edit.class);
    }

}
