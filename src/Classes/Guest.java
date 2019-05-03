/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import  Classes.Room;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Guest extends Receptionist {

   
    String nationality ;
    int visa_NO;
    String checkin_date;
    String checkout_date;
    public final String GuestdataFileName = "Guestdata.txt";
    public static ArrayList<Guest> Guest_hotel = new ArrayList<Guest>();
    public Guest() {
    }

    public Guest( String F_name, String L_name, long national_id, String Address, long phone_NO, String birth_date,String nationality, int visa_NO, String checkin_date, String checkout_date, String username, int password, String type) {
        super(F_name, L_name, national_id, Address, phone_NO, birth_date, username, password, type);
        this.nationality = nationality;
        this.visa_NO = visa_NO;
        this.checkin_date = checkin_date;
        this.checkout_date = checkout_date;
    }

    
//getter

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getVisa_NO() {
        return visa_NO;
    }

    public void setVisa_NO(int visa_NO) {
        this.visa_NO = visa_NO;
    }

    public String getCheckin_date() {
        return checkin_date;
    }
//setter
    public void setCheckin_date(String checkin_date) {
        this.checkin_date = checkin_date;
    }

    public String getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(String checkout_date) {
        this.checkout_date = checkout_date;
    }
    //F_name,L_name,national_id,Address,phone_NO,birth_date,nationality,visa_NO,checkin_date,checkout_date,username,password,type
    private String getGuestData() {
        
        return this.F_name + "#" + this.L_name + "#" + this.national_id + "#" + this.Address + "#" + this.phone_NO + "#" + this.birth_date + "#" + this.nationality + "#" + this.visa_NO + "#"+ this.checkin_date + "#" + this.checkout_date + "#" + this.username + "#" +this.password+ "#" +this.type+"**";
 
    }
    private int getGuestIndex(long  old_national_id){
        for (int i = 0; i < Guest_hotel.size(); i++)
            if(Guest_hotel.get(i).getNational_id()==old_national_id)
                return i;
        
        return 0;
    }
    
    private void commitToFile() {
        FManger.write(Guest_hotel.get(0).getGuestData(), (GuestdataFileName), false);
        for (int i = 1; i < Guest_hotel.size(); i++) {
            FManger.write(Guest_hotel.get(i).getGuestData(),(GuestdataFileName), true);
        }
    }
    private void loadFromFile() {
            Guest_hotel = (ArrayList<Guest>) (Object) FManger.read(GuestdataFileName);
    }
public void updatecheckout_date(long national_id, Guest x){
        loadFromFile();
        int index = getGuestIndex(national_id);
        Guest_hotel.set(index, x);
        commitToFile();
    } 
    
    

//    private Object getnational_id() {
//        return national_id;
//    }

       public boolean addbooking() {
        if (FManger.write(getGuestData(),GuestdataFileName, true)) {
            return true;
        } else {
            return false;
        }
        
    }
    public String searchGuest(long national_id) {
        loadFromFile();
        int index = getGuestIndex(national_id);
        if(index != -1)
            return "\nFound ...!" + Guest_hotel.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
    public void UpdateGuest(long old_national_id, Guest x){
        loadFromFile();
        int index = getGuestIndex(old_national_id);
        Guest_hotel.set(index, x);
        commitToFile();
    }
    public String displayAllGuest() {
        loadFromFile();
        String S = "\nAll Guest Data:\n";
        for (Guest x : Guest_hotel) {
            S = S + x.toString();
        }
        return S;
    }
    //F_name,L_name,national_id,Address,phone_NO,birth_date,nationality,visa_NO,checkin_date,checkout_date,username,password,type
    @Override
    public String toString() {
        return "Guest : " + F_name +"\n"+ " LastName" + L_name + "\n" + "National_id : " + national_id +"\n"+ " Address : " + Address +"\n"+ " phone_NO : " + phone_NO + "\n" + "Birth_date. : " + birth_date + "\n"+"Nationality: " + nationality + "\t"+" Visa_NO: " + visa_NO +"\n"+"checkin_date. : " + checkin_date + "\n"+"checkout_date : "+checkout_date+"\n"+"User name : "+username+"\n"+"password : "+password+"\n"+"Type : "+type+"****";
    }
    }
    
    

