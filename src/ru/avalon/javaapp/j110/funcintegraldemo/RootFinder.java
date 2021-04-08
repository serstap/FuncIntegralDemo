package ru.avalon.javaapp.j110.funcintegraldemo;

public class RootFinder {
    public static double findRoot(DoubleFunc func,
                                  double xa, double xb, int n) {
        double xi = (xb - xa) / n;
        double si = 0;
        while (xa <= xb) {
            double s = xi * func.eval(xa);
            si = si + s;
            xa = xa + xi;

        }
        return si;
    }
}