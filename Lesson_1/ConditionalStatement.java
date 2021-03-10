public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if (age > 20) {
            System.out.println("Adult!");
        }
        boolean isGenderMale = true;
        if (isGenderMale) {
            System.out.println("Male!");
        }
        if (!isGenderMale) {
            System.out.println("Woman!");
        }
        double height = 1.50;
        if (height < 1.80) {
            System.out.println("Low!");
        } else {
            System.out.println("High!");
        }
        char firstLetterName = 'A';
        if (firstLetterName == 'M') {
            System.out.println("Yes");
        } else if (firstLetterName == 'I') {
            System.out.println("No");
        } else {
            System.out.println("Error!");
        }
    }
}