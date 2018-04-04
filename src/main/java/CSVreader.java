import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CSVreader {

    public static Double[][] Reader() {

        String csvFile = "/home/ulises/Micarpeta/proyectos/java/InversionDependencias/src/main/resources/TempMaxyMin2010.csv";
        String line = "";
        String cvsSplitBy = ",";
        Double [][] TempMaxMin=new Double[366][2];
        int valor=0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] numeros = line.split(cvsSplitBy);
                TempMaxMin[valor][0]=Double.parseDouble(numeros[0]);
                TempMaxMin[valor][1]=Double.parseDouble(numeros[1]);
                valor++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

       return TempMaxMin; }

}


