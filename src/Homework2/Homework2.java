package Homework2;

/**
 * Created by Юрий on 28.05.2016.
 */
import java.util.Scanner;
public class Homework2 {
    public static void main (String [] args) {

        // задача 1, таблица умножения с заданным диапазоном, вы сказали такое сделать на уроке, но не успел
        Scanner sc = new Scanner (System.in);
        System.out.print("Введите целое число x: ");
        int x = sc.nextInt();
        System.out.print("Введите целое число y: ");
        int y = sc.nextInt();
        for (int i=1; i<=x; i++)
        {
            for (int j=1; j<=y; j++)
            {
                System.out.print (i*j + "\t");
            }
            System.out.println ();
        }

    // задача 2, поиск минимального числа в массиве
        int [] arr = new int [10];
        int min;
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 609 - 253);
        }
        min = arr [0];
        System.out.print ("\n" +"Все значения массива: ");
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println ("\n" + "Минимальное значение: " + min);

    // задача 3, на три массива
        int [] a = new int [20];
        int [] b = new int [20];
        int [] c = new int [20];
        int count;
        System.out.print ("\n" + "Значения массива a: ");
        for (int i=0; i<a.length; i++)
        {
            a[i] = (int) (Math.random() * 7);
            System.out.print (a[i] + " ");
        }
        System.out.print ("\n" + "Значения массива b: ");
        for (int i=0; i<b.length; i++)
        {
            b[i] = (int) (Math.random() * 7);
            System.out.print (b[i] + " ");
        }

        System.out.print ("\n" + "Значения массива c: ");
        for (int i=0; i<b.length; i++)
        {
            count = 0;
            for (int j=0; j<a.length; j++)
            if (b[i]==a[j])
            {
                count++;
            }
            c[i]=count;
            System.out.print (c[i] + " " );
        }















    }
}

