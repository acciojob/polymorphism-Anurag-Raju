package com.driver;

public class Main {
    public static void main(String [] args){
        Product p=new Product();
        int a=p.product(1,2);
        int b=p.product(3,2,1);
        double c=p.product(5,3);
        System.out.println(a + b + c);
    }
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x/y;
        }
    }
}