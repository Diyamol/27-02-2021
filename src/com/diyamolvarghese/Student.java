package com.diyamolvarghese;

import javax.xml.soap.SAAJResult;
import java.sql.Date;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender;   //Enum

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private String address;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private String city;
    private String pincode;
    private String cellPhone;
    private String email;
    private String department;
    private float marks[];
    private float totalMarks;
    private float percentage;
    private String grade;
    private float gradePoint;

    public void calculateMarks(){
        float total=0.0f;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        setTotalMarks(total);
    }
    public void calculatePercentage(){
        float percentage=0.0f;
        percentage=(totalMarks*100)/500;
        setPercentage(percentage);
    }


    public void calculateGrade(){
        if(percentage>=94)
        {
            grade="A+";
        }
        else if(percentage>=87){
            grade="A";
        }
        else if(percentage>=80){
            grade="A-";
        }
        else if(percentage>=77){
            grade="B+";
        }
        else if(percentage>=73){
            grade="B";
        }else if(percentage>=70){
            grade="B-";
        }else if(percentage>=67){
            grade="C+";
        }
        else if(percentage>=63){
            grade="C";
        }
        else if(percentage>=60){
            grade="C-";
        }else if(percentage>=50){
            grade="D";
        }else {
            grade="F";
        }


    }
}
