package snappet.test.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import snappet.test.tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static snappet.test.ui.HomePageElements.*;
import static snappet.test.ui.PanelLessonElements.*;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D_WhenEditingASubject {

    @Managed(driver = "chrome")
    private
    WebDriver theBrowser;
    private Actor theUser = Actor.named("User");

    @Steps
    private
    OpenTheSnappetHomePage openTheSnappetHomePage;

    @Before
    public void userCanBrowseTheWeb() {
        theUser.can(BrowseTheWeb.with(theBrowser));
    }

    @Test
    public void C_removingLesson(){
        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);
        andThat(theUser).wasAbleTo(Log.In());
        andThat(theUser).wasAbleTo(Create.Lesson());

        when(theUser).attemptsTo(Remove.Lesson());

        then(theUser).should(
                seeThat(the(SuccessPopup), isPresent()),
                seeThat(the(AddLesson), isPresent())
        );

    }

    @Test
    public void A_editingLesson(){
        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);
        andThat(theUser).wasAbleTo(Log.In());
        andThat(theUser).wasAbleTo(Create.Lesson());

        when(theUser).attemptsTo(
                Edit.Lesson(),
                Click.on(SaveBtn)
        );

        then(theUser).should(
                seeThat(the(SuccessPopup), isPresent())
        );
        and(theUser).wasAbleTo(Remove.Lesson());
    }

    @Test
    public void B_cancelEdition(){
        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);
        andThat(theUser).wasAbleTo(Log.In());
        andThat(theUser).wasAbleTo(Create.Lesson());

        when(theUser).attemptsTo(
                Edit.Lesson(),
                Click.on(CancelBtn)
        );

        then(theUser).should(
                seeThat(the(EditionPanel), isNotPresent()),
                seeThat(the(SuccessPopup), isNotPresent())
        );
        and(theUser).wasAbleTo(Remove.Lesson());
    }
}