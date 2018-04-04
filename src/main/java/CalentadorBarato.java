public class CalentadorBarato implements Heater{

    @Override
    public void engage(AmbientTemperature temperature) {
        Double tempRaise=temperature.getTemperature()+0.01;
        temperature.setTemperature(tempRaise);
    }

    @Override
    public void disengage(AmbientTemperature temperature) {
        Double tempDrop=temperature.getTemperature()-0.5;
        temperature.setTemperature(tempDrop);

    }
}
