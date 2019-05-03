/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ahmed mahfouz
 */
public class listGuests {
    
    public listGuests(Stage stage){
    
    
    
     GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );
        Scene myScene = new Scene( rootNode, 700, 500 );

       // rootNode.add( new Label("Room Number"), 0,0);
       // TextField firstValue= new TextField();
       // rootNode.add(firstValue, 1, 0);
        Button b=new Button("Display");
        rootNode.add(b,1,11);
        Button a=new Button ("Back");
        rootNode.add(a,1,12);
        rootNode.add(new Label("Results"),0,0);
        TextArea textArea = new TextArea();
        textArea.setPrefRowCount(10);            
        rootNode.add(textArea,1,0);
        ///////////////////////
        b.setOnAction(e -> {
       // String value1 = String.valueOf(firstValue.getText());
        //int f=Integer.parseInt(value1);
        Receptionist receptionist = new Receptionist();
        textArea.setText(receptionist.displayGuest());
        
        });
        ///////////////////////////
        a.setOnAction(e -> {
            RecPage AP=new RecPage(stage);
         });
        stage.setScene(myScene);
        stage.show();
    
    
    }
    
}
