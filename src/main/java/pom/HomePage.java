package pom;

import java.util.ArrayList;
import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTestClass;
import utilities.Excelutil_POI;

public class HomePage extends BaseTestClass{
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	

//	@FindBy(xpath = "//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[7]/a/span[2]")
//	public WebElement cabs;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[1]/ul/li[6]/a/span")
	public WebElement cabs;
	
//	@FindBy(xpath = "//*[@id='root']/div/div[2]/div/div/div[1]/ul/li[1]/span")
//	public WebElement oneway;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/div/div/ul/li[1]/a")
	public WebElement oneway;
	

//	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span")
//	public WebElement from;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[1]/div[1]/p")
	public WebElement from;
	
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
//	public WebElement fromInput;
    
    @FindBy(xpath = "//*[@id=\"gosuggest_inputL\"]")
   	public WebElement fromInput;
    
//    @FindBy(xpath = "//*[@id=\"react-autowhatever-1-section-1-item-1\"]/div/p/span")
//	public WebElement fromOption;
	
    @FindBy(xpath = "//*[@id=\"react-autosuggest-1-suggestion--0\"]/div")
 	public WebElement fromOption;
    
//	@FindBy(xpath = "//*[@id='root']/div/div[2]/div/div/div[2]/div/div[2]/label/span")
//	public WebElement to;
	
	@FindBy(xpath = "//*[@id=\"destText\"]")
	public WebElement to;

//	@FindBy(xpath = "//*[@id='root']/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")
//	public WebElement toInput;
	
	@FindBy(xpath = "//*[@id=\"gosuggest_inputL\"]")
	public WebElement toInput;

//	@FindBy(xpath = "//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/p/span")
//	public WebElement toOption;
	
	@FindBy(xpath = "//*[@id=\"react-autosuggest-1-suggestion--0\"]/div")
	public WebElement toOption;
	
//	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label")
//	public WebElement dateField;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[2]/div/div[1]/div/input")
	public WebElement dateField;
	
	
//	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[7]")
//	public WebElement date;
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[2]/div/div[1]/div/div/div/div/div/div[1]/span[2]")
	public WebElement nextdate;
	
//	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[2]/div/div[1]/div/div/div/div/div/div[2]/div/div[3]/div[4]/div[7]")
	public WebElement date;
	
//	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/label/p")
//	public WebElement TimeField;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[2]/div/div[2]/div/p/select")
	public WebElement TimeField;
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[2]/div/div[2]/div/p/select/option[5]")
	public WebElement Time;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div[2]/p/button")
	public WebElement nextone;
	
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[3]/button")
	public WebElement searchButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[3]/label/p[1]")
	public WebElement suv;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/div[2]/section[2]/div[2]/span/i")
	public WebElement contactdetails;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[1]/div[2]/div/label[1]/input")
	public WebElement title;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[1]/div[3]/input")
	public WebElement Name;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[2]/p/input")
	public WebElement mobile;
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[3]/p/input")
	public WebElement email;
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[5]/p/button/span")
	public WebElement continueagain;
	
	@FindBy(xpath = "//*[@id=\"callBlock\"]")
	public WebElement pay;
//	public void LoginBut() {
//		try {
//		logibtn.click();
//		Thread.sleep(3000);
//		}
//		catch(Exception e)
//		{
//			e.getMessage();
//		}
//		}
//	public void fbBut() {
//		try {
//		facebook.click();
//		Thread.sleep(3000);
//		}
//		catch(Exception e)
//		{
//			e.getMessage();
//		}
//		}
//	
//	public void Emailfield(String email) {
//		try {
//			emailfield.sendKeys(email);
//			Thread.sleep(3000);
//			} catch (Exception e) {
//			e.getMessage();
//		}
//	}
//	
//	
//	public void Pswdfield(String password) {
//		try {
//			passfield.sendKeys(password);
//			Thread.sleep(3000);
//			} catch (Exception e) {
//			e.getMessage();
//		}
//	}
//	
//	public void Login() {
//		try {
//		login.click();
//		Thread.sleep(3000);
//		}
//		catch(Exception e)
//		{
//			e.getMessage();
//		}
//		}
	
	
	public void selectCab() {
		try {
		cabs.click();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		}
	public void selectOneway() {
		try {
		oneway.click();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		}
	
	public void enterOrigin(String Origin) {
		try {
			from.click();
			fromInput.sendKeys(Origin);
			Thread.sleep(5000);
			fromOption.click();
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void enterDestination(String destination) {
		try {
			to.click();
			toInput.sendKeys(destination);
			Thread.sleep(5000);
			toOption.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void dateSelect() {
		try {
			dateField.click();
			nextdate.click();
			date.click();
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	public void timeSelect() {
		try {
			TimeField.click();
			Time.click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public void Nextone() {
		try {
			nextone.click();
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}


	public void clickbut() {
		try {
			searchButton.click();
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	
	public void suvkbut() {
		try {
			suv.click();
			
			Thread.sleep(3000);
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public void contactDet() {
		try {
			contactdetails.click();
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public void contacttitle() {
		try {
			title.click();
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public void entername(String name) {
		try {
			
			Name.sendKeys(name);
			Thread.sleep(5000);
		
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void entermobile(String Mobile) {
		try {
			
			mobile.sendKeys(Mobile);
			Thread.sleep(5000);
		
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void enteremail(String Email) {
		try {
			
			email.sendKeys(Email);
			Thread.sleep(5000);
		
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	
	public void continueagain12() {
		try {
			
			continueagain.click();
			Thread.sleep(3000);
		
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void Paynow() {
		try {
			
			pay.click();
			Thread.sleep(3000);
		
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	}




	

  



