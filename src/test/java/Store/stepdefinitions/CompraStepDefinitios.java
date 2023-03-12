package Store.stepdefinitions;

import Store.questions.CompraExitosa;
import Store.questions.Formulario;
import Store.tasks.Compra;
import Store.tasks.Login;
import Store.tasks.OpenUp;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class CompraStepDefinitios {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Ingresa a la Pagina para comprar$")
    public void ingresaALaPaginaParaComprar() {
        OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.ThePage());
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enProductStore());
    }


    @Cuando("^el usuario agrega un producto al carrito$")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(Compra.enStore());
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.enStore());
    }

    @Entonces("^se realiza la compra y se muestra (.*)$")
    public void seRealizaLaCompraYSeMuestraThankYouForYourPurchase(String mensajeexitoso) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompraExitosa.inThePage(mensajeexitoso)));
    }
}
