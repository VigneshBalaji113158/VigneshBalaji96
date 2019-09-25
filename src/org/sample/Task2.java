package org.sample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\balaji\\JavaScript\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get(" https://www.facebook.com/\r\n");
		d.manage().window().maximize();
		JavascriptExecutor jk = (JavascriptExecutor)d;
		WebElement username = d.findElement(By.id("email"));
		jk.executeScript("arguments[0].setAttribute('value','9942492962')", username);
		String name =(String) jk.executeScript("return arguments[0].getAttribute('value')", username);
		System.out.println(name);
		WebElement password = d.findElement(By.id("pass"));
		jk.executeScript("arguments[0].setAttribute('value','bala')", password);
		String pass =(String) jk.executeScript("return arguments[0].getAttribute('value')", password);
		System.out.println(pass);
		WebElement login = d.findElement(By.xpath("//input[@value='Log In']"));
		jk.executeScript("arguments[0].click()", login);
		
		
		
		
	}

}
