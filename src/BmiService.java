public class BmiService {
    public double calculate(double weight, double growhtInMeters){
        double result;
        double rost = growhtInMeters / 100;//

        result = weight / rost / rost;
        return result;
    }

}
