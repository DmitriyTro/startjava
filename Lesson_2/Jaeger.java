public class Jaeger {

    private String modelName;
    private int mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, int mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        System.out.println("Егерь " + modelName + "," + " марки: " + mark + " и производства: " + origin + "," + " имеет характеристики: ");
        System.out.println("Высота: " + height);
        System.out.println("Вес: " + weight);
        System.out.println("Скорость: " + speed);
        System.out.println("Сила: " + strength);
        System.out.println("Броня: " + armor);
    }

    public boolean drift() {
        System.out.println(modelName + " вошел в дрифт.");
        return true;
    }

    public void attackKaiju() {
        System.out.println(modelName + " атакует Кайдзю.");
    }

    public void usePlasmaCannon() {
        System.out.println(modelName + " использует плазма пушку.");
    }

    public void move() {
        System.out.println(modelName + " в движении.");
    }
}
