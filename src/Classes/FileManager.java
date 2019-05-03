
package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileManager {
    //write
    public boolean write(String Query, String FilePath, boolean appendType)
    {
    PrintWriter writter = null;
    try{
            System.out.print("\nwritting in ! " + FilePath);

            writter = new PrintWriter(new FileWriter(new File(FilePath), appendType));
            writter.println(Query);

            System.out.println("  Done");
            return true;
    } catch(IOException ex){
        System.out.println(ex);
    } finally{
    writter.close();
    }
    return false;
  
    }
    //read
    
    public ArrayList<Object> read(String FilePath) {
    
    Scanner Reader = null;
    try {
            System.out.println("Reading  From " + FilePath);

            Reader = new Scanner(new File(FilePath));
    } catch(FileNotFoundException ex){
        System.out.println(ex);
    }
        if (FilePath.equals("Guestdata.txt")) {

            ArrayList<Guest> guests = new ArrayList<Guest>();
            Guest x;
            while (Reader.hasNext()) {     
                x= new Guest();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("#");
         //F_name,L_name,national_id,Addrees,phone_NO,birth_date,nationality,visa_NO,checkin_date,checkout_date,username,password,type
                x.setF_name(seprated[0]);
                x.setL_name(seprated[1]);
                x.setNational_id(Long.parseLong(seprated[2]));
                x.setAddress(seprated[3]);
                x.setPhone_NO(Long.parseLong(seprated[4]));
                x.setBirth_date(seprated[5]);
                x.setNationality(seprated[6]);
                x.setVisa_NO(Integer.parseInt(seprated[7]));
                x.setCheckin_date(seprated[8]);
                x.setCheckout_date(seprated[9]);
                x.setUsername(seprated[10]);
                x.setPassword(Integer.parseInt(seprated[11]));
                x.setType(seprated[12]);
                
                guests.add(x);
               
            }
            return (ArrayList<Object>) (Object) guests;

        }else if(FilePath.equals("Admindata.txt")) {
            ArrayList<Admin> Admins = new ArrayList<Admin>();
            Admin x;
            
            while (Reader.hasNext()) {     
                x= new Admin();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("#");
               // String F_name, String L_name, long national_id, String Addrees, long phone_NO, String birth_date, String username, int password
                x.setF_name(seprated[0]);
                x.setL_name(seprated[1]);
                x.setNational_id(Long.parseLong(seprated[2]));
                x.setAddress(seprated[3]);
                x.setPhone_NO(Long.parseLong(seprated[4]));
                x.setBirth_date(seprated[5]);
                x.setUsername(seprated[6]);
                x.setPassword(Integer.parseInt(seprated[7]));

                Admins.add(x);
               
            }
            return (ArrayList<Object>) (Object) Admins;            

        } else if (FilePath.equals("ReceptionData.txt")){
            ArrayList<Receptionist> Recep = new ArrayList<Receptionist>();
            Receptionist x;
            // kareem#yasser#123555555555#cairo#012000#9/1/99#kareem2020@#123
            while (Reader.hasNext()) {     
                x= new Receptionist();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("#");
                x.setF_name(seprated[0]);
                x.setL_name(seprated[1]);
                x.setNational_id(Long.parseLong(seprated[2]));
                x.setAddress(seprated[3]);
                x.setPhone_NO(Long.parseLong(seprated[4]));
                x.setBirth_date(seprated[5]);
                x.setUsername(seprated[6]);
                x.setPassword(Integer.parseInt(seprated[7]));
                Recep.add(x);
               
            }
            return (ArrayList<Object>) (Object) Recep;  
        
        } else if (FilePath.equals("Roomdata.txt")){
            
            ArrayList<Room> Rooms = new ArrayList<Room>();
            Room x;
            
            while (Reader.hasNext()) {     
                x= new Room();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("#");
//RoomNO, String Roomstate, String typebed, String Roomtype, String location, String username, double price, String arrivetime, String leavetime
                x.setRoomNO(Integer.parseInt(seprated[0]));
                x.setRoomstate(seprated[1]);
                x.setTypebed(seprated[2]);
                x.setRoomtype(seprated[3]);
                x.setLocation(seprated[4]);
                x.setUsername(seprated[5]);
                x.setPrice(Double.parseDouble(seprated[6]));
                x.setArrivetime(seprated[7]);
                x.setLeavetime(seprated[8]);
                
                Rooms.add(x);
               
            }
            return (ArrayList<Object>) (Object) Rooms;          
        
        } else if(FilePath.equals("billsdata.txt")){
       
            ArrayList<Bill> bills = new ArrayList<Bill>();
            Bill x;
            
                        while (Reader.hasNext()) {     
                x= new Bill();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("#");
                //return Bno#Cname#price#Pno#Ptype#pverify#Arrivetime
                x.setBno(Integer.parseInt(seprated[0]));
                x.setCname(seprated[1]);
                x.setPrice(Double.parseDouble(seprated[2]));
                x.setPno(Integer.parseInt(seprated[3]));
                x.setPtype(seprated[4]);
                x.setPverify(Boolean.parseBoolean(seprated[5]));
                //x.setCount(Integer.parseInt(seprated[6]));
                x.setArrivetime(seprated[6]);
                
                bills.add(x);
               
            }
            return (ArrayList<Object>) (Object) bills;      
        
        }
             else {
            return null;
              }
   
    }
    
}
