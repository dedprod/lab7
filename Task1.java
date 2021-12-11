import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        int n = 0;
        int ent = 0;
        int ent2 = 0;
        float sum = 0;

        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите Количество элементов массива: ");
            n = console.nextInt();
            System.out.println("Введите элементы массива: ");
            float[] array = new float[n];
            for (int i = 0; i < n; i++) {
                array[i] = console.nextFloat();
            }
            System.out.println("Введите элемент который хотите заменить, нумерация начинается с 0: ");
            ent = console.nextInt();
            System.out.println("Введите элемент до которого будет вычислятся среднее арифметическое, нумерация начинается с 0: ");
            ent2 = console.nextInt();
            console.close();
            System.out.print("Исходный массив: ");
            for (float elem : array) {
                System.out.print(elem + " ");
            }
            System.out.println();
            for (int g = 0; g <= ent2; g++) {
                sum = sum + array[g];
            }
            sum = sum / (ent2 + 1);
            if ((ent <= array.length) & (ent > 0)) {
                array[ent] = sum;
                System.out.print("Итоговый массив: ");
                for (float elem : array) {
                    System.out.print(elem + " ");
                }
            } else {
                System.out.println("Введён элемент не соответветсвующий диапазону массива или была произведена попытка замены первого элемента.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных, попробуйте ещё раз предварительно перезапустив программу.");
        }
    }
}
