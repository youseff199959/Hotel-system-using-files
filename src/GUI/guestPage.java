/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.displayR;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author ahmed mahfouz
 */
public class guestPage {
    
     String s;

    StackPane root = new StackPane();
    Stage stage;
   public guestPage(Stage stage){
   // set title for the stage 
        stage.setTitle("Guest page"); 
  
        // create a tile pane 
        TilePane r = new TilePane(); 
  
        // create a label 
        Label l = new Label("choose the action"); 
        l.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 16));
        Label l2 = new Label("nothing selected"); 
  
        // create a toggle group 
        ToggleGroup tg = new ToggleGroup(); 
        // create radiobuttons 
        RadioButton r1 = new RadioButton("Book a room"); 
        RadioButton r3 = new RadioButton("Delete booking"); 
        Button b=new Button("Submit");
        Button A=new Button("Logout");

  
        // add radiobuttons to toggle group 
        r1.setToggleGroup(tg); 
        r3.setToggleGroup(tg); 
        // add label 
        r.getChildren().add(l); 
        r.getChildren().add(r1); 
        r.getChildren().add(r3); 
        r.getChildren().add(l2); 
        r.getChildren().add(b);
        r.getChildren().add(A);
  
        // create a scene 
        Scene sc = new Scene(r, 200, 300); 
  
        // add a change listener 
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>()  
        { 
            public void changed(ObservableValue <? extends Toggle> ob,  
                                                    Toggle o, Toggle n) 
            { 
  
                RadioButton rb = (RadioButton)tg.getSelectedToggle(); 
  
                if (rb != null) { 
                     s = rb.getText(); 
  
                    // change the label 
                    l2.setText(s + " selected"); 
                } 
            } 
        });
        A.setOnAction(e -> Platform.exit() );
        ///////////////////////////////////////////////////
        
        
        
        b.setOnAction(e -> {
        if( null != s)switch (s) {
                case "Book a room":
                    guestBooking a=new guestBooking(stage);
                    break;
                case "Delete booking":
                    System.out.println("3");
                   // updateR u=new updateR(stage);
                    break;
                default:
                    break;
            }
        
        
        
        });
  
        // set the scene 
        stage.setScene(sc); 
  
        stage.show(); 
   
   
   }
    
}
