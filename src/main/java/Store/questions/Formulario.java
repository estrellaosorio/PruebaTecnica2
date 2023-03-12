package Store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.InstrumentedTask;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Store.userinterface.ProductStoreUserInterface.*;

public class Formulario implements Task {

    public static Formulario enStore() {
        return new Formulario();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Prueba 1").into(INPUT_NAME));
        actor.attemptsTo(Enter.theValue("Panama").into(INPUT_COUNTRY));
        actor.attemptsTo(Enter.theValue("Panama").into(INPUT_CITY));
        actor.attemptsTo(Enter.theValue("4567345678904563").into(INPUT_CARD));
        actor.attemptsTo(Enter.theValue("Marzo").into(INPUT_MONTH));
        actor.attemptsTo(Enter.theValue("2026").into(INPUT_YEAR));
        actor.attemptsTo(Click.on(BUTTON_PURSHASE));
    }
}