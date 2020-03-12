package com.gmail.qa.testcases;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class barCodeTest {
	WebDriver driver;


	@Test
	public void codetest() throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Maruthi Work\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://barcode.tec-it.com/en");
		
		String codeURL = driver.findElement(By.tagName("img")).getAttribute("src");
		
		URL url = new URL(codeURL);
		BufferedImage bi = ImageIO.read(url);
	//LuminanceSource ls = new BufferedImageLuminanceSource(bi);
		//BinaryBitmap bp = new BinaryBitmap(new HybridBinarizer(ls));
		
		
	}
}
