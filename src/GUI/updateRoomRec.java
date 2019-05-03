/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Admin;
import Classes.Room;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ahmed mahfouz
 */
public class updateRoomRec {
    public updateRoomRec(Stage stage){
    GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );
        Scene myScene = new Scene( rootNode, 500, 700 );
        rootNode.add( new Label("Old Room Number"), 0,0);
        TextField ID= new TextField();
        rootNode.add(ID, 1, 0);
        //Button a=new Button("Serach");
        //rootNode.add(a,1,1);
        rootNode.add( new Label("Room Number"), 0,2);
        TextField firstValue= new TextField();
        rootNode.add(firstValue, 1, 2);
        rootNode.add( new Label ("Room State"), 0, 3); 
        TextField x=new TextField();
        rootNode.add(x, 1, 3);
        rootNode.add( new Label ("Type of Beds"), 0, 4); 
        TextField x1=new TextField();
        rootNode.add(x1, 1, 4);
        rootNode.add( new Label ("Room Type"), 0, 5); 
        TextField x2=new TextField();
        rootNode.add(x2, 1, 5);
        rootNode.add( new Label ("Location"), 0, 6); 
        TextField x3=new TextField();
        rootNode.add(x3, 1, 6);
        rootNode.add( new Label ("Username"), 0, 7); 
        TextField x4=new TextField();
        rootNode.add(x4, 1, 7);
        rootNode.add( new Label ("Price"), 0, 8); 
        TextField x5=new TextField();
        rootNode.add(x5, 1, 8);
        rootNode.add( new Label ("Checkin date"), 0, 9); 
        TextField x6=new TextField();
        rootNode.add(x6, 1, 9);
        rootNode.add( new Label ("Checkout date"), 0, 10); 
        TextField x7=new TextField();
        rootNode.add(x7, 1, 10);
        Button b=new Button("Update");
        rootNode.add(b,1,11);
        Button A=new Button ("Back");
        rootNode.add(A,1,12);
        ////////////////////////////////
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
        int Oid=Integer.parseInt(Old);
        int Value1 = Integer.parseInt(value1);
        long v3=Long.parseLong(value3);
        double Value7=Double.parseDouble(value7);
        Admin admin = new Admin();
        Room y = new Room(Value1,value2,value3,value4,value5,value6,Value7,value8,value9);
        admin.updateRoom(Oid, y);
        });
        ///////////////////////////
        A.setOnAction(e -> {
            RecPage AP=new RecPage(stage);
         });
        stage.setScene( myScene);
        stage.show();
    
    
    }
    
}
