package sample;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    //dichiarazione choicebox dei partecipanti

    @FXML private ChoiceBox partecipante1;
    @FXML private ChoiceBox partecipante2;
    @FXML private ChoiceBox partecipante3;
    @FXML private ChoiceBox partecipante4;
    @FXML private ChoiceBox partecipante5;
    @FXML private ChoiceBox partecipante6;
    @FXML private ChoiceBox partecipante7;
    @FXML private ChoiceBox partecipante8;

    //dichiarazione match button

    @FXML private Button match1;
    @FXML private Button match2;
    @FXML private Button match3;
    @FXML private Button match4;
    @FXML private Button match5;
    @FXML private Button match6;
    @FXML private Button match7;

    //dichiarazione Label dei vincitori dei match

    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;
    @FXML private Label label4;
    @FXML private Label label5;
    @FXML private Label label6;
    @FXML private Label label7;

    //dichiarazione slot punteggi

    @FXML private TextField pt1;
    @FXML private TextField pt2;
    @FXML private TextField pt3;
    @FXML private TextField pt4;
    @FXML private TextField pt5;
    @FXML private TextField pt6;
    @FXML private TextField pt7;
    @FXML private TextField pt8;
    @FXML private TextField pt9;
    @FXML private TextField pt10;
    @FXML private TextField pt11;
    @FXML private TextField pt12;
    @FXML private TextField pt13;
    @FXML private TextField pt14;


        //metodo cambia scenaa

        public void CambiaScena(ActionEvent event) throws IOException {

            Parent InserimentoParent = FXMLLoader.load(getClass().getResource("Inserimento .fxml"));
            Scene InserimentoScene = new Scene(InserimentoParent);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(InserimentoScene);
            window.show();

        }

        public void RiceviDati(ActionEvent event){


            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();

            String Dati = (String) stage.getUserData();

            partecipante1.getItems().add(Dati);



        }









    }

