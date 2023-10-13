import java.io.*;
import java.util.*;

public class MyClass {
    
    public static class Pair{
        int min;
        int max;
    }
    
    public static Pair min_max(int arr[]){
        Pair result = new Pair();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i< arr.length;i++){
            if(arr[i]< min){
                result.min = arr[i];
                min = arr[i];
            }
            if(arr[i]> max){
                result.max = arr[i];
                max = arr[i];
            }
        }
        return result;
    }
    
    public static void main(String args[]) {
        int arr[] = {3, 5, 4, 1, 9};
        Pair answer = min_max(arr);
        System.out.println("Min Number :" + answer.min);
        System.out.println("Max Number :" + answer.max);
    }
    
}