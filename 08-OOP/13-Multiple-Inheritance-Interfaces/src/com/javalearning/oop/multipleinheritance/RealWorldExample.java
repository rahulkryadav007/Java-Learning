package com.javalearning.oop.multipleinheritance;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionPrinter implements Printable, Scannable {
    public void print() { System.out.println("Printing document"); }
    public void scan() { System.out.println("Scanning document"); }
}

public class RealWorldExample {
    public static void main(String[] args) {
        MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.print();
        printer.scan();
    }
}
