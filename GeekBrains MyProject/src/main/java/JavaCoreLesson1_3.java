public class JavaCoreLesson1_3 {
    public static void main(String[] args) {
        int[] intArray = createArray(10); // Создаем массив из 1 и 0 с помощью метода createArray
        int[] invertArray = changeArray(intArray); // Заменяем 1 на 0 и 0 на 1 в исходном массиве с помощью метода changeArray

        int[] array100 = new int[100]; // Создаем массив длинной 100 и циклом заполняем его, не забыв прибавить 1, чтобы начать не с нуля
        for (int i = 0; i < array100.length; i++) {
            array100[i] = 1 + i;
        }

        int[] arrayDoubleDigit = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayDoubleDigit.length; i++) {
            if (arrayDoubleDigit[i] < 6) {
                arrayDoubleDigit[i] *= 2;
            }
        }
        int[][] squareArray = createSquareArray(5);// Создаем квадратный двумерный массив размерностью а * а методом createSquareArray()
        fillSquareArray(squareArray); // Заполняем квадратный массив по диагонали методом fillSquareArray();
        reverseFillArray(squareArray); // Заполняем квадратный массив по обратной диагонали методом reverseFillSquareArray();
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray.length; j++) {
                System.out.print(squareArray[i][j]);
            }
            System.out.println();
        }
        int[] initialValueArray = createArray(5, 15);//Создаем массив с помощью перегруженного метода createArray();
        int[] newArray = {5, 234, 654, 44, 66, 12, 7, 2, 555, 675, 444}; //Вручную создаем и инициализируем массив
        getMaxAndMinNumberFromArray(newArray); //С помощью метода getMaxAndMinNumberFromArray() выводим в консоль минимальное и максимальное число.
        int[] checkBalanceArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(checkBalance(checkBalanceArray)); //Ощущение, что в методе checkBalance() слегка наговнокодил, но оно вроде работает как надо;
        int[] shiftingArray = {1, 2, 3, 4, 5};
        shiftArray(shiftingArray, 0); // Методом проб и ошибок получилось!!!!! 3 часа потрачены невпустую))) Метод shiftArray() двигает массив вперед при положительном значении int shift, и назад при отрицательном.
    }

    static int[] createArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = 0;
            if (i % 2 == 0) {
                newArray[i] = 1;
            }
        }
        return newArray;
    }

    static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
        return array;
    }

    static int[][] createSquareArray(int a) {
        int[][] newArray = new int[a][a];
        return newArray;
    }

    static int[][] fillSquareArray(int[][] squareArray) {
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray.length; j++) {
                if (i == j) {
                    squareArray[i][j] = 1;
                }
            }
        }
        return squareArray;
    }

    static int[][] reverseFillArray(int[][] squareArray) {
        int k = squareArray.length - 1;
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray.length; j++) {
                if (j == k) {
                    squareArray[i][j] = 1;
                    k--;
                }
            }
        }
        return squareArray;
    }

    static int[] createArray(int len, int initialValue){  // перегружаем метод createArray()
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++){
            newArray[i] = initialValue;
        }
        return newArray;
    }

    static void getMaxAndMinNumberFromArray(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Максимальное число в массиве " + max + ", а минимальное " + min);
    }

    static boolean checkBalance(int[] array) {
        int k = array.length - 1;
        int sumLeft;
        int sumRight;
        while (true) {
            sumLeft = 0;
            sumRight = 0;

            for (int i = 0; i <= k - 1; i++){
                sumLeft += array[i];
            }
            for (int i = array.length-1; i >= k; --i){
                sumRight += array[i];
            }
            if (sumLeft == sumRight) {
                return true;
            }
            --k;
            if (k == 0){
                return false;
            }
        }
    }

    static int[] shiftArray(int[] array, int shift){
        int a;
        if(shift > 0) {
            for (int k = 0; k < shift; k++) {
                for (int i = array.length - 1; i >= 0; i--) {
                    if (i - 1 < 0) {
                        break;
                    }
                    a = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = a;
                }
            }
        }
        else if(shift < 0){
            for (int k = 0; k < (-shift); k++) {
                for (int i = 0; i < array.length; i++) {
                    if (i + 1 == array.length) {
                        break;
                    }
                    a = array[i];
                    array[i] = array[i+1];
                    array[i+1] = a;
                }
            }
        }
        return array;
    }
}