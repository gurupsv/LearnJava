package selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class psmJobLogsUI {
	WebDriver driver;
	@Test
	public void getpsmJobLogs() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/GuruprasadSV/workspace/lib/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://weblogic:welcome1@slc05ale.us.oracle.com:7103/paas/api/v1.1/job/opcwlaasqa-sitea/2857");
		driver.switchTo().alert().accept();
		
	    for (int second = 0;; second++) {
	    	if (second >= 60) break;
	    	try { if ("Succeeded".equals(driver.findElement(By.xpath("//tr[7]/td")).getText())) break; } catch (Exception e) {}
	    	Thread.sleep(1000);
	    }
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(pageLoadCondition);
        
		String bodyText = driver.findElement(By.xpath("//pre[3]")).getText();
		System.out.println(bodyText);
		Assert.assertTrue(bodyText.contains("guruprasad.vidyaranyapura@oracle.com"), "Text not found!");
		driver.quit();
		
	}
	

}
