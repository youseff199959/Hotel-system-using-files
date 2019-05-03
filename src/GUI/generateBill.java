/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.*;
import GUI.Adminpage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ESC
 */
public class generateBill {
    public generateBill(Stage stage){
    GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );
        Scene myScene = new Scene( rootNode, 500, 500 );

        rootNode.add( new Label("Enter the bill number"), 0,0);
        TextField firstValue= new TextField();
        rootNode.add(firstValue, 1, 0);
        rootNode.add( new Label ("Enter the Guest name"), 0, 1); 
        TextField x=new TextField();
        rootNode.add(x, 1, 1);
        rootNode.add( new Label ("Enter the price"), 0, 2); 
        TextField x1=new TextField();
        rootNode.add(x1, 1, 2);
        rootNode.add( new Label ("Enter the payment number"), 0, 3); 
        TextField x2=new TextField();
        rootNode.add(x2, 1, 3);
        rootNode.add( new Label ("Enter the payment type"), 0, 4); 
        TextField x22=new TextField();
        rootNode.add(x22, 1, 4);
        rootNode.add( new Label ("Enter the arrive time"), 0, 5); 
        TextField x3=new TextField();
        rootNode.add(x3, 1, 5);
        Button b=new Button("Add Bill");
        rootNode.add(b,1,6);
        Button a=new Button ("Back");
        rootNode.add(a,1,7);
        //////////////////////////
        b.setOnAction(e -> {
        String value= String.valueOf(x22.getText());
        String value1 = String.valueOf(firstValue.getText());
        String value2 = String.valueOf(x.getText());
        String value3 = String.valueOf(x1.getText());
        String value4 = String.valueOf(x2.getText());
        String value5 = String.valueOf(x3.getText());
        int v8 = Integer.parseInt(value1);
        int v4 =Integer.parseInt(value4);
        double v3=Double.parseDouble(value3);
        Bill bill = new Bill();
       
        Alert done=new Alert(Alert.AlertType.CONFIRMATION,"Paid",ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        done.showAndWait();
        
        if (done.getResult() == ButtonType.YES){
        bill.addNewbill(v8,value2,v3,v4,value5,true,value5);
        }
        else if (done.getResult() == ButtonType.NO){
        bill.addNewbill(v8,value2,v3,v4,value,false,value5);
        }
        });
        
        
        
        ///////////////////////////
        a.setOnAction(e -> {
            RecPage AP=new RecPage(stage);
         });
        stage.setScene( myScene);
        stage.show();
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
}
