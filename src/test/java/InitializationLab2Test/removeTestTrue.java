package InitializationLab2Test;

import InitializationLab2.ColorfulThing;
import InitializationLab2.ThingContainer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joshuakelley on 9/10/16.
 */
public class removeTestTrue {
    @Test
    public void addTest(){
        ThingContainer thingContainer = new ThingContainer(3);
        for (int i=0;i<thingContainer.colorfulThings.length;i++){
            thingContainer.colorfulThings[i]=new ColorfulThing(ColorfulThing.ColorEnum.RED);
        }
        Assert.assertTrue(thingContainer.colorfulThings[0].getColor()==thingContainer.colorfulThings[1].getColor());
    }
}
