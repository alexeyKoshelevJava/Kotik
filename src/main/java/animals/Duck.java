package animals;

import model.Size;

public class Duck extends Herbivore implements Fly, Swim,Run, Voice {


    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка хорошо плавает");
    }

    @Override
    public String getVoice() {
        return "Кря-кря";
    }

    @Override
    public void run() {
        System.out.println("утка бежит вразвалочку");
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }
}
