package omprakash.tdd;

public class Primorial {

    public int findPrimorial(int n) {
        int primorial = 1;
        if (n < 1) {
            primorial = -1;
        } else {
            int primesCount = 0;
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (primesCount != n) {
                    int factors = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            factors++;
                        }
                    }
                    if (factors == 2) {
                        primesCount++;
                        primorial *= i;
                    }
                } else {
                    break;
                }
            }
        }
        return primorial;
    }
}
