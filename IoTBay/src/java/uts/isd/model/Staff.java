package uts.isd.model;
import java.io.Serializable;

public class Staff implements Serializable{
    
    private String name;
    private String dob;
    private String email;
    private String number;
    private String address;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Staff(String name, String dob, String email, String number, String address, String password) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.number = number;
        this.address = address;
        this.password = password;
    }
 
}
