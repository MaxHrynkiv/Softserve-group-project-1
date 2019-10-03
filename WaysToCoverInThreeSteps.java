package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaysToCoverInThreeSteps {
    public void start() {
        System.out.println("There is " + calculateNumberOfWays(read()) + " ways to cover distance.");
    }

    private int calculateNumberOfWays(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return calculateNumberOfWays(n - 1) + calculateNumberOfWays(n - 2) + calculateNumberOfWays(n - 3);
    }

    private int read() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter distance(bigger than 2):");
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Entered number should be int-type");
            start();
            try {
                reader.close();
            } catch (IOException ex) {
                System.out.println("Something went wrong...");
            }
            System.exit(0);
        }
        return n;
    }
}
