package sample;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;
import javafx.scene.control.Label;



public class Controller {

    @FXML
    private TextField text_input;

    @FXML
    private Button encode_button;

    @FXML
    private Label output;

    @FXML
    private TextField input_user_shifter;


    @FXML
    private Button decode_button;


    @FXML
    public void initialize()
    {

    }

    @FXML
    void encoder(MouseEvent event) {
        String input_from_user = text_input.getText();
        int input_from_user_shifter = 0;
        try{
            input_from_user_shifter = Integer.parseInt(input_user_shifter.getText());
        }catch (Exception e ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setContentText("Error, invalid shifter value");
            alert.show();
        }

        for(char c : input_from_user.toCharArray()){
            if (!((c >= 65 && c <= 90)||(c>=97&&c<=122))){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Input");
                alert.setContentText("Error, special character detected");
                alert.show();
                input_from_user = "-1";
                break;
            }
        }


        if(input_from_user != "-1"){
            output.setText(Caesar_Cipher.caesar_encode(input_from_user,input_from_user_shifter));

        }
    }

    @FXML
    void decoder(MouseEvent event){
        String input_from_user = text_input.getText();
        int input_from_user_shifter = 0;
        try{
            input_from_user_shifter = Integer.parseInt(input_user_shifter.getText());
        }catch (Exception e ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setContentText("Error, invalid shifter value");
            alert.show();
        }

        for(char c : input_from_user.toCharArray()){
            if (!((c >= 65 && c <= 90)||(c>=97&&c<=122))){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Input");
                alert.setContentText("Error, special character detected");

                alert.show();
                input_from_user = "-1";
                break;
            }
        }
        if(input_from_user != "-1"){
            output.setText(Caesar_Cipher.caesar_decode(input_from_user,input_from_user_shifter));

        }

    }



}