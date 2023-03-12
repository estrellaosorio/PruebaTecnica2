package Store.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductStoreUserInterface {

    public static final Target INICIO_SESION = Target.the("Clic en Login").located(By.id("login2"));

    public static final Target INPUT_USER =
            Target.the("Ingresa Usuario")
                    .located(By.id("loginusername"));

    public static final Target INPUT_PASS =
            Target.the("Ingresa Contraseña")
                    .located(By.id("loginpassword"));

    public static final Target BOTTON_LOGIN = Target.the("Clic en Log in").
            located(By.xpath("//button[contains(text(), 'Log in')]"));

    public static final Target LOGIN_CORRECTO = Target.the("Se muestra Welcome y el usuario:")
            .located(By.xpath("//a[contains(text(), 'Welcome pruebaqa123')]"));

    public static final Target SELECCIONAR_CELULAR = Target.the("Se selecciona el celular")
            .located(By.xpath("//div[@id='tbodyid']//a[@href='prod.html?idp_=1']"));

    public static final Target ADD_CART = Target.the("Agregar al carrito")
            .located(By.xpath("//a[@onclick='addToCart(1)']"));

    public static final Target CLICK_CART = Target.the("Ir al Carrito")
            .located(By.id("cartur"));

    public static final Target COMPRAR_ORDEN = Target.the("Realizar compra")
            .located(By.xpath("//*[@id='page-wrapper']//button[contains(text(), 'Place Order')]"));

    public static final Target INPUT_NAME = Target.the("Ingresar Nombre")
            .located(By.xpath("//input[@id='name']"));

    public static final Target INPUT_COUNTRY = Target.the("Ingresar Pais")
            .located(By.xpath("//input[@id='country']"));

    public static final Target INPUT_CITY = Target.the("Ingresar Ciudad")
            .located(By.xpath("//input[@id='city']"));

    public static final Target INPUT_CARD = Target.the("Ingresar Numero de Tarjeta de Credito")
            .located(By.xpath("//input[@id='card']"));

    public static final Target INPUT_MONTH = Target.the("Ingresar Mes")
            .located(By.xpath("//input[@id='month']"));

    public static final Target INPUT_YEAR = Target.the("Ingresar Año")
            .located(By.xpath("//input[@id='year']"));

    public static final Target BUTTON_PURSHASE = Target.the("Clic en el boton compra")
            .located(By.xpath("//button[contains(text(), 'Purchase')]"));

    public static final Target MENSAJE_EXITOSO = Target.the("Se muestra mensaje de compra exitosa")
            .located(By.xpath("//h2[contains(text(), 'Thank you for your purchase!')]"));
}
