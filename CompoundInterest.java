package com.example.gui;

    class CompoundInterest {
    double calculate(double p, double r, double t) {
        return p * Math.pow(1 + r / 100, t);
    }

    public static void main(String[] args) {
        CompoundInterest ci = new CompoundInterest();
        double p = 10000;
        double r = 5;
        double t = 5;
        double result = ci.calculate(p, r, t);
        System.out.println(result);  // Output: 2500
    }
}

