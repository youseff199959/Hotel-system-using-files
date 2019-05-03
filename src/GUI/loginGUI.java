/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.addReceptioest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author ahmed mahfouz
 */
public class loginGUI extends Application {
    
    @Override
    public void start(Stage myStage) {
        
        myStage.setTitle("Login Page");

        GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );

        Scene myScene = new Scene(rootNode);
        Label l = new Label("Log In"); 
      //  l.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 16));
        rootNode.add(l,0,0);
        rootNode.add( new Label("Username"), 0,2);
        TextField firstValue= new TextField();
        rootNode.add(firstValue, 1, 2);
        rootNode.add( new Label ("Password"), 0, 3); 
        TextField x=new TextField();
        rootNode.add(x, 1, 3);       
        Button aButton = new Button("login");
        rootNode.add(aButton, 1, 5);
        rootNode.setHalignment(aButton, HPos.LEFT);
         aButton.setOnAction(e -> {
         String value1 = String.valueOf(firstValue.getText());
         String value2 = String.valueOf(x.getText());
         System.out.println(value1+"\n"+value2);
         if ("1".equals(value1) && "1".equals(value2)){
         Alert alert=new Alert(Alert.AlertType.INFORMATION,"You Have Login As a Admin");
         alert.show();
         Adminpage a=new Adminpage(myStage);
         }
        else if ("kareem@gmail.com".equals(value1) && "123456".equals(value2)){
         Alert alert=new Alert(Alert.AlertType.INFORMATION,"You Have Login As a Admin");
         alert.show();
         Adminpage a=new Adminpage(myStage);
         }
         else if("ussef@gmail.com".equals(value1)&&"230230".equals(value2)){
         Alert alert=new Alert(Alert.AlertType.INFORMATION,"You Have Login As A Receptionest");
         alert.show();
         RecPage r=new RecPage(myStage);
         }
         
         else if("2".equals(value1)&&"2".equals(value2)){
         Alert alert=new Alert(Alert.AlertType.INFORMATION,"You Have Login As A Receptionest");
         alert.show();
         RecPage RP=new RecPage(myStage);
         
         }
         
         else if("guest".equals(value1)&&"10".equals(value2)){
         Alert alert=new Alert(Alert.AlertType.INFORMATION,"You Have Login As A Guest");
         alert.show();
         guestBooking GP=new guestBooking(myStage);
         }
         else{
         Alert alert=new Alert(Alert.AlertType.ERROR,"login faild");
         alert.show();
         }
         

        } );
        myStage.setScene( myScene);
        myStage.show();     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
