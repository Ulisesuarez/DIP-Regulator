public class TermometroPrecisionRidicula implements Thermometer {
    @Override
    public Double read(AmbientTemperature temperature) {
        return temperature.getTemperature();
    }
}
