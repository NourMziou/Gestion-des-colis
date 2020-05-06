package gestion;

import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class client {

    protected String Nom;
    protected String ville;
    protected String adresse;
    public colis co;
    protected long numtél;
    public long id;
    protected long clebancaire;
    protected String paiement;

    public void fich() {
        try {

            String content = this.Nom + " " + this.adresse + " " + this.ville + " " + this.id + " " + this.numtél;

            File file = new File("C://Users/ASUS/Desktop/CLIENTS/" + "clients.txt");

            // créer le fichier s'il n'existe pas
            if (!file.exists()) {

                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(content);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public client(String No, String adress, String ville, long ident, long num) {
        this.Nom = No;
        this.adresse = adress;

        this.numtél = num;

        this.id = ident;

    }

    public int suivi() {
        String[][] tableau = new String[2][5];
        tableau[0][0] = "tunis";
        tableau[0][1] = "hamemet";
        tableau[0][2] = "sfax";
        tableau[0][3] = "sousse";
        tableau[0][4] = "Gabes";
        tableau[1][0] = "30 minutes";
        tableau[1][1] = "1 heure et 15 minutes";
        tableau[1][2] = "3 heures";
        tableau[1][3] = "2 heures et 15 minutes";
        tableau[1][4] = "5 heures";
        System.out.println("veullez suivre votr colis");
      
            for (int j = 0; j < tableau[0].length; j++) {

                if (tableau[0][j].equals(this.ville)) {

                    System.out.println(tableau[1][j]);

                }
            }
return 1;
        }
    

    public long getid() {
        return (this.id);
    }

    public String getadreese() {
        return (this.adresse);
    }

    public String getNom() {
        return (this.Nom);
    }

    public long getnumtél() {
        return (this.numtél);
    }

    public long getclebancaire() {
        return (this.clebancaire);
    }
}
