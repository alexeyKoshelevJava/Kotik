package animals;

public class Deer extends Herbivore implements Run, Swim, Voice {
    public Deer(int satiety) {
        super(satiety);
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
}
