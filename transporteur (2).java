package gestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class transporteur {

    public float capacité = 100;
    public client c;

    public transporteur() {
    }
    public void amenagement() throws FileNotFoundException, IOException{
      try ( ///BufferedReader in =new BufferedReader (new FileReader("C://Users/ASUS/Desktop/COMMANDES/"));

                BufferedReader i = new BufferedReader(new FileReader("C://Users/ASUS/Desktop/COMMANDES/" + "COLIS.txt"))) {
            String line;
            float somme = 0;
            float po =  0;
            String ch = "";
            Queue<String[]> q = new LinkedList<>();
            while ((line = i.readLine()) != null) {
                String[] tab = line.split(" ");
                System.out.println(Arrays.toString(tab));
                q.add(tab);
                //System.out.println(q);
                String tab1[] = q.peek();
                ch = tab1[1];
                po=Float.valueOf(ch);
                somme += po;
                if (this.capacité > somme) {
                    String tab2[] = q.remove();
                    //System.out.println(Arrays.toString(tab2));
                    int msg = 0;

                    System.out.println(msg);
                   
                   
                } else {
                    
                    int msg = 1;
                    System.out.println(msg);
                    String tab3[] = q.peek();
                    //String  Ch = tab3[1];
                    //Float p1= Float.parseFloat(Ch);
                    somme = somme - po;
                    this.capacité = 200;
                    msg = 0;

                    System.out.println(msg);
                }

            }
            

        }

   
    }
        }
    
