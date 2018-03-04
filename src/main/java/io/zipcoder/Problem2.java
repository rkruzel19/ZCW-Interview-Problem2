package io.zipcoder;

public class Problem2 {

    public static void main(String[] args) {
        int n = 50;
        System.out.println(fibonacciIteration(n));
    }

    public static String fibonacciIteration(int n){

        int first = 0;
        int next = 1;
        int fibonacci = -1;
        String output = first + " " + next + " ";

        while (fibonacci < n){
            fibonacci = first + next;
            output += fibonacci + " ";
            first = next;
            next = fibonacci;
            fibonacci = first + next;
        }

        return output;

    }

}
