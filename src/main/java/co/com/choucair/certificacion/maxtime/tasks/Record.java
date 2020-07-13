package co.com.choucair.certificacion.maxtime.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Record implements Task {

    public static Record theHours() {
        return Tasks.instrumented(Record.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
