package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

import java.awt.*;

public class MainActivity {

    public Button buttonMore;


    public  MainActivity(){
        buttonMore = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    }
    public boolean isDisplayedTask(String title){
        String locator="//android.widget.TextView[@text='"+title+"']";
        Label titleTask = new Label(By.xpath(locator));
        return titleTask.isDisplayed();
    }

    public boolean isDeletedTask(String title){
        String locator="//android.widget.TextView[@text='"+title+"']";
        Label titheT = new Label(By.xpath(locator));
        return titheT.isDisplayed();
    }


}
