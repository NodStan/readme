package com.example.gui;

class PascalTriangle {
    void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }

    int binomialCoefficient(int n, int k) {
        int res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        pt.print(5);
    }
}
