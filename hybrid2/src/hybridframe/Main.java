package hybridframe;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Verify;

public class Main extends Common {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
//location of the excel file
String data[][]=apachefor("D:\\Selenium\\Codes\\exceldata.xlsx");

WebDriver driver =new ChromeDriver();
navigate_to(driver,data[2][6]);
WebElement category= driver.findElement(By.id("nav-link-shopall"));
WebElement men= driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span"));
WebElement shoe= driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[6]/div[2]/div[1]/a[3]/span"));
Actions action=new Actions(driver);
action.moveToElement(category).build().perform();
Thread.sleep(3000);
action.moveToElement(men).build().perform();
Thread.sleep(3000);
action.moveToElement(shoe).click().build().perform();
click_element(driver,data[3][4], data[3][5]);
WebElement size=driver.findElement(By.id("native_dropdown_selected_size_name"));
Select s = new Select(size);
Thread.sleep(3000);
s.selectByIndex(2);
driver.findElement(By.id("add-to-cart-button")).click();
driver.quit();

	}

}