/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author Tamer
 */
public class MyException extends Exception {
  public MyException()
    {
        super();
    }
    public MyException(String s)
    {
        super(s);
    }
    @Override
    public String toString()
    {
        return "My Exception";
    }

    int checkpassword(String x){
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for "+x +" !"));
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int Tray Again :(");
            }
        } while (number <= 0);

        return number;
    }

    String checkEmail(String x){
        String username;
        do {
            username = JOptionPane.showInputDialog("Enter Valid input for "+x +" !");
            if (!username.contains("@") || !username.contains(".")) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Tray Again :(");
            }
        } while (!username.contains("@") || !username.contains("."));

        return username;
    }
    
//    String checkPassLength(String x){
//        String pass;
//        do {
//            pass = JOptionPane.showInputDialog("Enter more than 8 char for "+x +" !");
//            if (pass.length()<8) {
//                JOptionPane.showMessageDialog(null, "Not valid Password length Tray Again :(");
//            }
//        } while (pass.length()<8);
//
//        return pass;
//    }

}
