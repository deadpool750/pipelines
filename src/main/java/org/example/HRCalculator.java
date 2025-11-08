package org.example;

public class HRCalculator {
    public static int calculateMaxHR(int age){
        if(age < 0 || age>120){
            throw new IllegalArgumentException(
                    "Age out of bounds"
            );
        }
        return 220 - age;
    }
    public static String getWorkoutZone(int age, int bpm) {
        int max = calculateMaxHR(age);
        double pct = (double) bpm / max;

        if (pct < 0.5) return "Below Training Zone";
        if (pct < 0.6) return "Very Light";
        if (pct < 0.7) return "Light";
        if (pct < 0.8) return "Moderate";
        if (pct < 0.9) return "Hard";
        return "Very Hard";
    }

}