package ru.avalon.javaapp.j110.funcintegraldemo;

public class Main {
    public static void main(String[] args) {
        DoubleFunc f1 = new QuadraticEquation();
        System.out.println(RootFinder.findRoot(f1, 1, 3, 100));

        DoubleFunc f2 = new DoubleFunc() {
            @Override
            public double eval(double x) {
                return x*x+x;
            }
        };
        System.out.println(RootFinder.findRoot(f2, 3, 4, 100));

        DoubleFunc f3 = Math::log;
        System.out.println(RootFinder.findRoot(f3, 2, 5, 100));

        Exponent o = new Exponent();
        DoubleFunc f4 = o::evalFunc;
        System.out.println(RootFinder.findRoot(f4, 0.01, 2, 100));

        DoubleFunc f5 = x -> x*Math.sin(x);
        System.out.println(RootFinder.findRoot(f5, 0, 1, 100));
   }
    private static class QuadraticEquation implements DoubleFunc {
        @Override
        public double eval(double x) {
            return x*x;
        }
    }

    private static class Exponent {
        double evalFunc(double x) {
            return Math.exp(-x);
        }
    }
}
