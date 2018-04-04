public class Regulator {

    public static void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, AmbientTemperature temperature){
        RegulatorDisplayCodes code;
        while(t.read(temperature) < maxTemp){
            code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message(code, temperature);
        }
        while (t.read(temperature) > minTemp){
            code = RegulatorDisplayCodes.WAITING;
            h.disengage(temperature);
            message(code, temperature);
        }
    }

    private static void message(RegulatorDisplayCodes code, AmbientTemperature temperature){

        System.out.println("The temperature is "+ temperature.getTemperature() + ", so the Heater is " + code.toString());

    }

}