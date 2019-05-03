/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
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
public class Adminpage
{ String s;

    StackPane root = new StackPane();
    Stage stage;

public Adminpage(Stage stage)
{
    
    
        
        // set title for the stage 
        stage.setTitle("Admin page"); 
  
        // create a tile pane 
        TilePane r = new TilePane(); 
  
        // create a label 
        Label l = new Label("choose the action"); 
        l.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 16));
        Label l1 =new Label("Receptation options");
        l1.setFont(Font.font("verdana", FontPosture.REGULAR, 16));
        Label l3 =new Label("Rooms options");
        l3.setFont(Font.font("verdana", FontPosture.REGULAR, 16));

        Label l2 = new Label("nothing selected"); 
  
        // create a toggle group 
        ToggleGroup tg = new ToggleGroup(); 
        // create radiobuttons 
        RadioButton r1 = new RadioButton("Add Receptionest"); 
        RadioButton r2 = new RadioButton("Search For Receptionist"); 
        RadioButton r3 = new RadioButton("Update Receptionist"); 
        RadioButton r4 = new RadioButton("Delete Receptionist"); 
        RadioButton r5 = new RadioButton("Add Room"); 
        RadioButton r6 = new RadioButton("Search For Room"); 
        RadioButton r7 = new RadioButton("Update Room"); 
        RadioButton r8 = new RadioButton("Delete Room"); 
        RadioButton r9 = new RadioButton("Display Room"); 
        RadioButton r10 = new RadioButton("Display Receptionist"); 
        Button b=new Button("Submit");
        Button A=new Button("Logout");
        Button report =new Button("Generate Report");
  
        // add radiobuttons to toggle group 
        r1.setToggleGroup(tg); 
        r2.setToggleGroup(tg); 
        r3.setToggleGroup(tg); 
        r4.setToggleGroup(tg);
        r5.setToggleGroup(tg);
        r6.setToggleGroup(tg);
        r7.setToggleGroup(tg);
        r8.setToggleGroup(tg);
        r9.setToggleGroup(tg);
        r10.setToggleGroup(tg);
  
        // add label 
        r.getChildren().add(l); 
        r.getChildren().add(l1); 
        r.getChildren().add(r1); 
        r.getChildren().add(r2); 
        r.getChildren().add(r3); 
        r.getChildren().add(r4);
        r.getChildren().add(r10);
        r.getChildren().add(l3);
        r.getChildren().add(r5);
        r.getChildren().add(r6);
        r.getChildren().add(r7);
        r.getChildren().add(r8);
        r.getChildren().add(r9);
        r.getChildren().add(l2); 
        r.getChildren().add(b);
        r.getChildren().add(report);
        r.getChildren().add(A);
  
        // create a scene 
        Scene sc = new Scene(r, 200, 550); 
  
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
        report.setOnAction(e ->{
        generateReport GD=new generateReport(stage);
        
        
        });
        
        
        
        b.setOnAction(e -> {
        if( null != s)switch (s) {
                case "Add Receptionest":
                    addReceptioest a=new addReceptioest(stage);
                    break;
                case "Search For Receptionist":
                    System.out.println("2");
                    searchR S=new searchR(stage);
                    break;
                case "Update Receptionist":
                    System.out.println("3");
                    updateR u=new updateR(stage);
                    break;
                case "Delete Receptionist":
                    System.out.println("4");
                    deleteR d=new deleteR(stage);
                    break;
                case "Add Room":
                    System.out.println("5");
                    addRoom B=new addRoom(stage);
                    break;
                case "Search For Room":
                    System.out.println("6");
                    searchRoom SR=new searchRoom(stage);
                    break;
                case "Update Room":
                    System.out.println("7");
                    updateRoom UR=new updateRoom(stage);
                    break;
                case "Delete Room":
                    System.out.println("8");
                    deleteRoom DR=new deleteRoom(stage);
                    break;
                case "Display Room":
                    System.out.println("9");
                    displayRoom dR=new displayRoom(stage);
                    break;
                case "Display Receptionist":
                    System.out.println("10");
                    displayR DRR=new displayR(stage);
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