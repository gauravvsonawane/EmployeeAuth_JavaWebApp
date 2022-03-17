package com.student;

public class Student {
    private String uname;
    private String fname;
    private String lname;
    private String dob;
    private String email;
    public Student(String _uname, String _fname, String _lname, String _dob, String _email)
    {
        uname = _uname; 
        fname = _fname; 
        lname = _lname;
        dob = _dob;
        email = _email;
        
    }
    
    public String getUname() { return uname; }
    public String getFname() { return fname; }
    public String getLname() { return lname; }
    public String getDob() { return dob; }
    public String getEmail() { return email; }
}