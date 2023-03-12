package Store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static Store.userinterface.ProductStoreUserInterface.*;

public class Login implements Task {


    public static Login enProductStore() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on((INICIO_SESION)));
        actor.attemptsTo(Enter.theValue("pruebaqa123").into(INPUT_USER));
        actor.attemptsTo(Enter.theValue("123456789").into(INPUT_PASS));
        actor.attemptsTo(Click.on(BOTTON_LOGIN));
    }
}
