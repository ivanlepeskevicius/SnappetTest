package snappet.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HeaderElements {

    public static Target Logo = Target.the("Snappet logo").located(By.className("logo"));
    public static Target Home = Target.the("Home nav").located(By.className("home"));
    public static Target Lessons = Target.the("Lessons nav").located(By.className("lessons"));
    public static Target WorkingSet = Target.the("Working Set nav").located(By.className("workingset"));
    public static Target Monitor = Target.the("Monitor nav").located(By.className("monitor"));
    public static Target Reports = Target.the("Reports nav").located(By.className("reports"));

}
