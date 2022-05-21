package Orange.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;


//Esto es una clase
public class LoginPage {
	
	private ButtonPages buttonPages;
	
	@FindBy(how = How.ID, using = "txtUsername")
	private WebElement inputUserName;

	@FindBy(how = How.ID, using = "txtPassword")
	private WebElement inputContrasena;
	
	// Esto es un constructor	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
    }
	//Esto es un método
	public void diligenciarFormulario(String userName, String contrasena) {
		inputUserName.sendKeys(userName);
		inputContrasena.sendKeys(contrasena);
		buttonPages.btnLogin();	
		
		
	}
}