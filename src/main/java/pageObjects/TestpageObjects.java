package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestpageObjects {
	public WebDriver driver;

	By lable1 = By.id("lbl_val_1");
	By lable2 = By.id("lbl_val_2");
	By lable3 = By.id("lbl_val_3");
	By lable4 = By.id("lbl_val_4");
	By lable5 = By.id("lbl_val_5");
	By lbl_TotalBal = By.id("lbl_ttl_val");

	By text1 = By.id("txt_val_1");
	By text2 = By.id("txt_val_2");
	By text3 = By.id("txt_val_3");
	By text4 = By.id("txt_val_4");
	By text5 = By.id("txt_val_5");
	By txt_TotalBalValue = By.id("txt_ttl_val");

	public TestpageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(text1);
	}
	
	public WebElement getLogin1() {
		return driver.findElement(text1);
	}
	
	public WebElement getLogin2() {
		return driver.findElement(text1);
	}
	
	public WebElement getLogin3() {
		return driver.findElement(text1);
	}

}