import org.junit.Assert;
import org.junit.Test;

public class LoginServiceTest {

    //Esta classe abrange o CT001 da sessão 5.1.1 do Plano de Testes (Lucas)

    @Test
    public void loginComUsuarioValido() {

        //Arrange
        LoginService service = new LoginService();

        //Act
        boolean resultado = service.realizarLogin("lucasteste@email.com", "123456");

        //Assert
        Assert.assertEquals ("Sucesso no Login",true,resultado);
    }
}
