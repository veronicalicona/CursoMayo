package Orange.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;

public class PimPage {
	
	private ButtonPages buttonPages;
	
	@FindBy(how = How.ID, using = "firstName")
	private WebElement inputfirstName;	
	
	@FindBy(how = How.ID, using = "lastName")
	private WebElement inputlastName;	
	
		// Esto es un constructor	
		public PimPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.buttonPages = new ButtonPages(driver);
		}
	
	public void llegar() {
		buttonPages.btnPim();
		buttonPages.btnAdd();
	}
	
	public void diligenciarempleyee (String firstname, String lastname ) {
	
		inputfirstName.sendKeys(firstname);
		inputlastName.sendKeys(lastname);
		buttonPages.btnSave();	
						
	}
	
}
