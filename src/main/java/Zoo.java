import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Swim[] swims = createPond();
        for (Swim swim : swims) {
            swim.swim();
        }

    }

    public static Swim[] createPond() {
        Swim[] swims = new Swim[4];
        swims[0] = new Fish( 0);
        swims[1] = new Duck( 0);
        swims[2] = new Bear( 0);
        swims[3] = new Deer( 0);
        return swims;


    }

}
