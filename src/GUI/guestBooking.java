/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.guestPage;
import Classes.Receptionist;
import javafx.application.Platform;
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
public class guestBooking {
    public guestBooking(Stage myStage){
 
        GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );
        Scene myScene = new Scene( rootNode, 600, 500 );

        rootNode.add( new Label("First Name"), 0,0);
        TextField firstValue= new TextField();
        rootNode.add(firstValue, 1, 0);
        rootNode.add( new Label ("Last Name"), 0, 1); 
        TextField x=new TextField();
        rootNode.add(x, 1, 1);
        rootNode.add( new Label ("National ID"), 0, 2); 
        TextField x1=new TextField();
        rootNode.add(x1, 1, 2);
        rootNode.add( new Label ("Addrees"), 0, 3); 
        TextField x2=new TextField();
        rootNode.add(x2, 1, 3);
        rootNode.add( new Label ("Phone Number"), 0, 4); 
        TextField x3=new TextField();
        rootNode.add(x3, 1, 4);
        rootNode.add( new Label ("Birth Date"), 0, 5); 
        TextField x4=new TextField();
        rootNode.add(x4, 1, 5);
        rootNode.add( new Label ("Nationality"), 0, 6); 
        TextField x5=new TextField();
        rootNode.add(x5, 1, 6);
        rootNode.add( new Label ("Visa Number"), 0, 7); 
        TextField x6=new TextField();
        rootNode.add(x6, 1, 7);
        rootNode.add( new Label ("Checkin Date"), 0, 8); 
        TextField x7=new TextField();
        rootNode.add(x7, 1, 8);
        rootNode.add( new Label ("Checkout Date"), 0, 9); 
        TextField x8=new TextField();
        rootNode.add(x8, 1, 9);
        rootNode.add( new Label ("Email"), 0, 10); 
        TextField x9=new TextField();
        rootNode.add(x9, 1, 10);
        rootNode.add( new Label ("Password"), 0, 11); 
        TextField x10=new TextField();
        rootNode.add(x10, 1, 11);
        rootNode.add( new Label ("Gender"), 0, 12); 
        TextField x11=new TextField();
        rootNode.add(x11, 1, 12);
        Button b=new Button("Book");
        rootNode.add(b,1,14);
        Button a=new Button ("Log out");
        rootNode.add(a,1,15);
        //////////////////////////
        b.setOnAction(e -> {
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
        String value12 = String.valueOf(x10.getText());
        String value13 = String.valueOf(x11.getText());
        //String F_name, String L_name, long national_id, String Address, long phone_NO, String birth_date,String nationality, int visa_NO, String checkin_date, String checkout_date,  String username, int password, String type
        int v8 = Integer.parseInt(value8);
        int v12 = Integer.parseInt(value12);
        long v3=Long.parseLong(value3);
        long v5=Long.parseLong(value5);
        Receptionist receptionist = new Receptionist();
        
        receptionist.addnewBooking(value1,value2,v3,value4,v5,value6,value7,v8,value9,value10,value11,v12,value13);
        if (receptionist.i==1){
        Alert done=new Alert(Alert.AlertType.INFORMATION,"Booked completed");
        done.show();
        }
        else{
        Alert done=new Alert(Alert.AlertType.INFORMATION,"failed to Book ,try again later");
        done.show();
        }
        });
        
        
        
        ///////////////////////////
        a.setOnAction(e -> Platform.exit());
        myStage.setScene( myScene);
        myStage.show();
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
