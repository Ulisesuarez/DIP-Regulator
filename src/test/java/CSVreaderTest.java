import org.junit.Test;

import static org.junit.Assert.*;

public class CSVreaderTest {

    @Test
    public void readerCSV() {
        int ind=0;
        Double[][] arr = CSVreader.Reader();
        for (Double[] pair :arr){

            System.out.println(pair[0]);
            System.out.println(pair[1]);
            System.out.println("----------------"+ind);
            ind++;
        }
    }
}