package regression;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class searshFriend extends CommonAPI {

    public void SearchFunction() {
     Login Page = PageFactory.initElements(driver, Login.class);

        Page.log
        clickByXpath("//input[@class='_1frb']");
        typeByXpath("//input[@class='_1frb']","naim khan siam");
    }
    public void friendRequest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        login();
        typeByXpathNEnter("//input[@class='_1frb']","felicity smoak");
        clickByXpath("//div[@class='_4xjz'][contains(text(),'People')]");
        clickByXpath("//*[@class='_42ft _4jy0 FriendRequestAdd addButton _4jy3 _517h _51sy'][1]");
    }
    public void postAstatus(){
        login();
        clickByXpath("//a[@class='_2s25'][contains(text(),'Home')]");
        typeByXpath("//textarea[@class='_3en1 _480e navigationFocus']","this is a test");
        clickByXpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']");
    }
    public void deleteAstatus(){
        login();
        clickByXpath("");

    }
}
