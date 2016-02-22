package nonstatic;

import java.util.Arrays;

/**
 * Created by Yuriy on 22.02.2016.
 */
public class MyInit {//create class
    private int[] arr = new int[10];//init array 10 length all fields should be private

    {
        for (int i = 0; i < arr.length; i++) {//every element val
            arr[i] = (int) (100 * Math.random());//random Повертає значення від 0 до 1 в форматі double.....
            // тому множимо на 100. Також проводимо приведення типів.
        }
    }
    public void printArray(){//create method
        System.out.println(Arrays.toString(arr));
    }
}
