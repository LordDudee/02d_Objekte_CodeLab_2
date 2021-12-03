package com.cc.java;

public class Staff {
    
    private String firstName;
    private String familyName;
    private String role;
    private String yearOfEntry;
    
    
    
    public Staff(String firstName, String familyName, String role, String yearOfEntry){
        
        this.firstName = firstName;
        this.familyName = familyName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }


    public String getInfo(String data){
        switch (data) {
            case "#first":
                return firstName;
            case "#family":
                return familyName;
            case "#role":
                return role;
            case "#entry":
                return yearOfEntry;
            default:
                return "noData";
        }  
    }
    
}
