public class JavaCoreLesson1_2 {
    public static void main(String[] args) {

        System.out.println("Сумма чисел лежит в промежутке от 10 до 20? Ответ: " + convertBooleanToWord(checkSumm(10,9)));
        checkIsPositive(-25);
        System.out.println("Число переданное в аргумент метода отрицательное, верно? Ответ: " + convertBooleanToWord(checkIsNegative(44)));
        printString("Данная строка отпечатается 1 раз", 1);
        System.out.println("Введенный в аргументе год високосный? Ответ: " + convertBooleanToWord(checkYear(2100)) + ". ");
        System.out.println("А этот? Ответ: " + convertBooleanToWord(checkYear(2000)));

    }

    //Следующий метод сделан исключительно в целях попробовать в качестве аргумента метода результат другого метода.
    static String convertBooleanToWord (boolean b){
        if (b){
            return "Да";
        }
        return "Нет";
    }

    static boolean checkSumm(int a, int b){
        if(a + b >= 10 && a + b <= 20){
            return true;
        }
        return false;
    }

    static void checkIsPositive(int a){
        if (a >= 0){
        System.out.println(a + " - this number is positive");
        return;
        }
        System.out.println(a + " - this number is negative");
    }

    static boolean checkIsNegative(int a){
        return a < 0;
    }

    static void printString (String s, int i){
        for(;i > 0;i--){
            System.out.println(s);
        }
    }

    static boolean checkYear(int a){
        if (a % 400 == 0){
            return true;
        }
        else if (a % 100 == 0){
            return false;
        }
        else if (a % 4 == 0){
            return true;
        }
        return false;
    }
}
