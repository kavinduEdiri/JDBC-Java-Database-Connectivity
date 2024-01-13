package model;

import java.util.Date;

public class Student {
    private String studentNum;
    private String fullName;
    private Date dateOfBirth;
    private String address;

    public Student(String text, String txtFullNameText, String txtDateOfBirthText, String txtAddressText) {
    }

    public Student(String studentNum, String fullName, Date dateOfBirth, String address) {
        this.studentNum = studentNum;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentId) {
        this.studentNum = studentNum;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum='" + studentNum + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                '}';
    }
}