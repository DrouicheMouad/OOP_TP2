package tp2.exo3;

public class StudentClass {
    public double calculateAverage(double[] grades) {
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.length;
    }

    public double findMin(double[] grades) {
        double min = grades[0];
        for (double g : grades) if (g < min) min = g;
        return min;
    }

    public double findMax(double[] grades) {
        double max = grades[0];
        for (double g : grades) if (g > max) max = g;
        return max;
    }
}