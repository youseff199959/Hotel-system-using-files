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
public class Bill {
     public int Bno;
    public String Cname;
    public double price;
    public int Pno;
    public String Ptype;
    public boolean pverify;
    public int count;
    public  String Arrivetime;
    FileManager FManger = new FileManager();
    
    public final String BillDataFileName = "billsdata.txt";


   public Bill() {
        count++;
    }

    public Bill(int Bno, String Cname, double price, int Pno, String Ptype, boolean pverify, String Arrivetime) {
        this.Bno = Bno;
        this.Cname = Cname;
        this.price = price;
        this.Pno = Pno;
        this.Ptype = Ptype;
        this.pverify = pverify;
       // this.count = count;
        this.Arrivetime = Arrivetime;
    }


    


    
public void setBno(int Bno) {
        this.Bno = Bno;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setPno(int Pno) {
        this.Pno = Pno;
    }

    public void setPtype(String Ptype) {
        this.Ptype = Ptype;
    }

    public void setPverify(boolean pverify) {
        this.pverify = pverify;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void setArrivetime(String Arrivetime) {
        this.Arrivetime = Arrivetime;
    }
    public int getBno() {
        return Bno;
    }

    public String getCname() {
        return Cname;
    }
    public double getPrice() {
        return price;
    }
    public int getPno() {
        return Pno;
    }

    public String getPtype() {
        return Ptype;
    }
    public boolean isPverify() {
        return pverify;
    }
    public int getCount() {
        return count;
    }

    public String getArrivetime() {
        return Arrivetime;
    }
    
    private String getbillsdata()
    {
    
        return this.Bno+"#"+this.Cname+"#"+this.price+"#"+this.Pno+"#"+this.Ptype+"#"+this.pverify+"#"+this.Arrivetime;
    
    }
      public boolean addbill () {
        if (FManger.write(getbillsdata(), BillDataFileName, true)) {
            return true;
        } else {
            return false;
        }   
      }
          public void addNewbill( int Bill_no,String Cuestname, double  pricebill,int Payno,String Paytype,boolean pverify,String Arrivetime ) {
     Bill x=new Bill(Bill_no, Cuestname, pricebill, Payno, Paytype, pverify, Arrivetime);
              if (x.addbill()) {
            System.out.println(toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
          }

    public double Price(int Days,double Price,double Extra) {
        price=(double) (Days*Price)+Extra;
        return price;}
    
}