package gestion;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Queue;

public class colis {

    float codeabarre;
    public client c;

    float poids;
    int length;

    public colis( float code,float poids) {

        this.poids = poids;
        this.codeabarre = code;
    }

   
    public double cout() {
        double prix = (this.poids * 4.3) / 2;
        return prix;

    }

    public void fichier() {
        try {
            String content = this.codeabarre+ " " + this.poids + " " + this.cout();

            File file = new File("C://Users/ASUS/Desktop/COMMANDES/" + "COLIS.txt");
            // créer le fichier s'il n'existe pas

            if (!file.exists()) {
                file.createNewFile();

            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(content);
            bw.newLine();
            bw.close();
         
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
