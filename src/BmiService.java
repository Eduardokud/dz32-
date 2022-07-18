public class BmiService {
    public double calculate(double ves, double rostM){
        double result;
        double rost = rostM / 100;//

        result = ves / rost / rost;
        return result;
    }

}
