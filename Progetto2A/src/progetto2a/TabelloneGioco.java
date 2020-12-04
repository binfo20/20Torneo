/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto2a;

/**
 *
 * @author Tommy
 */
public class TabelloneGioco {
   String giocatore[] ;
    String coppia ;

    
    
    public TabelloneGioco(String[] giocatore, String coppia) {
        this.giocatore = giocatore;
        this.coppia = coppia;
    }

    
    public String getCoppia() {
       
        return coppia;
    }  
}
