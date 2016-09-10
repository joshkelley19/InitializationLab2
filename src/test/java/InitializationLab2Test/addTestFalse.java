package InitializationLab2Test;

import InitializationLab2.ColorfulThing;
import InitializationLab2.ThingContainer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joshuakelley on 9/10/16.
 */
public class addTestFalse {

    @Test
    public void ContainerTest(){
        ThingContainer thingContainer = new ThingContainer(1);
        thingContainer.add(new ColorfulThing(ColorfulThing.ColorEnum.BLUE));
        Assert.assertFalse("Thing successfully added".equals(thingContainer.add(new ColorfulThing(ColorfulThing.ColorEnum.BLUE))));
    }
}
