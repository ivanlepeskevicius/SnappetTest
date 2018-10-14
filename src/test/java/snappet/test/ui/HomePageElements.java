package snappet.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElements {

    public static Target HeadingTxt = Target.the("Teacher2First Teacher2Last text").located(By.className("heading"));
    public static Target MainStats = Target.the("Main stats").located(By.xpath("//div[@class='main-stats panel']"));
    public static Target AddLesson = Target.the("Activate subject block").located(By.className("add-first-lesson"));
    public static Target LessonCard = Target.the("Lesson card").located(By.className("panel-card"));
    public static Target WelcomeMsg = Target.the("Instruction welcome message").located(By.className("instruction-msg"));
    public static Target SuccessPopup = Target.the("Success message popup").located(By.className("ui-pnotify-text"));
}
