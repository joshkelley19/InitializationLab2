package InitializationLab2Test;

import InitializationLab2.ThingContainer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joshuakelley on 9/10/16.
 */
public class popTestFalse {
    @Test
    public void addTest(){
        ThingContainer thingContainer = new ThingContainer(10);
        thingContainer.fillForTests();
        Assert.assertTrue("Should return false", thingContainer.colorfulThings[8].equals(thingContainer.pop()));

    }
}
