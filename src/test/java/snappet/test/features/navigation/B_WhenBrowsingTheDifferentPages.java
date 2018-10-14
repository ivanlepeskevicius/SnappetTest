package snappet.test.features.navigation;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import snappet.test.tasks.Log;
import snappet.test.tasks.NavigateTo;
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
import snappet.test.tasks.OpenTheSnappetHomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.containsString;
import static snappet.test.model.navMenu.*;
import static snappet.test.ui.HomePageElements.*;
import static snappet.test.ui.LessonsPageElements.*;
import static snappet.test.ui.MonitorPageElements.*;
import static snappet.test.ui.ReportsPageElements.*;
import static snappet.test.ui.WorkingSetsPageElements.*;



@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class B_WhenBrowsingTheDifferentPages {

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
    public void shouldBeAbleToViewTheLessonsPage(){

        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);
        andThat(theUser).wasAbleTo(Log.In());

        when(theUser).attemptsTo(NavigateTo.thePage(Lessons));

        then(theUser).should(seeThat(TheWebPage.title(),containsString("Snappet")));
        andThat(theUser).should(
                seeThat(the(Instructions), isPresent()),
                seeThat(the(PanelControls), isNotVisible()),
                seeThat(the(PannelContainer), isNotVisible()),
                seeThat(the(AddNewBtn), isNotVisible())
        );

    }

    @Test
    public void shouldBeAbleToViewTheWorkingSetsPage(){

        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);
        andThat(theUser).wasAbleTo(Log.In());

        when(theUser).attemptsTo(NavigateTo.thePage(WorkingSets));

        then(theUser).should(seeThat(TheWebPage.title(),containsString("Snappet")));
        andThat(theUser).should(
                seeThat(the(StickyHeader), isPresent()),
                seeThat(the(AddObjectiveBtn), isNotVisible()),
                seeThat(the(AutomaticUpdateBtn), isNotVisible()),
                seeThat(the(InstructionsMsg), isPresent()),
                seeThat(the(TableHeaders), isNotVisible()),
                seeThat(the(TableRow), isNotVisible())
        );
    }

    @Test
    public void shouldBeAbleToViewTheMonitorPage(){

        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);
        andThat(theUser).wasAbleTo(Log.In());

        when(theUser).attemptsTo(NavigateTo.thePage(Monitor));

        then(theUser).should(seeThat(TheWebPage.title(),containsString("Snappet")));
        andThat(theUser).should(
                seeThat(the(MonitorInstructionMsg), isPresent()),
                seeThat(the(Tabs), isPresent()),
                seeThat(the(TabHeader), isPresent())
        );
    }

    @Test
    public void shouldBeAbleToViewTheReportsPage(){

        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);
        andThat(theUser).wasAbleTo(Log.In());

        when(theUser).attemptsTo(NavigateTo.thePage(Reports));

        then(theUser).should(seeThat(TheWebPage.title(),containsString("Snappet")));
        and(theUser).should(
                seeThat(the(PanelTitle), isPresent()),
                seeThat(the(ReportsInstructionMsg), isPresent()),
                seeThat(the(Controls), isNotVisible()),
                seeThat(the(Data), isNotVisible())
        );
    }

    @Test
    public void shouldBeAbleToViewTheHomePage(){

        givenThat(theUser).wasAbleTo(openTheSnappetHomePage);
        andThat(theUser).wasAbleTo(Log.In());

        when(theUser).attemptsTo(NavigateTo.thePage(Home));

        then(theUser).should(seeThat(TheWebPage.title(),containsString("Snappet")));
        and(theUser).should(
                seeThat(the(HeadingTxt), isPresent()),
                seeThat(the(MainStats), isPresent()),
                seeThat(the(AddLesson), isPresent()),
                seeThat(the(WelcomeMsg), isPresent()),
                seeThat(the(LessonCard), isNotVisible())
        );
    }
}
