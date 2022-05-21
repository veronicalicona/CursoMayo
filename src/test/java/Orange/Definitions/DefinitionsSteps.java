package Orange.Definitions;

import org.openqa.selenium.WebDriver;

import Orange.Page.LeavePage;
import Orange.Page.LoginPage;
import Orange.Page.PimPage;
import Orange.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();

	// llamado a la pagina loginpage
	private LoginPage loginPage = new LoginPage(driver);

	// llamado a la pagina PimPage
	private PimPage PimPage = new PimPage(driver);
	private LeavePage leavePage = new LeavePage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	// @Given("^diligenciar empleado$")
	// public void diligenciar_empleados() {
	// this.conexion = new Conexion();
	// this.driver = this.conexion.abrirNavegador();

	// }
	@And("^diligenciar usuario (.*) y password (.*)$")
	public void diligenciarFormulario(String userName, String contrasena) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.diligenciarFormulario(userName, contrasena);
		// this.PimPage = new PimPage(driver);
		// this.PimPage.llegar();

	}

	@And("^llegar a pim$")
	public void llegar() {
		this.PimPage = new PimPage(driver);
		this.PimPage.llegar();

	}

	@When("^diligenciar nombre (.*) y apellido (.*)$")
	public void diligenciarempleyee(String firstname, String lastname) {
		this.PimPage.diligenciarempleyee(firstname, lastname);

	}

	@And("^Llegar hasta leave$")
	public void llegarLeave() {
		this.leavePage = new LeavePage(driver);
		this.leavePage.llegarLeave();

	}
}