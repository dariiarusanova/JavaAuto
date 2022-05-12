package org.example.lesson4;

public class TriangleFindTheArea {
    public static double TriangleArea(double firstSide, double secondSide, double thirdSide) throws Exception {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new Exception("One of the sizes is <=0. Please change parameters");
        }
        double p = (firstSide + secondSide + thirdSide) / 2;

        System.out.println("The triangle's area: " + Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide)));

        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }
}




