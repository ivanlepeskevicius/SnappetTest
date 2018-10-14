package snappet.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static snappet.test.ui.CreateLessonElements.*;
import static snappet.test.ui.HomePageElements.*;

public class Create implements Task {


    @Step("Create a lesson from the home page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddLesson),
                WaitUntil.the(AddLessonWizard, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(NextBtn),
                Click.on(GradeSelector),
                Click.on(NextBtn),
                Click.on(SuggestionCard),
                Click.on(ActivateSubject),
                WaitUntil.the(LessonCard, isPresent()).forNoMoreThan(10).seconds()
        );
    }

    public static Create Lesson() {
        return instrumented(Create.class);
    }

}
