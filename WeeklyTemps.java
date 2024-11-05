package edu.monmouth.inclass1;

public class WeeklyTemps {

   
    private double[] temperatures;

  
    public WeeklyTemps(double[] temps) {
        if (temps.length != 7) {
            throw new IllegalArgumentException("Array must contain exactly 7 temperatures.");
        }
        this.temperatures = temps;
    }

    
    public double getMean() {
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.length;
    }

    public int getExtreme() {
        int extremeDays = 0;
        for (double temp : temperatures) {
            if (temp < 5 || temp > 95) {
                extremeDays++;
            }
        }
        return extremeDays;
    }

  
    public static void main(String[] args) {
        
        double[] temps = {30, 45, 102, 50, 3, 98, 20};
        WeeklyTemps weeklyTemps = new WeeklyTemps(temps);

        System.out.println("Mean temperature: " + weeklyTemps.getMean());
        System.out.println("Number of extreme temperature days: " + weeklyTemps.getExtreme());
    }
}
