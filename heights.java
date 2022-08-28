import java.util.Locale;
import java.util.Scanner;

public class heights {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        // Reading user data

        System.out.print("Amount of people: ");
        int numberOfPeople = scanner.nextInt();

        String[] name = new String[numberOfPeople];
        int[] age = new int[numberOfPeople];
        double[] height = new double[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Nome: ");
            name[i] = scanner.next();

            System.out.print("Age: ");
            age[i] = scanner.nextInt();

            System.out.print("Height: ");
            height[i] = scanner.nextDouble();

        }

        // average height
        double totalHeight = 0.0;
        for (int i = 0; i < numberOfPeople; i++) {
            totalHeight += height[i];
        }
        double averageHeight = totalHeight/numberOfPeople;

        System.out.printf("Average height: %.2f", averageHeight);


        // number of people under sixteen
        int underSixteen = 0;
        for (int i = 0; i < numberOfPeople; i++) {
            if(age[i] < 16){
                underSixteen++;
            }
        }
        double percentUnderSixteen =  ((double)underSixteen/numberOfPeople)*100;
        System.out.printf("%nPercent of people under sixteen: %.1f%n/*/**/*/", percentUnderSixteen);

        // name of people under sixteen
        for (int i = 0; i < numberOfPeople; i++) {
            if (age[i] < 16){
                System.out.println(name[i]);
            }
        }
    }
}
