package runnerFiles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shared extends Wait {

	WebDriver driver;
	public static WebDriverWait wait;

	public Shared(WebDriver driver) {
		this.driver = driver;
		setDriver(driver);
		wait = new WebDriverWait(driver, 60);
	}
	
	public Shared nagevar(String url) {
	    driver.switchTo().defaultContent();
	    driver.manage().deleteAllCookies();
	    driver.navigate().to(url);
	    return new Shared(driver);
	}

	public Shared digitar(By iArg, String arg) {
		arg = arg.trim();
		wait.until(ExpectedConditions.elementToBeClickable(iArg));
		WebElement element = driver.findElement(iArg);
		element.click();
		element.clear();
		element.sendKeys(Keys.HOME);
		element.sendKeys(arg);
		element.sendKeys(Keys.TAB);
		return new Shared(driver);
	}

	public Shared clicar(By item) {
		wait.until(ExpectedConditions.elementToBeClickable(item));
		driver.switchTo().defaultContent();
		WebElement itemDig = driver.findElement(item);
		itemDig.click();
		waitUntilJQueryReady();
		return new Shared(driver);
	}
	
	public Shared clicarEAceitaAlerta(By item) {
	    wait.until(ExpectedConditions.elementToBeClickable(item));
	    driver.switchTo().defaultContent();
	    WebElement itemDig = driver.findElement(item);
	    itemDig.click();
	    AceitaAlert();
	    return new Shared(driver);
	}
	
	public Shared AceitaAlert() {
	    try {
	        wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
	        alert.accept();
	    } catch (Exception e) {
	        // TODO: handle exception
	    }
	    return new Shared(driver);
	}
	
	public boolean ValExistTexto(By campo) {
	    String textoColetado = null;
	    JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
	    textoColetado = (String) jse.executeScript("return arguments[0].value;",
	            DriverFactory.getDriver().findElement(campo));
	    System.out.println("Texto coletado : " + textoColetado);
	    if (!textoColetado.equals("")) {
	        return true;
	    } else {
	        return false;
	    }
	}

	public String ColetaTexto(By campo) {
		 wait.until(ExpectedConditions.elementToBeClickable(campo));
	    String textoColetado = DriverFactory.getDriver().findElement(campo).getText();
	    System.out.println("Texto coletado : " + textoColetado);
	    return textoColetado;
	}

}
