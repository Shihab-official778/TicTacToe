/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SPController implements Initializable {

    @FXML
    public void changeScreen(ActionEvent event) throws IOException {
        Parent NewMenuParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene NewMenuScene = new Scene(NewMenuParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewMenuScene);
        window.show();

    }

    @FXML
    private Label label;
    @FXML
    private TextField tf;

    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;

    @FXML
    private Label whosTurn;
    @FXML
    private Label p1;
    @FXML
    private Label p2;

    String turn = "X";
    static String player = "Player 1";
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, val = 0,count=0;

    public void resetGame() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        count = 0;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        c9 = 0;
        val = 0;
        tf.setText(" ");
        whosTurn.setText("Player 1's turn");

    }

    public void stopGame() {
        c1 = 5;
        c2 = 5;
        c3 = 5;
        c4 = 5;
        c5 = 5;
        c6 = 5;
        c7 = 5;
        c8 = 5;
        c9 = 5;
        count=1;
    }

    public void determineTurn() {

        if (turn.equalsIgnoreCase("X")) {

            turn = "O";

            player = "Player 1";

            whosTurn.setText("Player 2's turn");

        } else {

            turn = "X";
            player = "Player 2";
            whosTurn.setText("Player 1's turn");
        }
    }

    public void check() throws Exception {
        val++;
        System.out.println(val);

        if (b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText()) && !"".equals(b1.getText()) && !"".equals(b5.getText()) && !"".equals(b9.getText())) {
            tf.setText(player + " won ");
            stopGame();

        }
        if (b3.getText().equals(b5.getText()) && b3.getText().equals(b7.getText()) && b3.getText() != "" && b5.getText() != "" && b7.getText() != "") {
            tf.setText(player + " won ");
            stopGame();
        }
        if (b1.getText() == b2.getText() && b1.getText() == b3.getText() && b1.getText() != "" && b2.getText() != "" && b3.getText() != "") {
            tf.setText(player + " won ");
            stopGame();
        }
        if (b4.getText() == b5.getText() && b4.getText() == b6.getText() && b4.getText() != "" && b5.getText() != "" && b6.getText() != "") {
            tf.setText(player + " won ");
            stopGame();
        }
        if (b7.getText() == b8.getText() && b7.getText() == b9.getText() && b7.getText() != "" && b8.getText() != "" && b9.getText() != "") {
            tf.setText(player + " won ");
            stopGame();
        }
        if (b1.getText() == b4.getText() && b1.getText() == b7.getText() && b1.getText() != "" && b4.getText() != "" && b7.getText() != "") {
            tf.setText(player + " won ");
            stopGame();
        }
        if (b2.getText() == b5.getText() && b2.getText() == b8.getText() && b2.getText() != "" && b5.getText() != "" && b8.getText() != "") {
            tf.setText(player + " won ");
            stopGame();
        }
        if (b3.getText() == b6.getText() && b3.getText() == b9.getText() && b3.getText() != "" && b6.getText() != "" && b9.getText() != "") {
            tf.setText(player + " won ");
            stopGame();
        }
    }

    public void cit() {
        if (count == 0) {
            tf.setText("Tie!!!");
            stopGame();
        }
    }

    public void button1() {
        if (c1 < 1) {
            b1.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b1.setTextFill(Color.WHITE);
            } else {
                b1.setTextFill(Color.YELLOW);
            }
            determineTurn();
            c1++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(SPController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void button2() {
        if (c2 < 1) {
            b2.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b2.setTextFill(Color.WHITE);
            } else {
                b2.setTextFill(Color.YELLOW);
            }
            determineTurn();
            c2++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(SPController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void button3() {
        if (c3 < 1) {
            b3.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b3.setTextFill(Color.WHITE);
            } else {
                b3.setTextFill(Color.YELLOW);
            }
            determineTurn();
            c3++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(SPController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void button4() {
        if (c4 < 1) {
            b4.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b4.setTextFill(Color.WHITE);
            } else {
                b4.setTextFill(Color.YELLOW);
            }
            determineTurn();
            c4++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(SPController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void button5() {
        if (c5 < 1) {
            b5.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b5.setTextFill(Color.WHITE);
            } else {
                b5.setTextFill(Color.YELLOW);
            }
            determineTurn();
            c5++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(SPController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void button6() {
        if (c6 < 1) {
            b6.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b6.setTextFill(Color.WHITE);
            } else {
                b6.setTextFill(Color.YELLOW);
            }
            determineTurn();
            c6++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(SPController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void button7() {
        if (c7 < 1) {
            b7.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b7.setTextFill(Color.WHITE);
            } else {
                b7.setTextFill(Color.YELLOW);
            }
            determineTurn();
            c7++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(SPController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void button8() {
        if (c8 < 1) {
            b8.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b8.setTextFill(Color.WHITE);
            } else {
                b8.setTextFill(Color.YELLOW);
            }
            determineTurn();
            c8++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(SPController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void button9() {
        if (c9 < 1) {
            b9.setText(turn);
            if (turn.equalsIgnoreCase("X")) {
                b9.setTextFill(Color.WHITE);
            } else {
                b9.setTextFill(Color.YELLOW);
            }
            determineTurn();
            c9++;
            try {
                check();
                if (val == 9) {
                    cit();
                }
            } catch (Exception ex) {
                Logger.getLogger(SPController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }

    
        
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
