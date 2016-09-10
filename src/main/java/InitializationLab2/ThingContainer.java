package InitializationLab2;

import java.lang.reflect.Array;

public class ThingContainer {
    public ColorfulThing colorfulThings[];
    int arrayIndex = 0;
    public ThingContainer(int arraySize){
        colorfulThings= new ColorfulThing[arraySize];
    }
    public String add(ColorfulThing addedColorfulThing){
        if(arrayIndex<colorfulThings.length){
            colorfulThings[arrayIndex]=addedColorfulThing;
            arrayIndex++;
            return "Thing successfully added";
        }else return "ThingContainer is full!!!";
    }
    public void fillForTests(){
        ColorfulThing.ColorEnum[] filler = ColorfulThing.ColorEnum.values();
        for (int i=0,j=0; i<colorfulThings.length;i++,j=i%5){
                colorfulThings[i]=new ColorfulThing(filler[j]);
                arrayIndex=i;
        }
    }
    public ColorfulThing pop(){
        if((arrayIndex>0)&&(arrayIndex<=colorfulThings.length)) {
            ColorfulThing toBeReturned = colorfulThings[arrayIndex];
            colorfulThings[arrayIndex]=null;
            arrayIndex--;
            return toBeReturned;
        }else return null;
    }
    public ColorfulThing remove(ColorfulThing.ColorEnum color){
        for (ColorfulThing i:colorfulThings) {
            if(i.getColor()==color){
                ColorfulThing toBeReturned = i;
                i=null;
                //reorder();
                return toBeReturned;
            }
        }
        return null;
    }
//    public ColorfulThing remove(ColorfulThing comparison){
//        for (int i=0; i<colorfulThings.length;i++){
//            if(colorfulThings[i].equals(comparison)){
//                ColorfulThing toBeReturned =(ColorfulThing)Array.get(colorfulThings, i);
//                for (int a = i,j=i+1;a<colorfulThings.length-3;i++,j++){
//                    colorfulThings[a]=(ColorfulThing)Array.get(colorfulThings, j);
//                }
//                //colorfulThings[i]=null;
//                //reorder();
//                return toBeReturned;
//            }
//        }
//        return null;
//    }
    public void printThings(){
        for (int i=0;i<=arrayIndex;i++){
            System.out.println(colorfulThings[i].getColor());
        }
    }
//    public void reorder(){
//        for (int i=0;i<colorfulThings.length;i++){
//            if(colorfulThings[i].equals(null)){
//                colorfulThings[i]=findNext(i);
//            }
//        }
//    }
    public ColorfulThing findNext(int i){
        for(int shift = i;shift<colorfulThings.length;shift++){
            if(colorfulThings[shift].equals(null)){
                continue;
            }else return colorfulThings[shift];
        }
        return null;
    }

    public static void main(String[] args) {
//        ThingContainer thingContainer1 = new ThingContainer(8);
//        ThingContainer thingContainer2 = new ThingContainer(4);
//        ThingContainer thingContainer3 = new ThingContainer(2);

        ThingContainer thingContainer = new ThingContainer(10);
        thingContainer.fillForTests();
        thingContainer.printThings();


    }
}
