package Store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import Store.userinterface.AbrirPagina;

public class OpenUp implements Task {
    private AbrirPagina producstore;

    public static OpenUp ThePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(producstore));
    }
}
