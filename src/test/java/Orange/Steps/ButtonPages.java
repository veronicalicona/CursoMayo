package Orange.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
	
	@FindBy(how = How.ID, using = "btnLogin")
	private WebElement btnLogin;

	@FindBy(how = How.ID, using = "menu_pim_viewPimModule")
	private WebElement btnPim;
	
	@FindBy(how = How.ID, using = "btnAdd")
	private WebElement btnAdd;
	
	@FindBy(how = How.ID, using = "btnSave")
	private WebElement btnSave;
	
	@FindBy(how = How.ID, using = "menu_leave_viewLeaveModule")
	private WebElement btnLeave;
	
	
	public ButtonPages(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//Esto es un metodo
	public void btnLogin() {
		btnLogin.click();
	
		
	}
	//Esto es un metodo
		public void btnPim() {
			btnPim.click();
		}
		
	//Esto es un metodo
		public void btnAdd() {
			btnAdd.click();
			
		}
		
		//Esto es un metodo
		public void btnSave() {
			btnSave.click();
			
		}
		//Esto es un metodo
				public void btnLeave() {
					btnLeave.click();
					
				}
}