package com.javalearning.oop.multipleinheritance;

// Ek device ko print aur scan dono capabilities chahiye.
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Printer dono interfaces implement karke dono contracts follow karta hai.
class MultiFunctionPrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.print(); // Printable ka implementation.
        printer.scan();  // Scannable ka implementation.
    }
}
