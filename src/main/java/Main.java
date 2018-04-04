public class Main {
    public static void main (String[] args){
        TermometroBarato termb= new TermometroBarato();
        CalentadorBarato calb = new CalentadorBarato();
        AmbientTemperature temp =new AmbientTemperature();

    Regulator.regulate(termb,calb,12.5,16.5,temp);
    }
}
