package Homework2;

/**
 * Created by Юрий on 29.05.2016.
 */
public class Homework2_1 {
    public static void main (String [] args) {

        // 1. сортировка массива пузырьком
        System.out.print ("Сортировка массива пузырьком: ");
        int [] arr = new int [20];
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 20);
        }
        for (int i=0; i<arr.length; i++)
        {
            for (int j=arr.length-1; j>i; j--)
            {
                if (arr[j]<arr[j-1])
                {
                    int tmp = arr[j];
                    arr[j] = arr [j-1];
                    arr[j-1] = tmp;
                }
            }
            System.out.print (arr[i] + " ");
        }
        System.out.print ("\n" + "Сортировка масиива выбором: ");
        // 2. сортиовка выбором
        int [] mas = new int [20];
        for (int i=0; i<mas.length; i++)
        {
            mas[i] = (int) (Math.random() * 20);
        }
        for (int i=0; i<mas.length; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < mas.length; j++)
            {
                if (mas[j]<mas[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = mas[i];
            mas[i] = mas[minIndex];
            mas[minIndex] = temp;
            System.out.print (mas[i] + " ");
        }

















    }

}
