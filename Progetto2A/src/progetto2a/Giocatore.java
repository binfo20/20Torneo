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

    public Giocatore(String nome, String cognome, int forza) {
        this.nome = nome;
        this.cognome = cognome;
        this.forza = forza;
    } 

    public int getForza() {
        return forza;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
 public boolean TestaDiSerie(int forza){    //se un giocatore ha la forza >= di 10 è testa di serie
     if(forza>=10){
         return true;
     }else return false;
 }
    
    
    @Override
    public String toString() {
        return "Giocatore{" + "nome=" + nome + ", cognome=" + cognome + ", forza=" + forza + '}';
    }
    

}
