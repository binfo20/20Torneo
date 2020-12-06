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
public class Giocatore {
    String nome;
    String cognome;
    int forza;


    public int getForza() {
        return forza;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }
    
 public boolean TestaDiSerie(int forza){    //se un giocatore ha la forza >= di 10 è testa di serie
     if(forza>=10){
         return true;
     }else return false;
 }
    
}
