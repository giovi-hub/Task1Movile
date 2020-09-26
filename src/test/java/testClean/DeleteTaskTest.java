package testClean;

import activity.DeleteTask;
import activity.MainActivity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class DeleteTaskTest {

    String titleTaskD = "Task1";

    MainActivity MainActivity = new MainActivity();
    DeleteTask deleteTask = new DeleteTask(titleTaskD);

    @Before
    public void before() throws MalformedURLException{
        WhenDoTest whenDo = new WhenDoTest();
        whenDo.NewTask();

    }

    @Test
    public void Remove() throws MalformedURLException {
        deleteTask.deleteItem.click();
        deleteTask.deleteButton.click();
        deleteTask.confirmDelete.click();

        Assert.assertFalse("ERROR, the task was not Deleted", MainActivity.isDeletedTask(titleTaskD));
    }

}
