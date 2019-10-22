package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends CommonAPI {
     public static void HP (){

     }
////////////////////////////////////////////////

    public  void linkcheck (String name){
    WebElement linkName= driver.findElement(By.linkText(name));


    if(linkName.isDisplayed())
    {
        System.out.println("Yes link is there");
    }
    else
    {
        System.out.println("No link is there");
    }
    }
}

