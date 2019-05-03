/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Admin;
import Classes.Guest;
import Classes.Receptionist;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ahmed mahfouz
 */
public class updateGuest {
    public updateGuest(Stage stage){
            GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );
        Scene myScene = new Scene( rootNode, 500, 650 );
        rootNode.add( new Label("Enter National Old ID"), 0,0);
        TextField ID= new TextField();
        rootNode.add(ID, 1, 0);
        //Button a=new Button("Serach");
        //rootNode.add(a,1,1);
        rootNode.add( new Label("Receptionest F_name"), 0,2);
        TextField firstValue= new TextField();
        rootNode.add(firstValue, 1, 2);
        rootNode.add( new Label ("Receptionest L_Name"), 0, 3); 
        TextField x=new TextField();
        rootNode.add(x, 1, 3);
        rootNode.add( new Label ("National_id"), 0, 4); 
        TextField x1=new TextField();
        rootNode.add(x1, 1, 4);
        rootNode.add( new Label ("Addrees"), 0, 5); 
        TextField x2=new TextField();
        rootNode.add(x2, 1, 5);
        rootNode.add( new Label ("Phone_NO"), 0, 6); 
        TextField x3=new TextField();
        rootNode.add(x3, 1, 6);
        rootNode.add( new Label ("Birth_date"), 0, 7); 
        TextField x4=new TextField();
        rootNode.add(x4, 1, 7);
        rootNode.add( new Label ("Nationality"), 0, 8); 
        TextField x5=new TextField();
        rootNode.add(x5, 1, 8);
        rootNode.add( new Label ("Visa Number"), 0, 9); 
        TextField x6=new TextField();
        rootNode.add(x6, 1, 9);
        rootNode.add( new Label ("Checkin Date"), 0, 10); 
        TextField x7=new TextField();
        rootNode.add(x7, 1, 10);
        rootNode.add( new Label ("Checkout Date"), 0, 11); 
        TextField x8=new TextField();
        rootNode.add(x8, 1, 11);
        rootNode.add( new Label ("Email"), 0, 12); 
        TextField x9=new TextField();
        rootNode.add(x9, 1, 12);
        rootNode.add( new Label ("Password"), 0, 13); 
        TextField x10=new TextField();
        rootNode.add(x10, 1, 13);
        rootNode.add( new Label ("Type"), 0, 14); 
        TextField x11=new TextField();
        rootNode.add(x11, 1, 14);
        Button b=new Button("Update");
        rootNode.add(b,1,15);
        Button A=new Button ("Back");
        rootNode.add(A,1,16);
        ///////////////////////////
        b.setOnAction(e -> {
        String Old= String.valueOf(ID.getText());
        String value1 = String.valueOf(firstValue.getText());
        String value2 = String.valueOf(x.getText());
        String value3 = String.valueOf(x1.getText());
        String value4 = String.valueOf(x2.getText());
        String value5 = String.valueOf(x3.getText());
        String value6 = String.valueOf(x4.getText());
        String value7 = String.valueOf(x5.getText());
        String value8 = String.valueOf(x6.getText());
        String value9 = String.valueOf(x7.getText());
        String value10 = String.valueOf(x8.getText());
        String value11 = String.valueOf(x9.getText());
        String value12= String.valueOf(x10.getText());
        String value13= String.valueOf(x11.getText());
        long Oid=Long.parseLong(Old);
        int v12=Integer.parseInt(value12);
        int v8 = Integer.parseInt(value8);
        long v3=Long.parseLong(value3);
        long v5=Long.parseLong(value5);
        Guest X = new Guest(value1,value2,v3,value4,v5,value6,value7,v8,value9,value10,value11,v12,value13);
        Receptionist receptionist = new Receptionist();
        receptionist.updateGuest(Oid, X);
        Alert done=new Alert(Alert.AlertType.INFORMATION,"updated");
        done.show();
        });
        ///////////////////////////
        A.setOnAction(e -> {
            RecPage AP=new RecPage(stage);
         });
        stage.setScene( myScene);
        stage.show();
    
    
    
    
    
    
    
    }
    
}
