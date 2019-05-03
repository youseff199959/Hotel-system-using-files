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
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ESC
 */
public class deleteRoom {
    public deleteRoom(Stage stage){
    
    
    GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );
        Scene myScene = new Scene( rootNode, 700, 500 );

        rootNode.add( new Label("National ID"), 0,0);
        TextField firstValue= new TextField();
        rootNode.add(firstValue, 1, 0);
        Button b=new Button("Serach");
        rootNode.add(b,1,2);
        Button a=new Button ("Back");
        rootNode.add(new Label("Results"),0,4);
        rootNode.add(a,1,3);
        TextArea textArea = new TextArea();
        textArea.setPrefRowCount(5);            
        rootNode.add(textArea,1,4);
        /////////////////////////////////
        b.setOnAction(e -> {
        String value1 = String.valueOf(firstValue.getText());
        int f=Integer.parseInt(value1);
        Admin admin = new Admin();
       textArea.setText(admin.searchForRoom(f));
        Alert alert =new Alert (Alert.AlertType.CONFIRMATION,"Delete?",ButtonType.YES,ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult()==ButtonType.YES){
        admin.deleteRoom(f);
        }
        
        });
        ///////////////////////////
        a.setOnAction(e -> {
            Adminpage AP=new Adminpage(stage);
         });
        stage.setScene(myScene);
        stage.show();
    
    
    
    
    
    
    }
}
