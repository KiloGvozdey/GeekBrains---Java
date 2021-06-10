public class JavaCoreLesson1_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign(){
        int a = 10;
        int b = 20;
        int summ = a + b;
            if (summ >= 0) {
                System.out.println("Сумма положительная и равна: " + summ);
            }
            else {
                System.out.println("Сумма отрицательная и равна: " + summ);
            }
    }
    static void printColor(){
        int value = 100 - 50;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        else if (value > 100){
            System.out.println("Зелёный");
        }
    }
    static void compareNumbers(){
        int a = 43;
        int b = a / 2 + 22;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }

    }
}
