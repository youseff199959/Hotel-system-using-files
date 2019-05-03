
package Classes;


public abstract  class Person {
 public   String F_name;
 public   String L_name;
 public   long national_id;
 public   String Address;
 public   long phone_NO;
 public   String birth_date;
 public   String username;
 public   int password;
 public   String type;
    

    
 
FileManager FManger = new FileManager();
MyException MyEX = new MyException("kareem Exception");

    public Person() {
    }
    
       public Person(String F_name, String L_name, long national_id, String Address, long phone_NO, String birth_date, String username, int password,String type) {
        this.F_name = F_name;
        this.L_name = L_name;
        this.national_id = national_id;
        this.Address = Address;
        this.phone_NO = phone_NO;
        this.birth_date = birth_date;
        this.username = username;
        this.password = password;
        this.type = type;
        
                  /*

        if (id < 0) {
            this.id = MyEX.checkPositive("ID");
        } else {
            this.id = id;
        }
        this.fname = fname;
        this.lname = lname;
        */
        if (password < 0) {
            this.password = MyEX.checkpassword("password");
        } else {
            this.password = password;
        }
        
        
        if (!username.contains("@") || !username.contains(".")) {
            this.username = MyEX.checkEmail("User name");
        } else {
            this.username = username;
        }


    }
       
       public void setF_name(String F_name) {
        this.F_name = F_name;
    }

    public void setL_name(String L_name) {
        this.L_name = L_name;
    }

    public void setNational_id(long national_id) {
        this.national_id = national_id;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone_NO(long phone_NO) {
        this.phone_NO = phone_NO;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setFManger(FileManager FManger) {
        this.FManger = FManger;
    }   

    public void setType(String type) {
        this.type = type;
    }
       
    public String getF_name() {
        return F_name;
    }

    public String getL_name() {
        return L_name;
    }

    public long getNational_id() {
        return national_id;
    }

    public String getAddress() {
        return Address;
    }

    public long getPhone_NO() {
        return phone_NO;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public FileManager getFManger() {
        return FManger;
    }   

    public String getType() {
        return type;
    }
    
       
     public boolean login(String userName, int password) {
        if (userName.equals("kareem@gmail.com") && password==123456) {
            return true;
        } else if (userName.equals("ussef@gmail.com") && password==230230) {
            return true;
        } 
        return false;
    }
//   public boolean login2(String userName, int password) {
//      
//        return false;
//    }
    public String getPersonData() {
        return this.F_name + "#" + this.L_name + "#" + this.national_id + "#" + this.Address + "#" + this.phone_NO + "#" + this.birth_date + "#" + this.username + "#" + this.password + "#";
    }
        
    
    
    
    }
       
       
       
     
  
    
    

