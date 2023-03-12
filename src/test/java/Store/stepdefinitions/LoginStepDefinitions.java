package Store.stepdefinitions;

import Store.questions.LoginCorrecto;
import Store.tasks.Login;
import Store.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario quiere hacer login en la pagina$")
    public void queElUsuarioQuiereHacerLoginEnLaPagina() {
        OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.ThePage());
    }
    @Cuando("^Ingresa a Pagina Store con usuario y contraseña$")
    public void ingresaAPaginaStoreConUsuarioYContraseña(){
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enProductStore());
    }

    @Entonces("^realiza el login y se muestra (.*)$")
    public void realizaElLoginYSeMuestraWelcomePruebaqa(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginCorrecto.ThePage(question)));
    }
}
