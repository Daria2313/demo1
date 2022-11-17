package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JungkookController {

    @FXML
    private Button vedenie;

    @FXML
    void initialize(){
        vedenie.setOnAction(clik->{

            vedenie.getScene().getWindow().hide();
            try{
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Add2.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            }
            catch (Exception e){
                e.printStackTrace();
            }

        });

    }

}


