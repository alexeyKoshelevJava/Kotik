import animals.*;
import employee.Worker;
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
        swims[0] = new Fish("Щука", 0);
        swims[1] = new Duck("Домашняя утка", 0);
        swims[2] = new Bear("Белый медведь", 0);
        swims[3] = new Deer("Олень", 0);
        return swims;

    }

}
