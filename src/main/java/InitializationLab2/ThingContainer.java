package InitializationLab2;


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
        for (int i=0;i<=arrayIndex;i++) {
            ColorfulThing.ColorEnum current = colorfulThings[i].getColor();
            if(current==color){
                ColorfulThing toBeReturned = colorfulThings[i];
                colorfulThings[i]=null;
                reorder(i);
                arrayIndex--;
                return toBeReturned;
            }
        }
        return null;
    }
    //if calling array index doesn't work, call Array.get and cast to object type
    public ColorfulThing remove(ColorfulThing comparison){
        for (int i=0; i<arrayIndex;i++){
            if(colorfulThings[i].equals(comparison)){
                ColorfulThing toBeReturned =colorfulThings[i];
                colorfulThings[i]=null;
                reorder(i);
                arrayIndex--;
                return toBeReturned;
            }
        }
        return null;
    }
    public void printThings(){
        for (int i=0;i<=arrayIndex;i++){
            System.out.println(colorfulThings[i].getColor());
        }
    }
    public void reorder(int spot){
        for (int i=spot;i<arrayIndex;i++){
            if(colorfulThings[i]==null){
                colorfulThings[i]=findNext(i);
                colorfulThings[i+1]=null;
            }
        }
    }
    public ColorfulThing findNext(int i){
        for(int shift = i;shift<=arrayIndex;shift++){
            if(colorfulThings[shift]==null){
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
        System.out.println();
        System.out.println(thingContainer.remove(thingContainer.colorfulThings[5]).getColor());
        System.out.println();
        thingContainer.printThings();


    }
}
