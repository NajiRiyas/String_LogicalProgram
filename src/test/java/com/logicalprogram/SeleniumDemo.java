package com.logicalprogram;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	public void lnt() {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lntecc.com/");

		WebElement findElement = driver.findElement(By.xpath("(//a[contains(text(),'We Build')])[2]"));		
		Actions action = new Actions(driver);
		action.moveToElement(findElement).perform();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu webulid')]"));
		for(int i=0; i<findElements.size(); i++) {
			WebElement element = findElements.get(i);
			String text = element.getText();
			System.out.println(text);

		}

	}
	public void window() {

		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lntecc.com/");
		String parantwindowid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();

		int count=0;
		for(String allwind : allwindowid) {
			if(count==4) {
				driver.switchTo().window(allwind);
			}
			count++;
		}

		driver.switchTo().window(parantwindowid);




		WebElement element = driver.findElement(By.xpath(""));
		Actions actions = new Actions(driver);
		//1. MouseOverActions - moveToElement
		actions.moveToElement(element).perform();

		//2. RightClick - contextClick
		actions.contextClick(element).perform();

		//3. DoubleClick- doubleclick
		actions.doubleClick(element).perform();

		//4. DragAndDrop- dragAndDrop
		actions.dragAndDrop(element,element).perform();

		//actions.sendKeys(element , "najimunisa").build().perform();


		WebElement element1 = driver.findElement(By.xpath(""));
		WebElement element2 = driver.findElement(By.xpath(""));
		Select select1 = new Select(element1);
		Select select2 = new Select(element2);

		//1.isMulple();
		boolean multiple = select1.isMultiple();
		//5. selectByVisibleText();
		select1.selectByVisibleText("text");
		select2.selectByVisibleText("text2");

		//2. getOptions();
		//3. selectByIndex();
		//4. selectByValue();
		//5. selectByVisibleText();
		//6. deselectByIndex();
		//7. deselectByValue();
		//8. deselectByVisibleText();
		//9. getFirestSelected();
		//10 getAllSelected();
		//11 deSelectAll();


		Alert alert = driver.switchTo().alert();

		alert.accept();
		alert.dismiss();

		//1. simpleAlert
		alert.accept();
		//2. ConfirmAlert
		alert.dismiss();

		//3. PromptAlert
		WebElement element5 = driver.findElement(By.xpath(""));
		String text = element5.getText();
		alert.sendKeys(text);
		alert.accept();



		WebElement dropdownoption = driver.findElement(By.xpath(""));
		Select select = new Select(dropdownoption);
		List<WebElement> options = select.getOptions();

		for(int i=0; i<options.size(); i++ ) {

			WebElement element6 = options.get(i);
			String text6 = element6.getText();
			System.out.println(text6);

		}
		WebElement firstSelectedOption = select.getFirstSelectedOption();

		String text2 = firstSelectedOption.getText();
		System.out.println(text2);









	}
	public static void main(String[] args) {
		SeleniumDemo s = new SeleniumDemo();
		s.lnt();

	}	








}


