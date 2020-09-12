package COOLFABI.SELENIUM;

import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "CURSO FABI AUTOMATION" );
        String exePath = Paths.get("").toAbsolutePath()+ File.separator + "DRIVER" + File.separator; //tomando el drive de la carpeta DRIVER
        System.setProperty("webdriver.chrome.driver",exePath + "chromedriver.exe"); //seteando o hacer match la propiedad del .exe        
        WebDriver driver = new ChromeDriver();//inicializar el driver
        driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");
        
    
    }
}
