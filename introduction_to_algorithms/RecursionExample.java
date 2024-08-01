package introduction_to_algorithms;

public class RecursionExample {

    /**
     * Плохой пример - бесконечный вызов функции до переполнения стека
     */
    public static void countdownFail(int i) {
        System.out.println(i);
        countdownFail(i - 1);
    }

    /**
     * Правильный пример рекурсии
     */
    public static void countdownSuccess(int i) {
        System.out.println(i);
        if (i <= 1) {
            return;
        } else {
            countdownSuccess(i - 1);
        }
    }

    /**
     * Стек вызовов
     */
    public static void greet(String name) {
        System.out.println("hello, " + name + "!");
        greet2(name);
        System.out.println("greeting ready to say bye...");
        bye();
    }
    public static void greet2(String name) {
        System.out.println("how are you, " + name + "?");
    }
    public static void bye() {
        System.out.println("ok bye!");
    }

    /**
     * Стек вызовов с рекурсией
     */
    public static int fact(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }

    public static void main(String[] args) {
//        countdownFail(5);

//        countdownSuccess(5);

//        greet("Maggie");

        System.out.println(fact(3));
    }
}
