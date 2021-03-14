public class MyFirstGame {
    public static void main(String[] args) {
        int playerNumber = 20;
        int computerNumber = 30;

        System.out.println("Старт!");

        while(true) {
            if (playerNumber == computerNumber) {
                System.out.println("Поздравляю, Вы угадали!");
                break;
            } else if (playerNumber > computerNumber) {
                System.out.println("Вы ввели число: " + playerNumber + " которое больше, чем загадал компьютер!");
                playerNumber--;
            } else if (playerNumber < computerNumber) {
                System.out.println("Вы ввели число: " + playerNumber + " которое меньше, чем загадал компьютер!");
                playerNumber++;
            }
        }
        System.out.println("Вы победили!");
    }
}