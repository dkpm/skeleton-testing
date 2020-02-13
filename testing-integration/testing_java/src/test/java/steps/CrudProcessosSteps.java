package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import definition.CrudProcessos;
import org.junit.Assert;
import support.RESTSupport;

public class CrudProcessosSteps {
    @Dado("^que o usuário está na página de processos$")
    public void queOUsuárioEstáNaPáginaDeProcessos() {

        CrudProcessos.clearFields();
    }

    @E("^o usuário informa no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuárioInformaNoCampoOValor(String campo, String valor) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       CrudProcessos.addFields(campo, valor);
    }

    @Quando("^o usuário clicar em salvar$")
    public void oUsuárioClicarEmSalvar() {
        RESTSupport.executePost(CrudProcessos.getEndPoint(), CrudProcessos.getFields());

    }

    @Então("^o usuário deveria receber uma mensagem de \"([^\"]*)\"$")
    public void oUsuárioDeveriaReceberUmaMensagemDe(String message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Integer codeAct = RESTSupport.getResponseCode();
        Integer codeExp = 201;
                if(message.equals("sucesso")){
                    codeExp = 201;
                }

        Assert.assertEquals(codeExp, codeAct);
    }

    @Dado("^que o usuario esta na pagina de processos$")
    public void queOUsuarioEstaNaPaginaDeProcessos() {

    }

    @E("^o usuário gostaria de visualizar o preocesso com id <id>$")
    public void oUsuárioGostariaDeVisualizarOPreocessoComIdId(int id) {
        CrudProcessos.setLastId(Integer.toString(id));
    }

    @Quando("^o usuário clicar em visualizar$")
    public void oUsuárioClicarEmVisualizar(String campo, String valor) {
        RESTSupport.executeGet(CrudProcessos.getEndPoint() + CrudProcessos.getLastId());
    }
}
