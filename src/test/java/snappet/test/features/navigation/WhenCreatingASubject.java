package snappet.test.features.navigation;

import snappet.test.tasks.Create;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import snappet.test.tasks.Log;
import snappet.test.tasks.OpenTheSnappetHomePage;
import snappet.test.ui.HomePageElements;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

@RunWith(SerenityRunner.class)
public class WhenCreatingASubject {

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
    public void createALesson(){
        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);
        andThat(theUser).wasAbleTo(Log.In());

        when(theUser).attemptsTo(
                Create.Lesson()
        );

        then(theUser).should(
                seeThat(the(HomePageElements.LessonCard), isPresent())
        );

    }

}