package be.intecbrussel;

import java.util.Scanner;

public class BasicProgrammingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type value for number 1");
        int number1 = input.nextInt();
        System.out.println("Type value for number 2");
        int number2 = input.nextInt();
        System.out.println("Type value for number 3");
        int number3 = input.nextInt();
        System.out.println("Type value for number 4");
        int number4 = input.nextInt();
        input.close();
        int greatest = number1;
        int smallest = number1;
        int average = (number1 + number2 + number3 + number4) / 4;
        int opposite = 0;

        // greatest and smallest
        if (number2 > greatest){
            greatest = number2;
        }
        if (number3 > greatest){
            greatest = number3;
        }
        if (number4 > greatest){
            greatest = number4;
        }
        if (number2 < smallest){
            smallest = number2;
        }
        if (number3 < smallest){
            smallest = number3;
        }
        if (number4 < smallest){
            smallest = number4;
        }
        System.out.println();
        System.out.println("Greatest number: " + greatest);
        System.out.println("Smallest number: " + smallest);

        //Average
        System.out.println();
        System.out.println("Smallest to average");
        for (int i = smallest; i <= average; i++){
            System.out.println(i);
        }
        System.out.println();

        //0 - 2000
        System.out.println();
        System.out.println("0 - 2000");
        for (int i = 0; i <= smallest; i++){
            System.out.println(i);
        }

        //0 - 100
        System.out.println();
        System.out.println("0 - 100");
        for (int i = 100; i >= 0; i--){
            System.out.println(i);
            System.out.println(opposite++);
        }
    }
}
