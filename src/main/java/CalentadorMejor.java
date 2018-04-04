public class CalentadorMejor implements Heater{
    @Override
    public void engage(AmbientTemperature temperature) {
        Double tempRaise=temperature.getTemperature()+0.9;
        temperature.setTemperature(tempRaise);
    }

    @Override
    public void disengage(AmbientTemperature temperature) {
        Double tempDrop=temperature.getTemperature()-0.4;
        temperature.setTemperature(tempDrop);

    }
}
