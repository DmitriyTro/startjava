public class ConditionalStatement {
public static void main(String[] args) {
    int age = 30;
    boolean isGenderMale = true;
    double height = 1.50;
    char firstLetterName = 'A';

    if (age > 20) {
        System.out.println("Adult!");
    }

    if (isGenderMale) {
        System.out.println("Male!");
    }

    if (!isGenderMale){
        System.out.println("Woman!");
    }
    if (height < 1.80) {
        System.out.println("Low!");
    }else {
        System.out.println("High!");
    }

        if (firstLetterName == 'M') {
            System.out.println("Yes");
        }else if (firstLetterName == 'I') {
            System.out.println("No");
        }else{
            System.out.println("Error!");
        }
    }
}