public class Lesson2 {
    public static void main(String[] args) {
        boolean sumOfMeaning = methodName(20,50);
        System.out.println(sumOfMeaning);
        isPositiveOrNegative(20);
        boolean number = isTruth(77);
        System.out.println(number);
        someMethod("", 8);
        System.out.println("Snickers");
    }
    public static boolean methodName(int c, int d) {
        int result = c + d;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int q) {
        if (q >=0) {
            System.out.println("Polozitelnoe  chislo");
        } else {
            System.out.println("Otritsatelnoe chislo");
        }

    }
    public static boolean isTruth(int p) {
        if (p < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void someMethod(String word, int count) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Snickers");
        }
    }





}

