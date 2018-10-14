package snappet.test.questions;

import snappet.test.model.HomePageResults;
import snappet.test.ui.HeaderElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

class HomePageQuestion implements Question<HomePageResults> {

    @Override
    public HomePageResults answeredBy(Actor actor) {

        String Logo = Value.of(HeaderElements.Logo)
                .viewedBy(actor)
                .value();

        return new HomePageResults(
                Logo
                );
    }
}
