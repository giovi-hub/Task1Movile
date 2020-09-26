package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class DeleteTask {


    public Label deleteItem;
    public Button deleteButton;
    public Button confirmDelete;


    public DeleteTask(String title){
        deleteItem = new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
        confirmDelete = new Button(By.id("android:id/button1"));


    }
}
