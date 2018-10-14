package snappet.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class PanelLessonElements {

    public static Target EditBtn = Target.the("Edit button").located(By.xpath("//a[@class='btn btn-txt']"));
    public static Target EditionPanel = Target.the("Lesson edition panel").located(By.xpath("//div[@class='panel-card secondary']"));
    public static Target CancelBtn = Target.the("Cancel button").located(By.xpath("/html/body/div[1]/article/div/div/subjectgroups-panel/div/subjectgroup-info-block[1]/div/div/div[5]/button[1]"));
    public static Target ChangePupilsBtn = Target.the("Change pupils button").located(By.className("change-pupils"));
    public static Target LessonPlanSelector = Target.the("Lesson Plan Selector").located(By.xpath("//class[@class='btn btn-default btn-more']"));
    public static Target GradeSelector = Target.the("Grade selector").located(By.className("selection"));
    public static Target GradeOption = Target.the("first grade option").located(By.className("select2-results__option"));
    public static Target SubjectName = Target.the("Subject name").located(By.xpath("/html/body/div[1]/article/div/div/subjectgroups-panel/div/subjectgroup-info-block/div/div/div[1]/input"));
    public static Target RemoveBtn = Target.the("Remove button").located(By.xpath("//button[@class='btn btn-txt btn-txt-delete']"));
    public static Target SaveBtn = Target.the("Save button").located(By.xpath("/html/body/div[1]/article/div/div/subjectgroups-panel/div/subjectgroup-info-block/div/div/div[5]/button[2]"));
    public static Target PlanName = Target.the("Plan name selector").located(By.className("ep-name"));
    public static Target RemoveMsg = Target.the("Remove confirmation message").located(By.xpath("//div[@class='inner modal dialog alert withTitle withClose']"));
    public static Target CancelConfirm = Target.the("Cancel remove button").located(By.xpath("/html/body/div[3]/div/div[2]/button[1]"));
    public static Target RemoveConfirm = Target.the("Remove confirmation button").located(By.xpath("/html/body/div[3]/div/div[2]/button[2]"));
    public static Target CardText = Target.the("Lesson name").located(By.className("panel-card-heading-text-inner"));
}
