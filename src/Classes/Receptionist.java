package Classes;

import Classes.FileManager;
import Classes.Guest;
import Classes.Guest;
import Classes.Person;
import Classes.Person;
import Classes.Room;
import Classes.Room;
import sun.applet.Main;

import javax.management.remote.SubjectDelegationPermission;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Faisal on 12/8/2018.
 */
public class Receptionist extends Person {
       public int i=0;

    public Receptionist() {
        
    }
public final String ReceptionDataFileName = "ReceptionData.txt";
    //constructor
    public Receptionist(String F_name, String L_name, long national_id, String Address, long phone_NO, String birth_date, String username, int password,String type) {
        super(F_name, L_name, national_id, Address, phone_NO, birth_date, username, password,type);
    }
    

    //file path
    
    public ArrayList<Receptionist> recepArrayList = new ArrayList<Receptionist>();

    //put  the data in the array list
    private void loadFromFile() {
        recepArrayList = (ArrayList<Receptionist>) (Object) FManger.read(ReceptionDataFileName);
    }

    // get index

    private int getIndex(long national_id) {
        for (int i = 0; i < recepArrayList.size(); i++)
            if (recepArrayList.get(i).getNational_id() == national_id)
                return i;

        return -1;
    }
    //commit  to file make the data enter to file

    private void commitToFile() {
        FManger.write(recepArrayList.get(0).getPersonData(),ReceptionDataFileName, false);
        for (int i = 1; i < recepArrayList.size(); i++) {
            FManger.write(recepArrayList.get(i).getPersonData(), ReceptionDataFileName, true);
        }

    }



//SearchUser
    public String searchReceptionist(long national_id) {
        loadFromFile();
        int index = getIndex(national_id);
        if(index != -1)
            return "\nFound ...!" + recepArrayList.get(index).toString();
        else 
            return "\nNot Found ...!";
    }

//editUserdata

    public void editReceptionistData(long OldNational_id, Receptionist x){
        loadFromFile();
        int index = getIndex(OldNational_id);
        recepArrayList.set(index, x);
        commitToFile();
    }
    public boolean addReceptioist() {
        if (FManger.write(getReceptioistData(), ReceptionDataFileName, true)) {
            return true;
        } else {
            return false;
        }
    }
     public void deleteReceptionist(long national_id){
        loadFromFile();
        int index = getIndex(national_id);
        recepArrayList.remove(index);
        commitToFile();
    } 
  public String getReceptioistData() {
        return this.F_name + "#" + this.L_name + "#" + this.national_id + "#" + this.Address + "#" + this.phone_NO + "#" + this.birth_date + "#" + this.username + "#" + this.password + "#" + this.type +"***";
    }
  public String displayAllReceptioist() {
        loadFromFile();
        String S = "\nAll Receptioist Data:\n";
        for (Receptionist x : recepArrayList) {
            S = S + x.toString();
        }
        return S;
    }
  public void addnewBooking(String F_name, String L_name, long national_id, String Address, long phone_NO, String birth_date,String nationality, int visa_NO, String checkin_date, String checkout_date,  String username, int password, String type){
    
          Guest x = new Guest(F_name,L_name,national_id,Address,phone_NO,birth_date,nationality,visa_NO,checkin_date,checkout_date,username,password,type);
        if (x.addbooking()) {
            i=1;
            System.out.println(toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }

}
  public String searchForGuest(long national_id) {
        Guest x = new Guest();
        String d=x.searchGuest(national_id);
        System.out.println(d);
        return d;
    }
  public void updateGuest(long old_national_id, Guest newGuestValues) {
        Guest x = new Guest();
        x.UpdateGuest(old_national_id, newGuestValues);
        System.out.println("Updated Successfully ... !");
    }
  public void searchForRoom(int RoomNO) {
        Room x = new Room();
        System.out.println(x.searchRoom(RoomNO));
    }
  public void updateRoom(int RoomNumber, Room newroomValues) {
        Room x = new Room();
       x.updateRoomstatus(RoomNumber, newroomValues);
        System.out.println("Updated Successfully ... !");
    }
  public void displayRoom() {
        Room x = new Room();
        System.out.println(x.displayAllRoom());
    }
  public String displayGuest() {
        Guest x = new Guest();
        String d=x.displayAllGuest();
        System.out.println(d);
        return d;
    }
@Override
    public String toString() {
        return " Receptioist : " + F_name +"\n"+ " Last Name : " + L_name + "\n" + "National_id : " + national_id + "\n" +" Address : " + Address + "\n" + " phone_NO : " + phone_NO + "\n" + "Birth_date. : " + birth_date +"\n"+"UserName: " + username + "\t"+"Password: " + password +"\n"+"Type. : " + type + "\n";
    }
}
















