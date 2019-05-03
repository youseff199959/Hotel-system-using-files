/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  Classes;

//import static filemanager.Guest.Guest_hotel;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Room {
    
    int RoomNO;
    String Roomstate;
    String  typebed;
    String Roomtype;
    String location;
    String username;
    double price;
    String arrivetime;
    String leavetime;
    FileManager FManger = new FileManager();
    public ArrayList<Room> Room_hotel = new ArrayList<Room>();
    public Room() {
    }

    public Room(int RoomNO, String Roomstate, String typebed, String Roomtype, String location, String username, double price, String arrivetime, String leavetime) {
        this.RoomNO = RoomNO;
        this.Roomstate = Roomstate;
        this.typebed = typebed;
        this.Roomtype = Roomtype;
        this.location = location;
        this.username = username;
        this.price = price;
        this.arrivetime = arrivetime;
        this.leavetime = leavetime;
    }

    public void setRoomNO(int RoomNO) {
        this.RoomNO = RoomNO;
    }

    public void setRoomstate(String Roomstate) {
        this.Roomstate = Roomstate;
    }

    public void setTypebed(String typebed) {
        this.typebed = typebed;
    }

    public int getRoomNO() {
        return RoomNO;
    }

    public String getRoomstate() {
        return Roomstate;
    }

    public String getTypebed() {
        return typebed;
    }

    public String getRoomtype() {
        return Roomtype;
    }

    public String getLocation() {
        return location;
    }

    public String getUsername() {
        return username;
    }

    public double getPrice() {
        return price;
    }

    public String getArrivetime() {
        return arrivetime;
    }

    public String getLeavetime() {
        return leavetime;
    }
    
    
    

    public void setRoomtype(String Roomtype) {
        this.Roomtype = Roomtype;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setArrivetime(String arrivetime) {
        this.arrivetime = arrivetime;
    }

    public void setLeavetime(String leavetime) {
        this.leavetime = leavetime;
    }
    private void loadFromFile() {
            Room_hotel = (ArrayList<Room>) (Object) FManger.read("Roomdata.txt");
    }
     private void commitToFile() {
        FManger.write(Room_hotel.get(0).getRoomData(),  "Roomdata.txt", false);
        for (int i = 1; i < Room_hotel.size(); i++) {
            FManger.write(Room_hotel.get(i).getRoomData(), "Roomdata.txt", true);
        }
    }
    private String getRoomData() {
        return this.RoomNO +"#"+this.Roomstate+"#"+this.typebed+"#"+this.Roomtype+"#"+this.location+"#"+this.username +"#"+this.price+"#"+this.arrivetime+"#"+this.leavetime+"#";
                
    }
    private int getRoomIndex(int RoomNO){
        for (int i = 0; i < Room_hotel.size(); i++)
            if(Room_hotel.get(i).getRoomNO()==RoomNO)
                return i;
        
        return -1;
    }
    public boolean addroom() {
        if (FManger.write(getRoomData(), "Roomdata.txt", true)) {
            return true;
        } else {
            return false;
        }
    }
    public void deleteRoom(int RoomNO){
        loadFromFile();
        int index = getRoomIndex(RoomNO);
        Room_hotel.remove(index);
        commitToFile();
    } 

//    private Object getRoom_NO() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
public String searchRoom(int RoomNO){
        loadFromFile();
        int index = getRoomIndex(RoomNO);
        if(index != -1)
            return "\nFound ...!" + Room_hotel.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
public String displayAllRooms() {
        loadFromFile();
        String S = "\nAll Rooms Data:\n";
        for (Room x : Room_hotel) {
            S = S + x.toString();
        }
        return S;
    }
   public void updateRoomstatus(int RoomNO, Room y){
        loadFromFile();
        int index = getRoomIndex(RoomNO);
        Room_hotel.set(index, y);
        commitToFile();
    } 
   public String displayAllRoom() {
        loadFromFile();
        String S = "\nAll Room Data:\n";
        for (Room x : Room_hotel) {
            S = S + x.toString();
        }
        return S;
    }
   //int RoomNO, String Roomstate, String typebed, String Roomtype, String location, String username, double price, String arrivetime, String leavetime
@Override
    public String toString() {
        return "RoomNUM : " + RoomNO + "\n" + "Roomstate" + Roomstate + "\n" + "typebed : " + typebed + "\n" + " Roomtype : " + Roomtype + "\n" + " location : " + location + "\n" + "username : " + username + "\n"+ "price: " + price + "\n "+"arrivetime " + arrivetime + "\n" +"leavetime"+leavetime+"\n";
    }
}
    
    
