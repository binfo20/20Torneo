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
import java.util.ArrayList;

public class Controller {

    ArrayList<String> winners = new ArrayList<String>();
    ArrayList<String> winners2 = new ArrayList<String>();

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

    //dichiarazione nomi partecipanti

    @FXML private TextField cognome1;
    @FXML private TextField cognome2;
    @FXML private TextField cognome3;
    @FXML private TextField cognome4;
    @FXML private TextField cognome5;
    @FXML private TextField cognome6;
    @FXML private TextField cognome7;
    @FXML private TextField cognome8;

        public void Partita1(ActionEvent event){


            int parsed1 = Integer.parseInt(pt1.getText());
            int parsed2 = Integer.parseInt(pt2.getText());

            if(parsed1 > parsed2){
                label1.setText(String.valueOf(cognome1.getText()));
                winners.add(cognome1.getText());
            }else{
                label1.setText(String.valueOf(cognome2.getText()));
                winners.add(cognome2.getText());
            }


        }

        public void Partita2(ActionEvent event){


            int parsed3 = Integer.parseInt(pt3.getText());
            int parsed4 = Integer.parseInt(pt4.getText());

            if(parsed3 > parsed4){
                label2.setText(String.valueOf(cognome3.getText()));
                winners.add(cognome3.getText());
            }else{
                label2.setText(String.valueOf(cognome4.getText()));
                winners.add(cognome4.getText());
            }

        }

    public void Partita3(ActionEvent event){


        int parsed5 = Integer.parseInt(pt5.getText());
        int parsed6 = Integer.parseInt(pt6.getText());

        if(parsed5 > parsed6){
            label3.setText(String.valueOf(cognome5.getText()));
            winners.add(cognome5.getText());
        }else{
            label3.setText(String.valueOf(cognome6.getText()));
            winners.add(cognome6.getText());
        }

        }

    public void Partita4(ActionEvent event){


        int parsed7 = Integer.parseInt(pt7.getText());
        int parsed8 = Integer.parseInt(pt8.getText());

        if(parsed7 > parsed8){
            label4.setText(String.valueOf(cognome7.getText()));
            winners.add(cognome7.getText());
        }else{
            label4.setText(String.valueOf(cognome8.getText()));
            winners.add(cognome8.getText());
        }

    }

    public void Partita5(ActionEvent event){



        int parsed9 = Integer.parseInt(pt9.getText());
        int parsed10 = Integer.parseInt(pt10.getText());

        if(parsed9 > parsed10){
            label5.setText(String.valueOf(winners.get(0)));
            winners2.add(winners.get(0));
        }else{
            label5.setText(String.valueOf(winners.get(1)));
            winners2.add(winners.get(1));
        }

    }

    public void Partita6(ActionEvent event){


        int parsed11 = Integer.parseInt(pt11.getText());
        int parsed12 = Integer.parseInt(pt12.getText());

        if(parsed11 > parsed12){
            label6.setText(String.valueOf(winners.get(2)));
            winners2.add(winners.get(2));
        }else{
            label6.setText(String.valueOf(winners.get(3)));
            winners2.add(winners.get(3));
        }

    }

    public void PartitaFinale(ActionEvent event){

        int parsed13 = Integer.parseInt(pt13.getText());
        int parsed14 = Integer.parseInt(pt14.getText());

        if(parsed13 > parsed14){
            label7.setText(String.valueOf(winners2.get(0)));
        }else{
            label7.setText(String.valueOf(winners2.get(1)));
        }

    }


        //metodo cambia scenaa

        public void CambiaScena(ActionEvent event) throws IOException {

            Parent InserimentoParent = FXMLLoader.load(getClass().getResource("Inserimento .fxml"));
            Scene InserimentoScene = new Scene(InserimentoParent);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(InserimentoScene);
            window.show();

        }











    }

