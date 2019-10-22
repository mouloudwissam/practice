package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.List;



public class language extends CommonAPI {



    @FindBy(xpath="//*[@id=\"js_2oa\"]")
    WebElement Tamazight;
public void choselanguage(){
    Tamazight.click();
}
@FindBy(xpath = "//*[@id=\"pageFooter\"]/ul/li[12]/a")
    WebElement lang;
    public void getinLognguage() {
        lang.click();
    }

    public  void changelanguage (){





    }




    public static List<String> getTextFromWebElements2(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.xpath(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
        }
        System.out.println(text);
        return text;

    }


}
