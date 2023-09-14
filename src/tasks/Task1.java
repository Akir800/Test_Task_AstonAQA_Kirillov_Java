package tasks;

import utils.Utils;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int number = Utils.scanInt();
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Извините, но это число меньше или равно минимальному граничному значению. Перезапустите программу и попробуйте снова!");
        }
    }
}