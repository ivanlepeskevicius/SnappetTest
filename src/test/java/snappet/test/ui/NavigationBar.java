package snappet.test.ui;

import snappet.test.model.navMenu;
import net.serenitybdd.screenplay.targets.Target;

public class NavigationBar {
    public static Target page(navMenu page){
        return Target.the(page.name() + " page")
                .locatedBy("//li[@class='{0}']")
                .of(page.label());
    }
}
