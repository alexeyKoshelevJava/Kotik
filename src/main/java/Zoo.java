import animals.*;


public class Zoo {
    public static void main(String[] args) {
        Swim[] swims = createPond();
        for (Swim swim : swims) {
            swim.swim();
        }


    }

    public static Swim[] createPond() {
        Swim[] swims = new Swim[4];
        swims[0] = new Fish();
        swims[1] = new Duck();
        swims[2] = new Bear();
        swims[3] = new Deer();
        return swims;


    }

}
