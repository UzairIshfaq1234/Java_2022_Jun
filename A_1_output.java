import java.util.Scanner;

public class A_1_output {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Age = 18;
        int[] Cars = new int[20];

        if (Age == 18) {
            System.out.println("Muhammad Uzair Ishafq is here " + Age);

        } else {
            System.out.println("NOT here");
        }

        for (int i = 0; i < 4; i++) {
            Cars[i] = input.nextInt();
            System.out.println("Entered: " + Cars[i]);

        }

    }

}