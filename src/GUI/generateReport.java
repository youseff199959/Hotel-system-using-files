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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ahmed mahfouz
 */
public class generateReport {
    public generateReport(Stage stage){
    
            GridPane rootNode= new GridPane();
        rootNode.setPadding( new Insets( 15 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );
        Scene myScene = new Scene( rootNode, 700, 500 );

        rootNode.add( new Label("Start Date"), 0,0);
        TextField firstValue= new TextField();
        rootNode.add(firstValue, 1, 0);
        rootNode.add( new Label("End Date"), 0,1);
        TextField x= new TextField();
        rootNode.add(x, 1, 1);
        Button b=new Button("Room Report");
        rootNode.add(b,1,2);
        Button Z=new Button("Bill Report");
        rootNode.add(Z,1,3);
        Button a=new Button ("Back");
        rootNode.add(a,1,4);
        TextArea textArea = new TextArea();
        textArea.setPrefRowCount(5);            
        rootNode.add(textArea,1,5);

        /////////////////////////////////
        b.setOnAction(e -> {
        String value1 = String.valueOf(firstValue.getText());
        String value2 = String.valueOf(x.getText());
       // long f=Long.parseLong(value1);
        Admin admin = new Admin();
       textArea.setText(admin.genrateReport(value1,value2,1));
        
        });
        ///////////////////////////
        Z.setOnAction(e -> {
        String value1 = String.valueOf(firstValue.getText());
        String value2 = String.valueOf(x.getText());
       // long f=Long.parseLong(value1);
        Admin admin = new Admin();
       textArea.setText(admin.genrateReport(value1,value2,2));
        
        });
        ///////////////////////////
        a.setOnAction(e -> {
            Adminpage AP=new Adminpage(stage);
         });
        stage.setScene(myScene);
        stage.show();
    
    
    
    
    
    
    }
    
}
