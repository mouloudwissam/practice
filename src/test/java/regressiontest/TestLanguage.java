package regressiontest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import regression.language;

public class TestLanguage extends CommonAPI {

   //signInOnly = PageFactory.initElements(driver,SignInOnly.class);
@Test
    public static void tst(){
    language page =PageFactory.initElements(driver,language.class);
    page.getinLognguage();
       // language.getTextFromWebElements2("//*[@id=\"pageFooter\"]/ul/li[12]/a");
        sleepFor(2);
        page.choselanguage();
        sleepFor(2);
    }
    }


