package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Prueba extends Main {

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void TC001_Elements1() throws InterruptedException, IOException {
        testId = "TC001_Elements1";

        // Precondición
        Main.driver.get("https://demoqa.com/");
        
        // Paso 1 - Acceder a "Text box" dentro de Elements
        driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]")).click();
        /*
         * Otro ejemplo:
         * 
         * WebElement boton = driver.findElement(By.xpath("xpath"));
         * boton.click();
         */
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click();
        Thread.sleep(3000);
        

        // Paso 2 - Introducir nombre y correo
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Nombre");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("email@email.com");
        Thread.sleep(3000);

        // Paso 3 - Pulsar submit
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(3000);

        //Paso 4 - Verificar que aparece el recuadro
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).isDisplayed());


        System.out.println("Test " + testId + " finalizado");

    }

    @Test(description = "Prueba DemoQA Elements Radio Buttons")
    @Story("Elements")
    @Description("Pulsar radio buttons")
    public void TC002_Elements2() throws InterruptedException, IOException {
        testId = "TC002_Elements2";

        // Precondición
        Main.driver.get("https://demoqa.com/");
        
        // Paso 1 - Acceder a "Radio Buttons" dentro de Elements
        driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]")).click();
        /*
         * Otro ejemplo:
         * 
         * WebElement boton = driver.findElement(By.xpath("xpath"));
         * boton.click();
         */
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//li[@id='item-2'])[1]")).click();
        Thread.sleep(3000);
        

        // Paso 2 - Pulsar Yes
        driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[2]/label")).click();
        Thread.sleep(3000);

        // Paso 3 - Pulsar Impressive
        driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/label")).click();
        Thread.sleep(3000);

        //Paso 4 - Pulsar No
        driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[4]/label")).click();
        Thread.sleep(3000);


        System.out.println("Test " + testId + " finalizado");

    }
}
