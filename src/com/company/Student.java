package com.company;

class Student {


    String sid;
    String sname;
    String saddres;
    String semail;
    String smobile;

    void setdetails(String sid, String sname, String saddres, String semail, String smobile) {
        this.sid = sid;
        this.sname = sname;
        this.saddres = saddres;
        this.semail = semail;
        this.smobile = smobile;
    }

    void displayStudentDetails()
    {
        System.out.println("Student Details :");
        System.out.println("Student Id :"+sid);
        System.out.println("Student Name :"+sname);
        System.out.println("Student Addres :"+saddres);
        System.out.println("Student Email :"+semail);
        System.out.println("Student Mobile :"+smobile);


    }
    public static void main(String args[])
    {
        Student s=  new Student();
        s.setdetails("dinesj","dkf","uewfh,","weifh","238y4");
        s.displayStudentDetails();


    }
}
