package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Inserimento {

    //dicarazione delle label

    @FXML private Label labelnome;
    @FXML private Label labelcognome;

    //dichiarazione delle caselle inserimento dati

    @FXML private TextField nome;
    @FXML private TextField cognome;

    //dichiarazione bottoni

    @FXML private Button invio;
    @FXML private Button torneo;

    public void InvioDati(ActionEvent event){
        String Nome = nome.getText();
        String Cognome = cognome.getText();

        Node node = (Node) event.getSource();
  
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        try {

            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
            stage.setUserData(Nome);
            stage.setUserData(Cognome);
            // Step 6
            Scene scene = new Scene(root);
            stage.setScene(scene);
            // Step 7
            stage.show();
        } catch (IOException e) {
            System.err.println(String.format("Error: %s", e.getMessage()));
        }
        nome.clear();
        cognome.clear();
    }



    public void CambiaScena2(ActionEvent event) throws IOException {

        Parent InserimentoParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene InserimentoScene = new Scene(InserimentoParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InserimentoScene);
        window.show();

    }


}
