import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int compNumber = (int) (Math.random() * 101);

        do {
            System.out.println(playerOne.getName() + " , введите число: ");
            playerOne.setNumber(scanner.nextInt());

            if (playerOne.getNumber() < compNumber) {
                System.out.println("Компьютер загадал число больше, чем ваше.");
            } else if (playerOne.getNumber() > compNumber) {
                System.out.println("Компьютер загадал число меньше, чем ваше.");
            } else {
                System.out.println(playerOne.getName() + " победил! " + "Поздравляем!");
                break;
            }

            System.out.println(playerTwo.getName() + " , введите число: ");
            playerTwo.setNumber(scanner.nextInt());

            if (playerTwo.getNumber() < compNumber) {
                System.out.println("Компьютер загадал число больше, чем ваше.");
            } else if (playerTwo.getNumber() > compNumber) {
                System.out.println("Компьютер загадал число меньше, чем ваше.");
            } else {
                System.out.println(playerTwo.getName() + " победил! " + "Поздравляем!");
                break;
            }
        } while (true);
    }
}