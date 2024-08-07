package com.example.onlinegamingplatformaoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginNotification implements Initializable {

    @FXML
    private Button exitBtn;

    @FXML
    void exitGame(ActionEvent event) throws IOException {
        if (event.getSource() == exitBtn){
            Parent root = FXMLLoader.load(getClass().getResource("LoginFile.fxml"));
            //bodyPane.getChildren().setAll(root);
            Stage stage = ((Stage)((Node)event.getSource()).getScene().getWindow());
            Scene scene = new Scene(root,599,332);
            stage.setX(300);
            stage.setY(200);
            stage.setScene(scene);
            stage.show();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
