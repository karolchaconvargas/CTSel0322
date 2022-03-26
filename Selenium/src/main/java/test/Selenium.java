package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String exePath = "./driver/chromedriver.exe"; //especificar la ruta del Cromedriver
      System.setProperty("webdriver.chrome.driver", exePath);//Agregando la propiedades con la ruta del chrome driver
      WebDriver driver = new ChromeDriver();//Nuevo objeto de webdriver
      driver.get("https://www.google.com");//URL que va  a cargar
      
      //Plugin testng , pestaña adicional para ver los casos de prueba
      //Dependencia, 
      
      
	}

}
