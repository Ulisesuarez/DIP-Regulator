public class TermometroBarato implements Thermometer {
    @Override
    public Double read(AmbientTemperature temperature) {
        int lectura= temperature.getTemperature().intValue();
        return (Double)(double) lectura;
    }
}
