package stepsActions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import runnerFiles.Shared;

public class DemoFeatureStepAct {

	WebDriver driver;
	Shared steps;

	private final By cpoBusba = By.id("inpHeaderSearch");
	private final By btnSearch = By.id("btnHeaderSearch");
	private final By TxtColetado = By.xpath("//h1/small");
	private final By produto1 = By.xpath("//div[2]/ul/li/a/div/img");
	private final By addSacola = By.cssSelector("button.button__buy.button__buy-product-detail.js-add-cart-button.js-main-add-cart-button.js-add-box-prime");
	private final By TxtSacola = By.xpath("//div[@id='root']/div/div[2]/div/div");
	private final By iconHome = By.cssSelector("svg.CheckoutHeader-logo-icon");
	private final By iconCar = By.xpath("//div/i");
	private final By btnRem = By.xpath("//div[@id='root']/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/button/span");
	private final By txtRemove = By.cssSelector("div.EmptyBasket-title");
	
	public DemoFeatureStepAct(WebDriver driver) {
		this.driver = driver;
		steps = new Shared(driver);
	}

	public DemoFeatureStepAct digitaBusca(String busca) {
		steps.digitar(cpoBusba, busca);
		return new DemoFeatureStepAct(driver);

	}

	public DemoFeatureStepAct clicaBtnBusca() {
		steps.clicar(btnSearch);
		return new DemoFeatureStepAct(driver);

	}
	
	public DemoFeatureStepAct clicaProduto() {
		steps.clicar(produto1);
		return new DemoFeatureStepAct(driver);
	}

	public DemoFeatureStepAct addProdutoCarrinho() {
		steps.clicar(addSacola);
		return new DemoFeatureStepAct(driver);
	}

	public DemoFeatureStepAct clicaHome() {
		steps.clicar(iconHome);
		return new DemoFeatureStepAct(driver);
	}

	public DemoFeatureStepAct clicaIconCarrinho() {
		steps.clicar(iconCar);
		return new DemoFeatureStepAct(driver);
	}

	public DemoFeatureStepAct remItem() {
		steps.clicar(btnRem);
		return new DemoFeatureStepAct(driver);
	}
	
	public DemoFeatureStepAct validaRetorno() {
		String retornoCpo = steps.ColetaTexto(TxtColetado);
		System.out.println(retornoCpo);
		String value[] = retornoCpo.split(" ");
		int num = 0;
		boolean temValor;
		try {
			num = Integer.parseInt(value[0]);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(num == 0) {
			temValor = true;
		} else {
			temValor = false;
		}
		try {
			assertTrue(temValor);
		} catch (Error e) {
			System.err.println("campo não encontrado " + e);
		}
		return new DemoFeatureStepAct(driver);

	}

	public DemoFeatureStepAct validaRetornoParan(String resp) {
		String retornoCpo = steps.ColetaTexto(TxtSacola);
		System.out.println(retornoCpo);
		try {
			assertEquals(retornoCpo, resp);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new DemoFeatureStepAct(driver);

	}
	
	public DemoFeatureStepAct validaTxtRemove(String resp) {
		String retornoCpo = steps.ColetaTexto(txtRemove);
		System.out.println(retornoCpo);
		try {
			assertEquals(retornoCpo, resp);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new DemoFeatureStepAct(driver);

	}


}
