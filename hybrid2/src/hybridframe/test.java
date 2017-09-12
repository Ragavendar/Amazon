package hybridframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver a= new ChromeDriver();

a.get("https://www.amazon.in/gp/product/B0749N83M8/ref=s9_acsd_newrz_hd_bw_b2AErhH_c_x_w?pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s=merchandised-search-8&pf_rd_r=SSHTB6JBY968WECHSB2R&pf_rd_t=101&pf_rd_p=761f1815-16fe-5723-bd56-e8f1fa0931ae&pf_rd_i=1983572031&th=1&psc=1");

WebElement size=a.findElement(By.id("native_dropdown_selected_size_name"));
Select s = new Select(size);
Thread.sleep(3000);
s.selectByIndex(1);


	}

}
