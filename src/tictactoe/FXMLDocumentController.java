/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    public void exit() {
        Platform.exit();
    }
     @FXML
    public void changeScreen(ActionEvent event) throws IOException {
        Parent NewMenuParent = FXMLLoader.load(getClass().getResource("SP.fxml"));
        Scene NewMenuScene = new Scene(NewMenuParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewMenuScene);
        window.show();

    }
       @FXML
    public void changeScreen2(ActionEvent event) throws IOException {
        Parent NewMenuParent = FXMLLoader.load(getClass().getResource("MP.fxml"));
        Scene NewMenuScene = new Scene(NewMenuParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewMenuScene);
        window.show();

    }
       @FXML
    public void changeScreen3(ActionEvent event) throws IOException {
        Parent NewMenuParent = FXMLLoader.load(getClass().getResource("MP2.fxml"));
        Scene NewMenuScene = new Scene(NewMenuParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewMenuScene);
        window.show();

    }
    
    @FXML
    public void changeScreen4(ActionEvent event) throws IOException {
        Parent NewMenuParent = FXMLLoader.load(getClass().getResource("SPSM.fxml"));
        Scene NewMenuScene = new Scene(NewMenuParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewMenuScene);
        window.show();

    }
    public void music() {
        try {
            String a = "abc.wav";
            File musicPath = new File(a);
            if (musicPath.exists()) {
                AudioInputStream audio = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                System.out.println("cant find file");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
        music();
    }

}
