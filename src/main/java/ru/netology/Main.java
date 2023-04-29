package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ints ints = new IntsCalculator();
        System.out.println(ints.sum(2, 2));
        System.out.println(ints.mult(3, 3));
        System.out.println(ints.pow(5, 2));
    }
}