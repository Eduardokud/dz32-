public class BmiService {
    public double calculate(double v, double r){
        double result;
        double nr = r / 100;//

        result = v / nr / nr;
        return result;
    }

}
