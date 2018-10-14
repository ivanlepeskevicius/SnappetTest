package snappet.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MonitorPageElements {

    public static Target Tabs = Target.the("Tabs Activity and Lesson").located(By.className("tab-container"));
    public static Target MonitorInstructionMsg = Target.the("instruction message").located(By.className("instruction-msg"));
    public static Target TabHeader = Target.the("Tab header").located(By.className("sticky-header-content"));

}
