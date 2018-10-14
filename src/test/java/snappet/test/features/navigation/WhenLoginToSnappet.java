package snappet.test.features.navigation;


import snappet.test.tasks.OpenTheSnappetHomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import snappet.test.tasks.Log;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.containsString;
import static snappet.test.ui.HeaderElements.*;

@RunWith(SerenityRunner.class)
public class WhenLoginToSnappet {

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
    public void Login(){
        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);

        when(theUser).attemptsTo(Log.In());

        then(theUser).should(seeThat(TheWebPage.title(),
                containsString("Snappet")));

        and(theUser).should(
                seeThat(the(Logo), isPresent()),
                seeThat(the(Home), isPresent()),
                seeThat(the(Lessons), isPresent()),
                seeThat(the(WorkingSet), isPresent()),
                seeThat(the(Monitor), isPresent()),
                seeThat(the(Reports), isPresent())
        );

    }

}

