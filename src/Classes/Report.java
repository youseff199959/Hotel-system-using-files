/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Report extends Room {
     private  int number;
  private String date;
 
    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public Report() {
    }

    public Report(int number, String date) {
        this.number = number;
        this.date = date;
    }
    
    FileManager FManger=new FileManager();
    
    
      String FileRoompath = "Roomdata.txt";
           String FileBillpath = "billsdata.txt";
          
        ArrayList<Room> roomlist=new ArrayList<Room>();
        ArrayList<Bill> bill_list=new ArrayList<Bill>();

     private void loadFromFileRoom() {
         
        roomlist = (ArrayList<Room>) (Object) FManger.read(FileRoompath );
    }
     private void loadFromFileBill() {
         
           bill_list = (ArrayList<Bill>) (Object) FManger.read(FileBillpath);
      
    }
  
    public String showReport(String StartDate ,String EndDate,int reportType){
     int i;
     String d = null;
     String r=null;
     
     
        //Room
        if(reportType==1)
            
        {
            loadFromFileRoom();
            System.out.println("RoomNUM  \t Roomstate  \t  typebed  \t  Roomtype  \t\t\t  location  \t\t  username  \t\t\t price  \t\t\t  arrivetime  \t  leavetime");
           for(i=0;i<roomlist.size();i++)
           {
               
          
           if(checkDate(StartDate, EndDate,roomlist.get(i).getArrivetime()))      
                {
                   System.out.println(roomlist.get(i).getRoomNO() +"\t  \t\t" + roomlist.get(i).getRoomstate() +"\t   \t\t"+ roomlist.get(i).getTypebed()+"\t   \t\t"+roomlist.get(i).getRoomtype()+"\t   \t"+roomlist.get(i).getLocation()+"\t   \t"+roomlist.get(i).getUsername()+"\t   \t"+roomlist.get(i).getPrice()+"\t  \t"+roomlist.get(i).getArrivetime()+"\t \t"+roomlist.get(i).getLeavetime());
                   d=roomlist.get(i).getRoomNO() +"\t  \t\t" + roomlist.get(i).getRoomstate() +"\t   \t\t"+ roomlist.get(i).getTypebed()+"\t   \t\t"+roomlist.get(i).getRoomtype()+"\t   \t"+roomlist.get(i).getLocation()+"\t   \t"+roomlist.get(i).getUsername()+"\t   \t"+roomlist.get(i).getPrice()+"\t  \t"+roomlist.get(i).getArrivetime()+"\t \t"+roomlist.get(i).getLeavetime();
                   r=r+"\n"+d;
                }    
           
               
           }    
         
            
        }
        //Bill
        else if(reportType==2)
        {
           loadFromFileBill();
            System.out.println(" Billnumber \t Cuest name \t  price \t  Paymentnumber \t  Paymenttype \t  pverify  \t  Arrivetime ");
           for(i=0;i<bill_list.size();i++)
           {
           
                if(checkDate( StartDate, EndDate,bill_list.get(i).getArrivetime()))      
                {
                
                   System.out.println(bill_list.get(i).getBno() +" \t"+ bill_list.get(i).getCname() +"\t"+bill_list.get(i).getPrice()+"\t"+bill_list.get(i).getPno()+"\t"+bill_list.get(i).getPtype()+"\t"+bill_list.get(i).isPverify()+"\t" + bill_list.get(i).getArrivetime());
                   d=bill_list.get(i).getBno() +" \t"+ bill_list.get(i).getCname() +" \t"+bill_list.get(i).getPrice()+" \t"+bill_list.get(i).getPno()+" \t"+bill_list.get(i).getPtype()+" \t"+bill_list.get(i).isPverify()+" \t" + bill_list.get(i).getArrivetime();
                   r=r+"\n"+d;
                }   
               
               
               
           }   
            
        }
        
        
     return r;   
    } 
    
    public boolean checkDate(String startDate,String endDate,String reportDate){
        
                //date from report(arrive time)
          String RD=reportDate;
        //start date from admin
        String SD=startDate;
        //end date
        String ED = endDate;

        //end date from admin (array of end date)
        String[] AED = ED.split("/");
        //date from report (array of date)
        String[] ARD = RD.split("/");
        //start date from admin (array of Start date)
        String[] ASD = SD.split("/");

        // end date
        String CED = AED[2]+AED[1]+AED[0];
        // variable hold concatenate date from report
        String CDR = ARD[2]+ARD[1]+ARD[0];
        // variable hold concatenate date from admin (start date)
        String CSD = ASD[2]+ASD[1]+ASD[0];



    //condition for concatenate the date come Admin  time for end

    if(Integer.parseInt(AED[0])<10 && Integer.parseInt(AED[1])>=10) {
        CED=AED[2]+AED[1]+"0"+AED[0];
    }else if(Integer.parseInt(AED[1])<10 && Integer.parseInt(AED[0])>=10){
        CED=AED[2]+AED[1]+"0"+AED[0];
    }else if(Integer.parseInt(AED[0])<10 && Integer.parseInt(AED[1])<10){
        CED=AED[2]+"0"+AED[1]+"0"+AED[0];
    }


    //condition for concatenate the date come from arrive time
    if(Integer.parseInt(ARD[0])<10 && Integer.parseInt(ARD[1])>=10) {
        CDR = ARD[2] + ARD[1] +"0"+ARD[0];
    }else if(Integer.parseInt(ARD[1])<10 && Integer.parseInt(ARD[0])>=10){
        CDR = ARD[2] +"0"+ARD[1]+ARD[0];
    }else if(Integer.parseInt(ARD[0])<10 && Integer.parseInt(ARD[1])<10){

        CDR = ARD[2] +"0"+ARD[1]+"0"+ARD[0];
    }

    //condition for concatenate the date come from admin start date
    if(Integer.parseInt(ASD[0])<10 && Integer.parseInt(ASD[1])>=10) {
        CSD=ASD[2]+ASD[1]+"0"+ASD[0];
    }else if(Integer.parseInt(ASD[1])<10 && Integer.parseInt(ASD[0])>=10){
        CSD=ASD[2]+"0"+ASD[1]+ASD[0];
    }else if(Integer.parseInt(ASD[0])<10 && Integer.parseInt(ASD[1])<10){
        CSD=ASD[2]+"0"+ASD[1]+"0"+ASD[0];
    }




    if(Integer.parseInt(CDR)>=Integer.parseInt(CSD) && Integer.parseInt(CDR)<=Integer.parseInt(CED)){

         return true ; 

    }else{ 
        
        
        return false ;
        }

      
    }
    
     
     
     
     
     
     
     
     
   
     
     
     
     
     
     
    
    
    
    
    
    
    
}
