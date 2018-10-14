package snappet.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateLessonElements {

    public static Target AddLessonWizard = Target.the("Add Leasson wizard").located(By.xpath("//div[@class='inner modal wow-wizard withClose']"));
    public static Target Selector = Target.the("Selector").located(By.className("selection"));
    public static Target NextBtn = Target.the("Next button").located(By.xpath("//a[@class='btn btn-primary']"));
    public static Target ActivateSubject = Target.the("Next button").located(By.xpath("//div[@class='button-bar stretch']"));
    public static Target GradeSelector = Target.the("Grade selector").located(By.className("grade-slider-tick"));
    public static Target SuggestionCard = Target.the("Suggestion cards").located(By.className("card-header"));
    public static Target SubjectName = Target.the("Subject name").located(By.xpath("/html/body/div[4]/div/div/div[1]/div[2]/div/div[1]/input"));
}
