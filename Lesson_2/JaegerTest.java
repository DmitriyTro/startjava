public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Danger", 3, "USA", 79.25f, 1980, 7, 8, 6);
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.usePlasmaCannon();

        System.out.println();

        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", 4, "China", 76.2f, 1722, 9, 8, 6);
        jaegerTwo.drift();
        jaegerTwo.attackKaiju();
        jaegerTwo.usePlasmaCannon();
    }
}
