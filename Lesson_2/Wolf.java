public class Wolf {

    String name;
    String gender;
    String color;
    float weight;
    int age;

    boolean hunt() {
        System.out.println("Волк охотится.");
        return true;
    }

    boolean howl() {
        System.out.println("Волк воет.");
        return true;
    }

    void move() {
        System.out.println("Волк идет.");
    }

    void run() {
        System.out.println("Волк бежит.");
    }

    void sit() {
        System.out.println("Волк сидит.");
    }
}
