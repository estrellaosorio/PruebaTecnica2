package Store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static Store.userinterface.ProductStoreUserInterface.LOGIN_CORRECTO;

public class LoginCorrecto implements Question<Boolean> {

    private String question;

    public LoginCorrecto(String question){
        this.question = question;
    }
    public static LoginCorrecto ThePage(String question) {
        return new LoginCorrecto(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String inicioCorrecto= Text.of(LOGIN_CORRECTO).viewedBy(actor).asString();
        System.out.println(("Variable Capturada: " + inicioCorrecto));
        if (question.contains(inicioCorrecto)){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
