package InitializationLab2;

/**
 * Created by joshuakelley on 9/10/16.
 */
public class ColorfulThing {
        private ColorEnum color;
        public ColorfulThing(ColorEnum color){
            this.color=color;
        }
        public ColorEnum getColor(){
            return this.color;
        }
        public enum ColorEnum{
            RED, BLUE, GREEN, PURPLE, YELLOW;
        }
        public void setColor(ColorEnum color){
            this.color=color;
        }

    }

