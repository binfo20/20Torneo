package sample;

public class Giocatore {


        private String nome;
        private String cognome;
        private int id;

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getCognome() {
            return cognome;
        }
        public void setCognome(String cognome) {
            this.cognome = cognome;
        }

        public String toString() {
            return "Nome: " + nome +"\n" +
                    "Cognome: " + cognome + "\n" +
                    "ID: " + id + "\n";
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

}

