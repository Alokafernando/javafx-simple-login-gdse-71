package lk.ijse.gdse.work.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.io.IOException;

public class SignUpController {

    String username = "hello";
    String password = "1234";

    @FXML
    private Button btnsignup;

    @FXML
    private AnchorPane signup;

    @FXML
    private TextField txtpassword;

    @FXML
    private TextField txtusername;

    /*public void check(String username, String password) throws IOException {
        String u = txtusername.getText();
        String p = txtpassword.getText();

        if (username.equals(u) && password.equals(p)) {


        }
    }*/


   @FXML
    void action(ActionEvent event) throws IOException {

       String u = txtusername.getText();
       String p = txtpassword.getText();


       if (username.equals(u) & password.equals(p)) {
           signup.getChildren().clear();
           AnchorPane load = FXMLLoader.load(getClass().getResource("/view/DashboardPage.fxml"));
           signup.getChildren().add(load);

       }else{
           JOptionPane.showMessageDialog(null, "invalid username or password!");
       }
    }

}
