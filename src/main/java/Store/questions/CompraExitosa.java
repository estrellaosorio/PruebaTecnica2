package Store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Store.userinterface.ProductStoreUserInterface.MENSAJE_EXITOSO;

public class CompraExitosa implements Question<Boolean> {

    private String mensajeexitoso;

    public CompraExitosa(String mensajeexitoso){
        this.mensajeexitoso = mensajeexitoso;
    }

    public static CompraExitosa inThePage(String mensajeexitoso) {
        return new CompraExitosa(mensajeexitoso);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(MENSAJE_EXITOSO)
                .viewedBy(actor)
                .asString()
                .equals(mensajeexitoso);
    }
}
