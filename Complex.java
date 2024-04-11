package com.example.gui;

class Complex {
    int real;
    int imag;

        Complex(int r, int i) {
            real = r;
            imag = i;
        }

        Complex add(Complex c) {
            return new Complex(real + c.real, imag + c.imag);
        }

        void print() {
            System.out.println(real + " + " + imag + "i");
        }

        public static void main(String[] args) {
            Complex c1 = new Complex(1, 2);
            Complex c2 = new Complex(4, 5);
            Complex c3 = c1.add(c2);
            c3.print();  // Output: 5 + 7i
        }
    }
