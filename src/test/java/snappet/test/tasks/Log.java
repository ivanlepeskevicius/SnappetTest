package snappet.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static snappet.test.ui.HeaderElements.Logo;
import static snappet.test.ui.LoginPageElements.*;

public class Log implements Task {


    @Step("Log in into Snappet page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(UserNameField, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue("ChallengeTeacher4").into(UserNameField),
                Enter.theValue("6w0vXrue!").into(PasswordField),
                WaitUntil.the(LogInBtn, isCurrentlyEnabled()),
                Click.on(LogInBtn),
                WaitUntil.the(Logo, isPresent())
        );
    }

    public static Log In() {
        return instrumented(Log.class);
    }

}
