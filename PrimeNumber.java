package com.example.gui;

class PrimeNumber {
    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        int n = 17;
        boolean result = pn.isPrime(n);
        System.out.println(result);  // Output: true
    }
}

