package animals;

public class Deer extends Herbivore implements Run, Swim, Voice {
    public Deer(String name, int satiety) {
        super(name, satiety);
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
