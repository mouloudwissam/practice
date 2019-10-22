package regression;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Login extends CommonAPI {
    /**
     * This method will siginin
     *
     * @Author - rabah
     */

    public static void lgn(String id, String pass) throws InterruptedException {
        System.out.println("Successfully opened the website");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys(id);
        driver.findElement(By.id("pass")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        System.out.println("Successfully logged in");
        Thread.sleep(3000);
    }

    /**
     * This method will wait signout
     *
     * @Author - rabah
     */
    public static void logout() {
        driver.findElement(By.id("userNavigationLabel")).click();
        sleepFor(2);
        driver.findElement(By.partialLinkText("Déconnexion")).click();
        System.out.println("Successfully logged out");
    }

    /**
     * This method will signin
     *
     * @param  id=email and pass=passworld
     * @Author - rabah
     */
    public  void signin(String id, String pass) {
        typeByXpath("//*[@id=\"email\"]", id);
        typeByXpath("//*[@id=\"pass\"]", pass);
        clickByXpath("//*[@id=\"u_0_2\"]");
        System.out.println("Successfully logged in");
        System.out.println("This ius new addition");
    }


}
