package co.com.choucair.certificacion.maxtime.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class Answer  implements Question<Boolean> {
    public static Answer toThe() {
        return new Answer();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
