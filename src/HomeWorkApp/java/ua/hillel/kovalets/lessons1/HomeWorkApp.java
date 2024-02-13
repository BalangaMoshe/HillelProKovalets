package ua.hillel.kovalets.lessons1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        int a = 5;
        int b = 7;
        System.out.println("Сума чисел від 10 до 20: " + boolCeck(a, b));
        System.out.println("\u001B[36m");

        int numPos = 0;
        int numNeg = -10;
        posivifOrNega(numPos);
        posivifOrNega(numNeg);

        //задание номер 8
        int num1 = 5;
        int num2 = -5;
        System.out.println(num1 + " негатив " + boolCeck2(num1));
        System.out.println(num2 + " негатив " + boolCeck2(num2));

        //задание 9
        int numer3 = 3;
        String text3 = "Hallo";
        printString(text3, numer3);

        //високосное задание
        int jahr = 1999;
        System.out.println(jahr + " рік является високосним! " + jahrGross(jahr));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 7;

        if ((a + b) >= 0) {
            System.out.println("Сума позитивна!");
        } else {
            System.out.println("Сума негативна!");
        }
    }

    public static void printColor() {
        int value = -10;

        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else if (value > 100) {
            System.out.println("Зелений");
        }

    }

    public static void compareNumbers() {
        int a, b;
        a = 100;
        b = 55;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static boolean boolCeck(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void posivifOrNega(int num) {
        if (num < 0) {
            System.out.println(num + " є відємним!");
        } else {
            System.out.println(num + " є додатнім!");
        }
    }

    public static boolean boolCeck2(int num2) {
        return num2 < 0;
    }

    public static void printString(String text3, int numer3) {
        for (int i = 0; i < numer3; i++) {
            System.out.println(text3);
        }
    }

    public static boolean jahrGross(int jahr) {
        return (jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0);
    }

}
