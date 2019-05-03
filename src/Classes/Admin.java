/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author dell
 */
public class Admin extends Person 
{
public int i=0;
    public Admin(String F_name, String L_name, long national_id, String Address, long phone_NO, String birth_date, String username, int password,String type) {
        super(F_name, L_name, national_id, Address, phone_NO, birth_date, username, password,type);
    }

    public Admin() {
    }

//    Admin(String username, String password) {
//        if (){}
//    }
    public void addNewReceptionest(String F_name, String L_name, long national_id, String Address, long phone_NO, String birth_date, String username, int password , String type) {
        Receptionist x = new Receptionist(F_name, L_name, national_id, Address, phone_NO, birth_date, username, password,type);
        
        if (x.addReceptioist()) {
            System.out.println(x.toString() + "Added Successfully ... !");
            i=1;
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
    public String searchForReceptionest(long national_id) {
        Receptionist x = new Receptionist();
        String z=x.searchReceptionist(national_id);
        System.out.println(z);
        return z;
    }

    public void updateReceptionist(long OldNational_id, Receptionist newReceptionistValues) {
        Receptionist x = new Receptionist();
        x.editReceptionistData(OldNational_id, newReceptionistValues);
        System.out.println("Updated Successfully ... !");
    }

    public void deleteReceptionist(long national_id) {
        Receptionist x = new Receptionist();
        x.deleteReceptionist(national_id);
        System.out.println("deleted Successfully ... !");
    }
    public void addroom(int RoomNO, String Roomstate, String typebed, String Roomtype, String location, String username, double price, String arrivetime, String leavetime){
    Room x = new Room(RoomNO, Roomstate,typebed,Roomtype,location,username,price,arrivetime,leavetime);
    if (x.addroom()) {
            System.out.println(x.toString() + "Added Successfully ... !");
            i=1;
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
    public String searchForRoom(int RoomNO) {
        Room x = new Room();
        String d=x.searchRoom(RoomNO);
        System.out.println(d);
        return d;
    }
    public void updateRoom(int RoomNO, Room newroomValues) {
        Room x = new Room();
        x.updateRoomstatus(RoomNO, newroomValues);
        System.out.println("Updated Successfully ... !");
    }
    public void deleteRoom(int RoomNO) {
        Room x = new Room();
        x.deleteRoom(RoomNO);
        System.out.println("deleted Successfully ... !");
    }
    public String displayReceptionist() {
        Receptionist x = new Receptionist();
        String All =x.displayAllReceptioist();
        System.out.println(All);
        return All;
    }
    public String displayRoom() {
        Room x = new Room();
        String All=x.displayAllRoom();
        System.out.println(All);
        return All;
    }
        public String genrateReport(String StartDate ,String EndDate,int reportType)
    {
       
        Report re=new Report();
       String r= re.showReport(StartDate,EndDate,reportType);
       
        
        return r;
    }
    //F_name, L_name, national_id, Address, phone_NO, birth_date, username, password,type
    @Override
    public String toString() {
        return "I'm admin : " + F_name + " L_name" + L_name + "\n" + "national_id : " + national_id + " Address : " + Address + " phone_NO : " + phone_NO + "\n" + "birth_date. : " + birth_date + "\nUserName: " + username + "\t Password: " + password +"type. : " + type + "\n";
    }


}
