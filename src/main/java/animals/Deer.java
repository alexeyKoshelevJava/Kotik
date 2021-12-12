package animals;

import model.Size;

public class Deer extends Herbivore implements Run, Swim, Voice {


    public Deer(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Олень бежит быстро");
    }

    @Override
    public void swim() {
        System.out.println("Олень плывет медленно ");
    }

    @Override
    public String getVoice() {
        return "УУУУУУУ трубит";
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
    }
}
