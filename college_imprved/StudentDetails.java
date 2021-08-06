package com.college;
import java.util.Objects;
import java.io.Serializable;

public class StudentDetails implements Serializable {
    int studentId;
    String firstName;
    String lastName;
    char grade;
    int age;
    int mobileNum;
    String emailAddress;

    public StudentDetails(int studentId, String firstName, String lastName ,char grade, int age, int mobileNum, String emailAddress)
    {
        super();
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade   = grade;
        this.age = age;
        this.emailAddress = emailAddress;
        this.mobileNum = mobileNum;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public int getMobileNum() {
        return mobileNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public int hashCode() {
        return  studentId;
    }
    @Override
    public boolean equals(Object obj) {
        StudentDetails studentDetails = (StudentDetails) obj;
        return (studentId == studentDetails.studentId);
    }
    @Override
    public String toString() {
        return "StudentDetails [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
                + ", grade=" + grade + ",age=" + age + ",mobileNumber=" + mobileNum + ",emai=" + emailAddress + "]";
    }
}
