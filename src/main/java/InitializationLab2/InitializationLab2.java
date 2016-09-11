package InitializationLab2;

/**
 * Created by joshuakelley on 9/10/16.
 */
public class InitializationLab2 {
    public static void main(String[] args) {
        //        ThingContainer thingContainer1 = new ThingContainer(8);
//        ThingContainer thingContainer2 = new ThingContainer(4);
//        ThingContainer thingContainer3 = new ThingContainer(2);

        ThingContainer thingContainer = new ThingContainer(10);

        thingContainer.fillForTests();
        thingContainer.printThings();
        System.out.println();
        System.out.println(thingContainer.remove(thingContainer.colorfulThings[5]).getColor());
        System.out.println(thingContainer.remove(thingContainer.colorfulThings[5]).getColor());
        System.out.println(thingContainer.remove(thingContainer.colorfulThings[5]).getColor());
        System.out.println();
        thingContainer.printThings();
        System.out.println();
        System.out.println(thingContainer.add(new ColorfulThing(ColorfulThing.ColorEnum.BLUE)));
        System.out.println(thingContainer.add(new ColorfulThing(ColorfulThing.ColorEnum.BLUE)));
        System.out.println(thingContainer.add(new ColorfulThing(ColorfulThing.ColorEnum.BLUE)));
        System.out.println();
        thingContainer.printThings();
    }
}
