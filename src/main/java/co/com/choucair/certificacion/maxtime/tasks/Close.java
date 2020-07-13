package co.com.choucair.certificacion.maxtime.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Close implements Task
{

    public static Close theDay()
    {
        return Tasks.instrumented(Close.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
