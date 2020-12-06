/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto2a;

import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class Progetto2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner in= new Scanner(System.in);
         int n=0;
         Giocatore gioc[];
         
  System.out.println("quanti giocatori partecipano al torneo ?");
     n=(in.nextInt()) ;
     for(int m=0; m<n; m++){
        gioc=new Giocatore[n];
       System.out.println("inserisci nome:");
      gioc[n].setNome(in.next());
      System.out.println("inserisci cognome:");
     gioc[n].setCognome(in.next());
     System.out.println("inserisci la forza:");
       gioc[n].setForza(in.nextInt());
     
     }
  
     
    }

    
    
}
