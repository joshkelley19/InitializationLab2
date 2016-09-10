package InitializationLab2Test;

import InitializationLab2.ColorfulThing;
import InitializationLab2.ThingContainer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joshuakelley on 9/10/16.
 */
public class popTestTrue {
    @Test
    public void addTest(){
        ThingContainer thingContainer = new ThingContainer(10);
        thingContainer.fillForTests();
        Assert.assertTrue("Should return true", thingContainer.colorfulThings[9].equals(thingContainer.pop()));

    }
}
