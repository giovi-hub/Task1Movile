package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class AddTask {
    public TextBox title;
    public TextBox notes;
    public Button buttonSave;

    public AddTask(){
        buttonSave = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
        title = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        notes = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));

    }
}
