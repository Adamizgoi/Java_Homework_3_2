public class BmiService {

    public double calculate(double growth, double weight) {
        double result;
        double growthFactor = growth / 100;
        double growthFinalFactor = growthFactor * growthFactor;

        if (growth > 0 && weight > 0) {
            result = weight / growthFinalFactor;
        } else {
            result = 0;
        }

        return result;

    }
}
