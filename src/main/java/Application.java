import animals.Kotik;

public class Application {
    public static void main(String[] args) {

        Kotik kotik1 = new Kotik("базилио", "miau", 0, 5);
        Kotik kotik2 = new Kotik();
        kotik2.setName("vasia");
        kotik2.setVoice("murr");
        kotik2.setSatiety(2);
        kotik2.setWeight(3);

        
        String[] actionList = kotik1.liveAnotherDay();
        for (String action : actionList) {
            System.out.println(action);
        }
        System.out.println("kotik name: " + kotik1.getName());
        System.out.println("kotik weight: " + kotik1.getWeight());

        System.out.println(compareVoice(kotik1, kotik2));

        System.out.println(Kotik.getCount());

    }

    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());

    }
}
