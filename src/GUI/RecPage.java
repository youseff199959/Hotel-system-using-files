/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author ahmed mahfouz
 */
public class RecPage {
    String s;
    // set title for the stage 
       public RecPage(Stage stage){ 
           
       
       stage.setTitle("Receptionest page");

    
        
    
  
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
        RadioButton r2 = new RadioButton("Search For a gesut"); 
        RadioButton r3 = new RadioButton("Update guest's data"); 
        RadioButton r4 = new RadioButton("Search for a room"); 
        RadioButton r5 = new RadioButton("Update room's data"); 
        RadioButton r6 = new RadioButton("list rooms"); 
        RadioButton r7 = new RadioButton("list guests"); 
       /* RadioButton r8 = new RadioButton("generate bill"); */
        Button b=new Button("Submit");
        Button B=new Button("Generate Bill");
        Button A=new Button("Logout");
  
        // add radiobuttons to toggle group 
        r1.setToggleGroup(tg); 
        r2.setToggleGroup(tg); 
        r3.setToggleGroup(tg); 
        r4.setToggleGroup(tg);
        r5.setToggleGroup(tg);
        r6.setToggleGroup(tg);
        r7.setToggleGroup(tg);
     /*   r8.setToggleGroup(tg);*/
  
        // add label 
        r.getChildren().add(l); 

        r.getChildren().add(r1); 
        r.getChildren().add(r2); 
        r.getChildren().add(r3); 
        r.getChildren().add(r4);
        r.getChildren().add(r5);
        r.getChildren().add(r6);
        r.getChildren().add(r7);
       /* r.getChildren().add(r8);*/
        r.getChildren().add(l2); 
        r.getChildren().add(b);
        r.getChildren().add(B);
        r.getChildren().add(A);
  
        // create a scene 
        Scene sc = new Scene(r, 200, 500); 
  
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
        B.setOnAction(e -> {
        
        generateBill BBB=new generateBill(stage);
        });
        /////////////////////////////////////////////////
        
        
        b.setOnAction(e -> {
        if( null != s)switch (s) {
                case "Book a room":
                    recBooking a=new recBooking(stage);
                    break;
                case "Search For a gesut":
                    System.out.println("2");
                    searchGuest S=new searchGuest(stage);
                    break;
                case "Update guest's data":
                    System.out.println("3");
                    updateGuest u=new updateGuest(stage);
                    break;
                case "Search for a room":
                    System.out.println("4");
                    roomSerach d=new roomSerach(stage);
                    break;
                case "Update room's data":
                    System.out.println("5");
                    updateRoomRec BB=new updateRoomRec(stage);
                    break;
                case "list rooms":
                    System.out.println("6");
                    listRooms SR=new listRooms(stage);
                    break;
                case "list guests":
                    System.out.println("7");
                    listGuests UR=new listGuests(stage);
                    break;
               /* case "generate bill":
                    System.out.println("8");
                    searchRoom DR=new searchRoom(stage);
                    break;     */       
                default:
                    break;
            }
        
        
        
        });
  
        // set the scene 
        stage.setScene(sc); 
  
        stage.show();  }
}
