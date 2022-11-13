package Lesson_3;


public class Masivyepta {
    public static void main(String[] args) {
        int[] a = new int[]{1, 10, 20, -10, 18};
        //поиск максимального значения
        int maxNum = 0;
        for (int j : a) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("Максимальное значение в массиве: " + maxNum);

        //поиск минимального значения
        int minNum = 0;
        for (int k : a) {
            if (k < minNum)
                minNum = k;
        }
        System.out.println("Минимальное значение в массиве: " + minNum);

        //поиск суммы элементов в массиве
        int sumNum = 0;
        for (int k = 0; k < a.length; k++) {
            sumNum = sumNum + a[k];
        }
        System.out.println("Поиск суммы значений в массиве: " + sumNum);


        //метод, который находит максимальное число в массиве arr


        int[][][] arr = new int[][][]{{{1, 2}, {5, 10}}, {{-1, 80}, {3, 4}, {7, -5}}};

    }
}


