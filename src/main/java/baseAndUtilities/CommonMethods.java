package baseAndUtilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class CommonMethods extends Base {

	public void countOfValues() {
		try {
			List<WebElement> lables = driver.findElements(By.id("lbl_val"));
			List<WebElement> values = driver.findElements(By.id("txt_val"));

			Assert.assertEquals(lables, values);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void valueGreaterThanZero() {
		try {
		List<WebElement> values = driver.findElements(By.xpath("//*[id='lbl_val']"));
		for (int i = 0; i <= values.size(); i++) {
			if (values.get(i).getText() > 0) {
				System.out.println(" Values are greater than Zero ");
			} else {
				System.out.println(" Values are greater than Zero ");
			}
		}
		}
		catch (Exception e) {
	          e.printStackTrace();
	      }
	}

	public void totalBalanceCorrect() {
		try {
        List<WebElement> txt_values = driver.findElements(By.xpath("txt_val"));

        int Exp_totalVal = 1000000;
        int totalVal = Integer.parseInt(txt_values);

        for(int i=0;i<txt_values.size();i++)
        {
            int sum = i+totalVal;
            System.out.println("Total is:"+sum);
        }
        Assert.assertEquals(Exp_totalVal, totalVal);
		}
		catch (Exception e) {
	          e.printStackTrace();
	      }
	}

	public void valuesFormatCurrency() {
		try {
		WebElement element = driver.findElement(By.id("txt_val_1"));
		String text = element.getAttribute("value");
		System.out.println(text);

		if ((text).contains("$")) {
			System.out.println("Formatted as currencies");
		} else {
			System.out.println("Not Formatted as currencies");
		}
		}
		catch (Exception e) {
	          e.printStackTrace();
	      }
	}
	
	// Total balance is correct
	public void totalBalCorrect() {
		try {
		List<WebElement> values = driver.findElements(By.xpath("contains(text(),'txt_val')"));
		int expetedSum = 1000000;
		int sum = 0;
		for (int i = 0; i < values.size(); i++) 
		{
			sum = sum + i;
		}
		Assert.assertEquals(expetedSum, sum);
			
	}
	catch (Exception e) {
	          e.printStackTrace();
	      }
	}
}
