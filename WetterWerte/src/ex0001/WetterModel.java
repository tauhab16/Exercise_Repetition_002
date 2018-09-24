package ex0001;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WetterModel {

    private ArrayList<WetterWert> list = new ArrayList();

    public void einfuegen(WetterWert w) {
        list.add(w);
    }

    public void laden(File file) throws Exception {
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufferreader = new BufferedReader(filereader);
            String line = "";

            while ((line = bufferreader.readLine()) != null) {
                String[] s = line.split(";");
                einfuegen(new WetterWert(Integer.parseInt(s[1]), Integer.parseInt(s[2]), s[0]));
            }
            bufferreader.close();
            filereader.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String[] getInhalt() {
        String feld[] = new String[list.size()];
        for (int i = 0; i < feld.length; ++i) {
            feld[i] = list.get(i).getZeitpunkt() + "  -  " + list.get(i).getTemperatur() + "%  -  " + list.get(i).getLuftfeuchtigkeit() + "° ";
        }
        return feld;
    }

    public void speichern(File file) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        for (WetterWert w : list) {
            pw.print(w.getZeitpunkt() + ";");
            pw.print(w.getTemperatur() + ";");
            pw.println(w.getLuftfeuchtigkeit() + ";");

        }
        pw.close();
    }

}
