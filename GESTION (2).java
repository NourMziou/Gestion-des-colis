package gestion;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import gestion.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import static javafx.scene.input.KeyCode.P;

public class GESTION {

    public static void menuprincipal() {

        System.out.flush();
        System.out.println("\t\t---------------------------------------");
        System.out.println("\t\t|                                     |");

        System.out.println("\t\t|  Gestion de distribution des colis  |");
        System.out.println("\t\t|                                     |");

        System.out.println("\t\t---------------------------------------");

        System.out.println("\n");
        System.out.println("----------------------------------Menu------------------------------------");
        System.out.println("\n");
        System.out.println("saisir un nouveau colis");
        System.out.println("\n");
        System.out.println("suivuie du colis");
        System.out.println("\n");
        System.out.println("bureau");
        System.out.println("\n");
    }

    public static void menuPrinc() {

        System.out.println("\n");
    }

    static void menuclient() {

        System.out.flush();

        System.out.println("\n");
        System.out.println("--------------------------Menu pour le client-----------------------------");
        System.out.println("\n");
        System.out.println("saisir votre nom");
        System.out.println("\n");
        System.out.println("saisir votre adresse");
        System.out.println("\n");
        System.out.println("saisir votre ville");
        System.out.println("\n");
        System.out.println("saisir votre numéro de téléphone");
        System.out.println("\n");
        System.out.println("saisir votre identifiant");

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
 menuprincipal();
        menuPrinc();
        menuclient();
        System.out.println("-----------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("donner les donnnes des clients");
        String nom = sc.nextLine();
        String add = sc.nextLine();
        String ville = sc.nextLine();
        long num = sc.nextLong();
        long id = sc.nextLong();

        File dossier = new File("C://Users/ASUS/Desktop/CLIENTS/");
        if (dossier.isDirectory() != true) {
            try {
                dossier.mkdir();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        client c = new client(nom, add, ville, id, num);
        c.fich();

        File dossie = new File("C://Users/ASUS/Desktop/COMMANDES/");
        if (dossie.isDirectory() != true) {
            try {
                dossie.mkdir();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("donnez les attributs du colis ");
        float code = sc.nextFloat();
        float poids = sc.nextFloat();

        colis col = new colis(code, poids);
        col.fichier();
        transporteur t1 = new transporteur();
        t1.amenagement();
        System.out.println("vous suivez votre suivit");
        int suivi = c.suivi();
         
           
                
            }

        }

       

   
   


