package snappet.test.model;

import com.google.common.base.MoreObjects;

public class HomePageResults {

    private String Logo;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Logo", Logo)
                .toString();
    }

    public HomePageResults(String Logo) {
        this.Logo = Logo;
    }

    public String getLogo() {
        return Logo;
    }

}
