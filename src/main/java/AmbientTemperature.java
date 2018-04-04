import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

public class AmbientTemperature {
    private  Double temperature = 0d;
    private  int dayOfYear = 0;

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public AmbientTemperature(){
        this.temperature = CalculeTemp();
    }

    public Double getTemperature() {
        return this.temperature;
    }

    public  Double CalculeTemp() {
        Calendar calendar = Calendar.getInstance();
        dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        Double[][] MaxMinTemperatures = CSVreader.Reader();
        Double randomTemperature = ThreadLocalRandom.current().nextDouble(MaxMinTemperatures[dayOfYear][1], MaxMinTemperatures[dayOfYear][0]);
    return randomTemperature;}

}
