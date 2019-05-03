/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Admin;
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
public class addRoom {
    public addRoom(Stage stage){
        GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );
        Scene myScene = new Scene( rootNode, 500, 500 );

        rootNode.add( new Label("Room Number"), 0,0);
        TextField firstValue= new TextField();
        rootNode.add(firstValue, 1, 0);
        rootNode.add( new Label ("Room State"), 0, 1); 
        TextField x=new TextField();
        rootNode.add(x, 1, 1);
        rootNode.add( new Label ("Type of Beds"), 0, 2); 
        TextField x1=new TextField();
        rootNode.add(x1, 1, 2);
        rootNode.add( new Label ("Room Type"), 0, 3); 
        TextField x2=new TextField();
        rootNode.add(x2, 1, 3);
        rootNode.add( new Label ("Location"), 0, 4); 
        TextField x3=new TextField();
        rootNode.add(x3, 1, 4);
        rootNode.add( new Label ("Username"), 0, 5); 
        TextField x4=new TextField();
        rootNode.add(x4, 1, 5);
        rootNode.add( new Label ("Price"), 0, 6); 
        TextField x5=new TextField();
        rootNode.add(x5, 1, 6);
        rootNode.add( new Label ("Check In date"), 0, 7); 
        TextField x6=new TextField();
        rootNode.add(x6, 1, 7);
        rootNode.add( new Label ("Check Out Date"), 0, 8); 
        TextField x7=new TextField();
        rootNode.add(x7, 1, 8);
        Button b=new Button("Add Room");
        rootNode.add(b,1,10);
        Button a=new Button ("Back");
        rootNode.add(a,1,11);
        //////////////////////
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
        int Value1=Integer.parseInt(value1);
        double Value7=Double.parseDouble(value7);
        Admin admin = new Admin();
        admin.addroom(Value1,value2,value3,value4,value5,value6,Value7,value8,value9);
        if (admin.i==1){
        Alert done=new Alert(Alert.AlertType.INFORMATION,"Added in file");
        done.show();
        }
        else{
        Alert done=new Alert(Alert.AlertType.INFORMATION,"failed to add");
        done.show();
        }
        });
        ///////////////////////////
        a.setOnAction(e -> {
            Adminpage AP=new Adminpage(stage);
         });
        stage.setScene( myScene);
        stage.show();
    
    
    
    
    }
    
}
