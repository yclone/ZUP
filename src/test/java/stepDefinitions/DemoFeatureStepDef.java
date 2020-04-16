package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import runnerFiles.DriverFactory;
import runnerFiles.Shared;
import stepsActions.DemoFeatureStepAct;

public class DemoFeatureStepDef {
	
	WebDriver webDriver = DriverFactory.getDriver();;
	Shared action = new Shared(webDriver);
//	DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
	
	@Dado("que o usuario acesse o site da magazine Luiza pela URL {string}")
	public void que_o_usuario_acesse_o_site_da_magazine_Luiza_pela_URL_https_www_magazineluiza_com_br(String url) {
		action.nagevar(url);
	}

	@Quando("digitar no campo de busca o valor {string}")
	public void digitar_no_campo_de_busca_o_valor_hd_ssd(String busca) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitaBusca(busca);
	}

	@Quando("clicar no icone de busca")
	public void clicar_no_icone_de_busca() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);		
		stepAct.clicaBtnBusca();
	}

	@Entao("deve ser retornado busca do produto")
	public void deve_ser_retornado_busca_do_produto() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.validaRetorno();
	}

	@Quando("clicar no produto retornado")
	public void clicar_no_produto_retornado() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.clicaProduto();
	}

	@Quando("adicionar o produto ao carrinho")
	public void adicionar_o_produto_ao_carrinho() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.addProdutoCarrinho();
	}
	    

	@Entao("o produto deve ser inserido no carrinho {string}")
	public void o_produto_deve_ser_inserido_no_carrinho(String retorno) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.validaRetornoParan(retorno);
	}
	
	@Quando("voltar para a home do site")
	public void voltar_para_a_home_do_site() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.clicaHome();
	}

	@Quando("clicar no icone do carrinho")
	public void clicar_no_icone_do_carrinho() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.clicaIconCarrinho();
	}

	@Quando("clicar em remover o item")
	public void clicar_em_remover_o_item() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.remItem();
	}

	@Entao("o produto deve ser removido do carrinho {string}")
	public void o_produto_deve_ser_removido_do_carrinho(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.validaTxtRemove(string);
	}

}
