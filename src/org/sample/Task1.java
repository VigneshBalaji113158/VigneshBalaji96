package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\balaji\\Alerts\\Driver\\chromedriver.exe");
		WebDriver g = new ChromeDriver();
		g.get("http://www.greenstechnologys.com/");
		g.manage().window().maximize();
		JavascriptExecutor jk = (JavascriptExecutor)g;
		WebElement sdown = g.findElement(By.xpath("//h2[contains(text(),'Overall Review')]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", sdown);
		String t = sdown.getText();
		System.out.println(t);
		WebElement sup = g.findElement(By.xpath("//h1[contains(text(),'No 1 Software Training Institutes in Chennai with Placements')]"));
		jk.executeScript("arguments[0].scrollIntoView(false)", sup);
		String t2 = sup.getText();
		System.out.println(t2);
		sup.click();
		
		
		

}
}