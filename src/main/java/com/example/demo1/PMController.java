package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PMController {

    @FXML
    private Button button;

    @FXML
    void initialize(){
        button.setOnAction(clik->{

            button.getScene().getWindow().hide();
            try{
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("app.fxml"));
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






