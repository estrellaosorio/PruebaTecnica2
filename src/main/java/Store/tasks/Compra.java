package Store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import static Store.userinterface.ProductStoreUserInterface.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Compra implements Task {


    public static Compra enStore() {
        return Tasks.instrumented(Compra.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(SELECCIONAR_CELULAR, isClickable()));
        actor.attemptsTo(WaitUntil.the(SELECCIONAR_CELULAR, isVisible()));
        actor.attemptsTo(Click.on(SELECCIONAR_CELULAR));
        actor.attemptsTo(Click.on(ADD_CART));
        actor.attemptsTo(Click.on(CLICK_CART));
        actor.attemptsTo(Click.on(COMPRAR_ORDEN));

    }
}
