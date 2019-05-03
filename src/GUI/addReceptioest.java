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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed mahfouz
 */
public class addReceptioest {
    
    
    
    public addReceptioest(Stage myStage){
        GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );
        Scene myScene = new Scene( rootNode, 500, 500 );

        rootNode.add( new Label("Receptionest F_name"), 0,0);
        TextField firstValue= new TextField();
        rootNode.add(firstValue, 1, 0);
        rootNode.add( new Label ("Receptionest L_Name"), 0, 1); 
        TextField x=new TextField();
        rootNode.add(x, 1, 1);
        rootNode.add( new Label ("National_id"), 0, 2); 
        TextField x1=new TextField();
        rootNode.add(x1, 1, 2);
        rootNode.add( new Label ("Addrees"), 0, 3); 
        TextField x2=new TextField();
        rootNode.add(x2, 1, 3);
        rootNode.add( new Label ("Phone_NO"), 0, 4); 
        TextField x3=new TextField();
        rootNode.add(x3, 1, 4);
        rootNode.add( new Label ("Birth_date"), 0, 5); 
        TextField x4=new TextField();
        rootNode.add(x4, 1, 5);
        rootNode.add( new Label ("Username"), 0, 6); 
        TextField x5=new TextField();
        rootNode.add(x5, 1, 6);
        rootNode.add( new Label ("Password"), 0, 7); 
        TextField x6=new TextField();
        rootNode.add(x6, 1, 7);
        rootNode.add( new Label ("Type"), 0, 8); 
        TextField x7=new TextField();
        rootNode.add(x7, 1, 8);
        Button b=new Button("Write Data");
        rootNode.add(b,1,10);
        Button a=new Button ("Back");
        rootNode.add(a,1,11);
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
        int v8 = Integer.parseInt(value8);
        long v3=Long.parseLong(value3);
        long v5=Long.parseLong(value5);
        Admin admin = new Admin();
        admin.addNewReceptionest(value1,value2,v3,value4,v5,value6,value7,v8,value9);
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
            Adminpage AP=new Adminpage(myStage);
         });
        myStage.setScene( myScene);
        myStage.show();
    
    
    }
    
    
}

