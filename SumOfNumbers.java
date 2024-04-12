package com.example.gui;

class SumOfNumbers {
    int calculate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfNumbers sn = new SumOfNumbers();
        int[] arr = {0, 1, 3, 8, 21};
        int result = sn.calculate(arr);
        System.out.println(result);  // Output: 33
    }
}

