/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bureau {

    protected FileWriter FW;
    protected BufferedWriter BW;
    protected Date date;
    public transporteur t;
    protected String adressemail;
    public client c;
    public colis co;
    public String line;

    
    public bureau() {
    }

   /* public void comapraison() throws FileNotFoundException, IOException {
        try ( ///BufferedReader in =new BufferedReader (new FileReader("C://Users/ASUS/Desktop/COLIS/"));

                BufferedReader i = new BufferedReader(new FileReader("C://Users/ASUS/Desktop/COLIS/" + "COLIS.txt"))) {

            float somme = 0;
            float po = 0;
            String ch = "";
            try {
                while ((line = i.readLine()) != null) {
                    String[] tab = line.split(" ");
                    System.out.println(Arrays.toString(tab));
                    ch = tab[1];
                    po = Float.parseFloat(ch);
                    somme += po;
                    while (70> somme) {
                        ficher();
                        while ((line = lecteurAvecBuffer.readLine()) != null) {
                            System.out.println(line);
                            FileWriter writer = new FileWriter("COlis.txt", false);

                            lecteurAvecBuffer.close();
                        }
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(bureau.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    public void ficher() {
        try {

            File file = new File("C://Users/ASUS/Desktop/COLIS/" + "COLISrendu.txt");
            // créer le fichier s'il n'existe pas

            if (!file.exists()) {
                file.createNewFile();

            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(line);
            bw.newLine();
            bw.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }*/

}
