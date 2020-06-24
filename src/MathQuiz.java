import java.util.Scanner;

import static java.lang.Math.sqrt;

public class MathQuiz {
    public static void main(String[] args) {
        int score = 0;
        boolean answer1 = question1();
        boolean answer2 = question2();
        boolean answer3 = question3();

        String goodAnswers = "";

        if (answer1) {
            goodAnswers = goodAnswers + " mnożenie \t";
            score++;
        }
        if (answer2) {
            goodAnswers = goodAnswers + "pole kwadratu \t ";
            score++;
        }
        if (answer3) {
            goodAnswers = goodAnswers + "pierwiastek kwadratowy \t";
            score++;
        }

        System.out.println(" dobre odpowiedzi w zadaniach:" + goodAnswers);

        System.out.println("Wynik: + " + score + "/3");
    }

    private static boolean question1() {
        System.out.println("jaki jest wynik mnożenia 3*5? ");
        Scanner scan = new Scanner(System.in);
        int multiplicationResult = scan.nextInt();
        if (multiplicationResult == 3 * 5) {
            System.out.println("dobrze! ");
            return true;

        } else {
            System.out.println("źle");
            return false;
        }
    }

    private static boolean question2() {
        System.out.println("jakie jest pole kwadratu o boku 12? ");
        Scanner scan = new Scanner(System.in);
        int squareArea = scan.nextInt();
        if (squareArea == 12 * 12) {
            System.out.println("dobrze");
            return true;
        } else {
            System.out.println("nie");
            return false;
        }
    }

    private static boolean question3() {
        System.out.println("jaki jest pierwiastek kwadratowy z liczby 15129? ");
        Scanner scan = new Scanner(System.in);
        int squareRoot = scan.nextInt();
        if (squareRoot == (int) sqrt(15129)) {
            System.out.println("ok");
            return true;
        } else {
            System.out.println("niee");
            return false;
        }
    }
}
