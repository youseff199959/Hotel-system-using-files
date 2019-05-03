/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class HotelReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin("kareem", "yaser",299842523 , "nasr city", 012345,"12/12/1999","kareem@gmail.com",123456,"Male");
        Receptionist receptionist = new Receptionist("ussef", "samir",299655568 , "shobra", 01256,"31/7/1999","ussef@gmail.com",230230,"Male");
       Bill bill=new Bill();
        int ch = 1;
       int pp=1;
       int ch2 = 1;
       int ch3=1;
       String userName,F_name,L_name, Address,birth_date,type,Roomstate,typebed,Roomtype,location,username,arrivetime,leavetime,nationality,checkin_date,checkout_date,Arrivetime,Paytype,Cuestname;
       int password,RoomNO ,RoomNumber,visa_NO,Payno,Bill_no;
       double price,pricebill;
       boolean pverify;
        long national_id,old_national_id, phone_NO,OldNational_id;
        while(pp!=0){
        System.out.print("\n\n 1- Admin ... !\n\n 2- receptionist ......\n\n 3- Guest : ");
        pp = input.nextInt();
        switch(pp){
        
    case 1:
      System.out.print("\n\nWelecome Admin ... !\n\nUser Name : ");
        userName = input.next();
        System.out.print("Password  : ");
        password = input.nextInt();
        //receptionist.login2(userName, password);
         if (admin.login(userName, password)){
             while (ch != 0) {
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\n\t ______________________________________\n\t "
                                      + "*** Enter 1: addNewReceptionest.    ***\n\t"
                                      + "*** Enter 2:searchForReceptionest.  ***\n\t"
                                      + "*** Enter 3: updateReceptionist.    ***\n\t"
                                      + "*** Enter 4: deleteReceptionist.    ***\n\t"
                                      + "*** Enter 5: addroom.               ***\n\t"               
                                      + "*** Enter 6: searchForRoom.         ***\n\t"  
                                      + "*** Enter 7: updateRoom.            ***\n\t"
                                      + "*** Enter 8: deleteRoom             ***\n\t" 
                                      + "*** Enter 9: displayRoom.           ***\n\t"
                                      + "*** Enter 10: displayReceptionist.  ***\n\t"
                                      + "*** Enter 11: genrateReport.        ***\n\t "
                                      + "*** Enter 12: Logout.               ***\n\t"
                );
                ch = input.nextInt();
         switch (ch) {
         case 1:
                        System.out.println("Enter Receptionest Info ... ");
                        System.out.print("Receptionest F_name : ");
                        F_name = input.next();
                        System.out.print("Receptionest L_Name : ");
                        L_name = input.next();
                        System.out.print("National_id : ");
                        national_id = input.nextLong();
                        System.out.print("Addrees : ");
                        Address = input.next();
                        System.out.print("Phone_NO : ");
                        phone_NO = input.nextLong();
                        System.out.print("Birth_date : ");
                        birth_date = input.next();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        password = input.nextInt();
                        System.out.print("Type : ");
                        type = input.next();
                        admin.addNewReceptionest(F_name,L_name,national_id,Address,phone_NO,birth_date,userName,password,type);
                        break;
         
         case 2:
                        System.out.print("\nsearchForReceptionest ...!\nEnter national_id : ");
                        national_id = input.nextLong();
                        admin.searchForReceptionest(national_id);
                        break;
         case 3:
                        System.out.print("\nupdateReceptionist ...!\nEnter OldNational_id : ");
                        OldNational_id = input.nextLong();

                        System.out.println("\nEnter Receptioist New Info ... ");
                        System.out.print("Receptionest F_name : ");
                        F_name = input.next();
                        System.out.print("Receptionest L_Name : ");
                        L_name = input.next();
                        System.out.print("national_id : ");
                        national_id = input.nextLong();
                        System.out.print("Addrees : ");
                        Address = input.next();
                        System.out.print("phone_NO : ");
                        phone_NO = input.nextLong();
                        System.out.print(" birth_date : ");
                        birth_date = input.next();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        password = input.nextInt();
                        System.out.print("type : ");
                        type = input.next();
                        
                        Receptionist x = new Receptionist(F_name,L_name,national_id,Address,phone_NO,birth_date,userName,password,type);
                        admin.updateReceptionist(OldNational_id, x);
                        break;
         case 4:
                        System.out.print("\ndeleteReceptionist ...!\nEnter national_id : ");
                        national_id = input.nextLong();
                        admin.deleteReceptionist(national_id);
                        break;
         case 5:
                        System.out.println("Enter Room Info ... ");
                        System.out.print("Room Num. : ");
                        RoomNO = input.nextInt();
                        System.out.print("Roomstate : ");
                        Roomstate = input.next();
                        System.out.print("Typebed : ");
                        typebed = input.next();
                        System.out.print("Roomtype : ");
                        Roomtype = input.next();
                        System.out.print("Location : ");
                        location = input.next();
                        System.out.print("UserName : ");
                        username = input.next();
                        System.out.print("price : ");
                        price = input.nextDouble();
                        System.out.print("arrivetime : ");
                        arrivetime = input.next();
                        System.out.print("leavetime : ");
                        leavetime = input.next();
                        admin.addroom(RoomNO, Roomstate,typebed, Roomtype, location,username,price,arrivetime,leavetime);
                        break;
         case 6:
                        System.out.print("\nsearchForRoom ...!\nEnter RoomNO : ");
                        RoomNO = input.nextInt();
                        admin.searchForRoom(RoomNO);
                        break;
         case 7:
                        System.out.print("\nupdateRoom ...!\nEnter RoomNO : ");
                        RoomNumber = input.nextInt();

                        System.out.println("\nEnter Room New Info ... ");
                        System.out.print("RoomNO : ");
                        RoomNO = input.nextInt();
                        System.out.print(" Roomstate : ");
                        Roomstate = input.next();
                        System.out.print("Typebed : ");
                        typebed = input.next();
                        System.out.print("Roomtype : ");
                        Roomtype = input.next();
                        System.out.print("Location : ");
                        location = input.next();
                        System.out.print("UserName : ");
                        username = input.next();
                        System.out.print("price : ");
                        price = input.nextDouble();
                        System.out.print("arrivetime : ");
                        arrivetime = input.next();
                        System.out.print("leavetime : ");
                        leavetime = input.next();
                        
                        Room y = new Room(RoomNO, Roomstate,typebed, Roomtype, location,username,price,arrivetime,leavetime);
                        admin.updateRoom(RoomNumber, y);
                        /*
                        Room y = new Room(RoomNO, Roomstate,typebed, Roomtype, location,username,price,arrivetime,leavetime);
                        receptionist.updateRoom(RoomNO, y);
                        */
                        break;
         case 8:
                        System.out.print("\ndeleteRoom ...!\nEnter RoomNO : ");
                        RoomNO = input.nextInt();
                        admin.deleteRoom(RoomNO);
                        break;
         case 9:
                        admin.displayRoom();
                        break;
         case 10:
                        admin.displayReceptionist();
                        break;
         case 11:
                        System.out.println("Enter start date") ;
                        String s_date= input.next();
                        System.out.println("Enter End date") ;
                        String E_date= input.next();
                        System.out.println("Enter 1 to genrate room report , 2 for bill report") ;
                        int R_type= input.nextInt();
                        admin.genrateReport(s_date,E_date ,R_type );
                        break;
         case 12:
                        break;
         }
         
         }
        
}else{
    System.out.println("\n\nWrong ");
    }
         break;
         
    case 2:       
         System.out.println("\n\n  Welecome Receptionist ... "
                 + "\n\n Enter User Name : ");
         userName = input.next();
         System.out.print("Password  : ");
         password = input.nextInt();
         if (receptionist.login(userName, password)){
              while (ch2 != 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\n\t************************************\n\t"
                                    + "*** Enter 1: addnewBooking.       ***\n\t"
                                    + "*** Enter 2:searchGuest.          ***\n\t"
                                    + "*** Enter 3: updateGuest.         ***\n\t"
                                    + "*** Enter 4: searchForRoom.       ***\n\t"
                                    + "*** Enter 5: updateRoom.          ***\n\t" 
                                    + "*** Enter 6: displayRoom.         ***\n\t"
                                    + "*** Enter 7: displayGuest.        ***\n\t"
                                    + "*** Enter 8: genrate Bill.        ***\n\t"
                                    + "*** Enter 9: LogOut.              ***\n\t"
                                 +"\n\t*************************************\n\t"
                );
                ch2 = input.nextInt();
        switch (ch2) {
            case 1:
               
                
                //String nationality, int visa_NO, String checkin_date, String checkout_date, String F_name, String L_name, long national_id, String Addrees, long phone_NO, String birth_date, String username, int password, String type
                        System.out.println("Enter Guest Info ... ");
                        System.out.print("Guest F_name : ");
                        F_name = input.next();
                        System.out.print("Guest L_Name : ");
                        L_name = input.next();
                        System.out.print("Guest national_id : ");
                        national_id = input.nextLong();
                        System.out.print("Guest Addrees : ");
                        Address = input.next();
                        System.out.print("Guest phone_NO : ");
                        phone_NO = input.nextLong();
                        System.out.print("Guest birth_date : ");
                        birth_date = input.next();
                        System.out.print("nationality : ");
                        nationality = input.next();
                        System.out.print("visa_NO : ");
                        visa_NO = input.nextInt();
                        System.out.print("checkin_date : ");
                        checkin_date = input.next();
                        System.out.print("checkout_date : ");
                        checkout_date = input.next();
                        System.out.print("Guest Username : ");
                        userName = input.next();
                        System.out.print("Guest Password : ");
                        password = input.nextInt();
                        System.out.print("Guest type : ");
                        type = input.next();
                        receptionist.addnewBooking(F_name,L_name,national_id,Address,phone_NO,birth_date,nationality,visa_NO,checkin_date,checkout_date,userName,password,type);
                        break;
            case 2:
                        System.out.print("\nsearchForGuest ...!\nEnter national ID : ");
                        national_id = input.nextLong();
                        receptionist.searchForGuest(national_id);
                        break;
         
            case 3:
                        System.out.print("\nupdateGuest ...!\nEnter old_national_id  : ");
                        old_national_id = input.nextLong();
                         System.out.print("Guest F_name : ");
                        F_name = input.next();
                        System.out.print("Guest L_Name : ");
                        L_name = input.next();
                        System.out.print("Guest national_id : ");
                        national_id = input.nextLong();
                        System.out.print("Guest Addrees : ");
                        Address = input.next();
                        System.out.print("Guest phone_NO : ");
                        phone_NO = input.nextLong();
                        System.out.print("Guest birth_date : ");
                        birth_date = input.next();
                        System.out.print("nationality : ");
                        nationality = input.next();
                        System.out.print("visa_NO : ");
                        visa_NO = input.nextInt();
                        System.out.print("checkin_date : ");
                        checkin_date = input.next();
                        System.out.print("checkout_date : ");
                        checkout_date = input.next();
                        System.out.print("Guest Username : ");
                        userName = input.next();
                        System.out.print("Guest Password : ");
                        password = input.nextInt();
                        System.out.print("Guest type : ");
                        type = input.next();
                        Guest x = new Guest(F_name,L_name,national_id,Address,phone_NO,birth_date,nationality,visa_NO,checkin_date,checkout_date,userName,password,type);
                        receptionist.updateGuest(old_national_id, x);
                         
                         break;
            case 4:
                        System.out.print("\nsearchForRoom ...!\nEnter RoomNO : ");
                        RoomNO = input.nextInt();
                        receptionist.searchForRoom(RoomNO);
                        break;
            case 5:
                        System.out.print("\nupdateRoom ...!\nEnter RoomNumber : ");
                        RoomNumber = input.nextInt();

                        System.out.println("\nEnter Room New Info ... ");
                        System.out.print("RoomNO : ");
                        RoomNO = input.nextInt();
                        System.out.print(" Roomstate : ");
                        Roomstate = input.next();
                        System.out.print("typebed : ");
                        typebed = input.next();
                        System.out.print("Roomtype : ");
                        Roomtype = input.next();
                        System.out.print("location : ");
                        location = input.next();
                        System.out.print(" username : ");
                        username = input.next();
                        System.out.print("price : ");
                        price = input.nextDouble();
                        System.out.print("arrivetime : ");
                        arrivetime = input.next();
                        System.out.print("leavetime : ");
                        leavetime = input.next();
                        
                        Room y = new Room(RoomNO, Roomstate,typebed, Roomtype, location,username,price,arrivetime,leavetime);
                        receptionist.updateRoom(RoomNumber, y);
                        break;
            case 6:
                        receptionist.displayRoom();
                        break;            
            case 7:
                        receptionist.displayGuest();
                        break;             
                        
            case 8:
      
                        //Bno+"#"+this.Cname+"#"+this.price+"#"+this.Pno+"#"+this.Ptype+"#"+this.pverify+"#"+this.Arrivetime;
                     System.out.print("Enter the bill number:  ");
                     Bill_no= input.nextInt();
                     System.out.print("Enter the Guest name:  ");
                     Cuestname= input.next();
                     System.out.print("Enter the price:  ");
                      pricebill= input.nextDouble();
                      System.out.print("Enter the payment number:  ");
                      Payno= input.nextInt();
                      System.out.print("Enter the payment type:  ");
                      Paytype= input.next();
                      System.out.print("Enter the pverify :   ");
                      pverify= input.nextBoolean();
                      System.out.print("Enter the arrive time:  ");
                      Arrivetime= input.next();
                       bill.addNewbill(Bill_no,Cuestname,pricebill,Payno,Paytype,pverify,Arrivetime);

                        break;
            case 9:
                        break;
                        
                     }
         
         
         
         
         
         
         
         
         
                                }             
         }
         else{
          System.out.print("\n\nWrong ");
         
         }
         break;
    case 3:
              System.out.print("\n\nWelecome  ... !\n\nYour Email : ");
        userName = input.next();
        System.out.print("Password  : ");
        password = input.nextInt();
             while (ch3 != 0) {
                System.out.flush();
                System.out.println("\n\t ______________________________________\n\t "
                                      + "*** Enter 1: Add booking.           ***\n\t"
                                 //     + "*** Enter 2:searchForRoom.          ***\n\t"
                                      + "*** Enter 3: Delete booking.        ***\n\t"
                                      + "*** Enter 4: Log out.               ***\n\t" );
                ch3 = input.nextInt();
        switch (ch3) {
                case 1:
 System.out.println("Enter Your Info ... ");
                        System.out.print("Enter your First name : ");
                        F_name = input.next();
                        System.out.print("Enter your Last Name : ");
                        L_name = input.next();
                        System.out.print("Enter your national_id : ");
                        national_id = input.nextLong();
                        System.out.print("Enter your Addrees : ");
                        Address = input.next();
                        System.out.print("Enter your phone_NO : ");
                        phone_NO = input.nextLong();
                        System.out.print("Enter your birth_date : ");
                        birth_date = input.next();
                        System.out.print("Enter your nationality : ");
                        nationality = input.next();
                        System.out.print("Enter your visa_NO : ");
                        visa_NO = input.nextInt();
                        System.out.print("Enter your checkin_date : ");
                        checkin_date = input.next();
                        System.out.print("Enter your checkout_date : ");
                        checkout_date = input.next();
                        System.out.print("Enter your Email : ");
                        userName = input.next();
                        System.out.print("Enter your Password : ");
                        password = input.nextInt();
                        System.out.print("choose your type : ");
                        type = input.next();
                        receptionist.addnewBooking(F_name,L_name,national_id,Address,phone_NO,birth_date,nationality,visa_NO,checkin_date,checkout_date,userName,password,type);
                        break;
                case 3:
                    
                    break;
                case 4:
                    break;
             
        }
             }
             

        
    }
  }
 }
}