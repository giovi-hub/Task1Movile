package testClean;

import activity.AddTask;
import activity.MainActivity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WhenDoTest {

    MainActivity MainActivity = new MainActivity();
    AddTask addTask = new AddTask();


   @Test
    public void NewTask() throws MalformedURLException {
       String titleTask = "Task1";
       String noteTask = "description1";

        MainActivity.buttonMore.click();
        addTask.title.type(titleTask);
        addTask.notes.type(noteTask);
        addTask.buttonSave.click();

       Assert.assertTrue("ERROR, la tarea no esta creada", MainActivity.isDisplayedTask(titleTask));


    }
}
