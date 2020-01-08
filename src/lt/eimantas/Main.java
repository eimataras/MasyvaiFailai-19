package lt.eimantas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main object = new Main();
        object.atidarytiFaila();
        object.skaitymasIsFailo();
    }

    private FileReader _in;
    private BufferedReader _bufferis;
    private String _failoVardas = "vardai.txt";

    public void atidarytiFaila() {
        try {
            _in = new FileReader(_failoVardas);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {
            System.out.println("Nepavyko atidaryti failo");
        }
    }


    public void skaitymasIsFailo() {
        try {
            String eilute = _bufferis.readLine();
            while (eilute != null)  {
                if (eilute.charAt(0) == 'A') {
                    System.out.println(eilute + ". Ilgis: " + eilute.length() + " .Pirma raide: "+eilute.charAt(0));
                }
                eilute = _bufferis.readLine();
            }

            _bufferis.close();
            _in.close();
        } catch (
                Exception e) {
            System.out.println("Nepavyko nuskaityti failo");
        }
    }
}
