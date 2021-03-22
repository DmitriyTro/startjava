public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Danger", 3, "USA", 79.25f, 1980, 7, 8, 6);
        System.out.println("Егерь " + jaegerOne.getModelName() + "," + " марки: " + jaegerOne.getMark() + " и производства: " + jaegerOne.getOrigin() + "," + " имеет характеристики: ");
        System.out.println("Высота: " + jaegerOne.getHeight());
        System.out.println("Вес: " + jaegerOne.getWeight());
        System.out.println("Скорость: " + jaegerOne.getSpeed());
        System.out.println("Сила: " + jaegerOne.getStrength());
        System.out.println("Броня: " + jaegerOne.getArmor());
        System.out.println();
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.usePlasmaCannon();

        System.out.println();

        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", 4, "China", 76.2f, 1722, 9, 8, 6);
        System.out.println("Егерь " + jaegerTwo.getModelName() + "," + " марки: " + jaegerTwo.getMark() + " и производства: " + jaegerTwo.getOrigin() + "," + " имеет характеристики: ");
        System.out.println("Высота: " + jaegerTwo.getHeight());
        System.out.println("Вес: " + jaegerTwo.getWeight());
        System.out.println("Скорость: " + jaegerTwo.getSpeed());
        System.out.println("Сила: " + jaegerTwo.getStrength());
        System.out.println("Броня: " + jaegerTwo.getArmor());
        System.out.println();
        jaegerTwo.drift();
        jaegerTwo.attackKaiju();
        jaegerTwo.usePlasmaCannon();
    }
}
