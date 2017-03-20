package ru.samsung.myitscholl.book;

import java.io.PrintStream;
import java.util.Scanner;

public class CrossLines {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        double k1, b1, k2, b2;
        k1 = in.nextDouble();
        b1 = in.nextDouble();
        k2 = in.nextDouble();
        b2 = in.nextDouble();
        double[] cross = crossLines(k1, b1, k2, b2);
        if (cross != null) {
            out.println("Intersect (" + cross[0] + ", " + cross[1] + ")");
        }
        else {
            out.println("Do nor intersect");
        }
    }

    // ‘ункци€ пересекает две пр€мые на плоскости,
    // заданных уравнением y = kx + b.
    // ≈сли пр€мые не пересекаютс€ или совпадают,
    // товозвращаетс€ null.
    public static double[] crossLines(double k1, double b1, double k2, double b2) {
        Double dk = k1 - k2;
        // если они параллельны, то возвращаем null
        if (dk == 0.0) {
            return null;
        }
        // формула получена из системы уравнений
        double x = (b2 - b1) / dk;
        double y = k1 * x + b1;
        // ѕроверка того, что полученна€ точка находитс€
        // на обоих пр€мых (проверка инвариантов).
        // „тобы проверка работала необходимо добавить в
        // Run Configurations ? Arguments ? VM Arguments
        // строку -ea.
        assert onLine(k1, b1, x, y);
        assert onLine(k2, b2, x, y);
        return new double[]{x, y};
    }

    // ‘ункци€ провер€ет, что точка лежит на пр€мой,
    // заданной уравнением y = kx + b.
    private static boolean onLine(double k, double b, double x, double y) {
        return y == k * x + b;
    }
}
