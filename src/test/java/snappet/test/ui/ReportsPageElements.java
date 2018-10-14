package snappet.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReportsPageElements {

    public static Target PanelTitle = Target.the("Panel Title").located(By.xpath("//div[@class='panel title']"));
    public static Target ReportsInstructionMsg = Target.the("Instruction message").located(By.xpath("//div[@class='instruction-msg balloon']"));
    public static Target Controls = Target.the("Panel controls").located(By.className("controls"));
    public static Target Data = Target.the("Panel Data").located(By.className("data-container"));

}
