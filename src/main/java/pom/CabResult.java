package pom;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTestClass;
import utilities.Excelutil_POI;

public class CabResult extends BaseTestClass{
	
	public CabResult(WebDriver driver) {
		this.driver = driver;
	}
	
 

	
	public void getCabType() throws Exception {
		
		List<String> cabName = new ArrayList<String>();
		
		for (int i = 1; i < 6; i++) {
			cabName.add(driver
					.findElement(By
							.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[" + i + "]/label/p[1]"))
					.getText()
					+ " : "
					+ driver.findElement(By.xpath(
							"//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div["  + i + "]/label/p[2]"))
							.getText());
		}

		for (int i = 0; i < 5; i++) {
			Excelutil_POI.setCellData(cabName.get(i), i + 6, 0);
			System.out.println(cabName.get(i));

		}

	}

}
