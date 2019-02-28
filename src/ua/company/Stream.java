package ua.company;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Alex on 28.02.2019
 */
public class Stream {

    public static void main(String [] args) {
        int [] arr = {3,6,2,53,543,0,65,35,12,0,75,66,80};

        IntStream intStreamFromArray = Arrays.stream(arr);

        //int s;
        long zeroCount = 0;
        long overZeroCount = 0;
        //average
        double average = IntStream.of(arr).
                average().getAsDouble();
        System.out.println("The average of array is: " + average);


        //min
        int minimum = intStreamFromArray.min().getAsInt();
        System.out.println("Min value of array is: " + minimum + ". ");
        int index = IntStream.range(0, arr.length).filter(i -> arr[i] == minimum).findFirst().orElse(-1);
        System.out.println("Index of the min element is: " + index + ".");


        //zeroes
        zeroCount = IntStream.of(arr).filter(a -> a == 0).count();
        System.out.println("The number of elements vith value = 0 is: " + zeroCount);


       //countOverZero
        overZeroCount = IntStream.of(arr).filter(a -> a > 0).sum();
        System.out.println("The sum of the lements above zero is: " + overZeroCount);


        //multiply
        System.out.println("The array values multiplied by 5 are: ");
        IntStream.of(arr).map(s -> s*5).forEach(a -> System.out.print(a + " "));

    }
}