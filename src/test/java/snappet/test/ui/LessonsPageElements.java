package snappet.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LessonsPageElements {

    public static Target PanelControls = Target.the("Panel Controls").located(By.xpath("//div[@class='panel controls']"));
    public static Target Instructions = Target.the("Instructions message").located(By.xpath("//div[@class='instruction-msg balloon']"));
    public static Target PannelContainer = Target.the("Pannel container").located(By.className("loader-ctn"));
    public static Target AddNewBtn = Target.the("Instructions message").located(By.xpath("//div[@class='panel add-new-panel']"));
}
