package selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actitimeLogin {
        WebDriver driver;
        @Test
        public void getpsmJobLogs() throws InterruptedException {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\gvidyara.ORADEV\\eclipse-libs\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.get("https://demo.actiplans.com");
                //driver.switchTo().alert().accept();

                Assert.assertTrue(waitForElement("//*[@id=\"loginButton\"]/div"));

                CharSequence a="admin";
				driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(a);
				driver.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
				
				driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				//Assert.assertTrue(waitForPageTitle("actiPLANS - My Schedule"));
				
				WebDriverWait wait = new WebDriverWait(driver, 40);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[1]/div/div[2]/img")));
				//Assert.assertTrue(waitForElement("//*[@id=\"topnav\"]/tbody/tr/td[1]/div/div[2]/img"));

//                System.out.println(bodyText);
//                Assert.assertTrue(bodyText.contains("Dynamically Loaded Page Elements"), "Text not found!");
//                
//                driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
//
//                for (int second = 0;; second++) {
//                	System.out.println(second);
//                    if (second >= 60) break;
//                    try { if (driver.findElement(By.xpath("//*[@id=\\\"finish\\\"]/h4")).isDisplayed()) break; } catch (Exception e) {}
//                    Thread.sleep(1000);
//                }
//                
//                Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed());
//                bodyText = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).getText();
//                System.out.println(bodyText);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"logoutLink\"]")));
				
				driver.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
				Assert.assertTrue(waitForElement("//*[@id=\"loginButton\"]/div"));
                //driver.quit();

        }
        
        public boolean waitForElement(String myxpath) {
        	boolean status=false;
        	System.out.println("Waiting for -> "+myxpath);
            for (int second = 0;; second++) {
            	System.out.println(second);
                if (second >= 60) break;
                try { if (driver.findElement(By.xpath(myxpath)).isDisplayed()) {
                	status=true;
                	break; 
                	}} catch (Exception e) {}
                }
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}       	
        	
        	return status;
        }
        
        public boolean waitForPageTitle(String mytitle) {
        	boolean status=false;
        	System.out.println("Waiting for -> "+mytitle);
            for (int second = 0;; second++) {
            	String title=driver.getTitle();
            	System.out.println(second);
            	System.out.println(title);
                if (second >= 60) break;
                if (mytitle.equals(title)) {
                	status=true;
                	break; 
                	}
                }
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}       	
        	       	
        	return status;
        }


}