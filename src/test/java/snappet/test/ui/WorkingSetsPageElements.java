package snappet.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WorkingSetsPageElements {

    public static Target StickyHeader = Target.the("Sticky Header").located(By.className("sticky-header"));
    public static Target AddObjectiveBtn = Target.the("Add learning objective for class btn").located(By.xpath("//a[@class='btn btn-secondary btn-icon-right']"));
    public static Target AutomaticUpdateBtn = Target.the("Automatic Update btn").located(By.xpath("//a[@class='btn btn-primary btn-icon-right refresh']"));
    public static Target InstructionsMsg = Target.the("Instructions message").located(By.className("instruction-msg"));
    public static Target TableHeaders = Target.the("Table headers").located(By.className("grid-row"));
    public static Target TableRow = Target.the("Table row").located(By.className("grid-row-inner"));

}
