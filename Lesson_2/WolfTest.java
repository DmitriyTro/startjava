public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.name = "Amelia";
        System.out.println("Кличка волка = " + wolf.name);

        wolf.gender = "female";
        System.out.println("Пол волка = " + wolf.gender);

        wolf.color = "brown";
        System.out.println("Цвет волка = " + wolf.color);

        wolf.weight = 27.6f;
        System.out.println("Вес волка = " + wolf.weight);

        wolf.age = 6;
        System.out.println("Возраст волка = " + wolf.age);

        wolf.hunt();
        wolf.howl();
        wolf.move();
        wolf.run();
        wolf.sit();
        System.out.println(wolf.howl());
        System.out.println(wolf.hunt());
    }
}
