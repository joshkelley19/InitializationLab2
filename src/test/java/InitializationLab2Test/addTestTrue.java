package InitializationLab2Test;

import InitializationLab2.ColorfulThing;
import InitializationLab2.ThingContainer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joshuakelley on 9/10/16.
 */
public class addTestTrue {
    @Test
    public void addTest(){
        ThingContainer thingContainer = new ThingContainer(3);
        thingContainer.add(new ColorfulThing(ColorfulThing.ColorEnum.BLUE));
        Assert.assertTrue("Thing successfully added".equals(thingContainer.add(new ColorfulThing(ColorfulThing.ColorEnum.BLUE))));

    }
}
