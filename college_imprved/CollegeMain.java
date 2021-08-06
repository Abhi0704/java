package com.college;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollegeMain{
    public static void main(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter("E:\\java practice\\CollegeMain.txt");
        BufferedWriter bufferWriter= new BufferedWriter(fileWriter);
        //Creating object of student implementation to access all the methods in that class
        StudentImplementation studentImplementation = new StudentImplementation();
        // adding new student data through studentImplementation object in StudentDetails constructor
        StudentDetails s1= new StudentDetails(1, "Abhijeet", "Singh", 'A', 23 , 947865479 ,"abhijeet0704@gmail.com");
        studentImplementation.addNewStudent(s1);
        StudentDetails s2= new StudentDetails(2, "Vishal", "Singh", 'B', 25 ,  954637645, "vishal8675@gmail.com");
        studentImplementation.addNewStudent(s2);
        StudentDetails s3= new StudentDetails(3, "Shivam", "Sahoo", 'C', 26, 876543218, "shivamsahoo98@gmail.com");
        studentImplementation.addNewStudent(s3);
        StudentDetails s4= new StudentDetails(4, "Aditya", "Pratap", 'B', 22, 876989765, "pratapaditya32@gmail.com");
        studentImplementation.addNewStudent(s4);
        StudentDetails s5= new StudentDetails(5, "Tushar", "Rai", 'A', 26, 765498675,"raitushar45@gmail.com" );
        studentImplementation.addNewStudent(s5);
        StudentDetails s6= new StudentDetails(6, "Ravi", "Kumar", 'D', 22, 656498762, "ravikumarravi5454@gmail.com" );
        studentImplementation.addNewStudent(s6);
        // adding new courses data through studentImplementation object in courseDetails constructor
        CourseDetails c1 = new CourseDetails(101,"Bachelor of Technology:Mechanical:" ,4, new ArrayList(Arrays.asList("Microwaves & Radar,Wave Propogation,Digital Circuits.")));
        studentImplementation.addNewCourse(c1);
        CourseDetails c2 = new CourseDetails(102,"Bachelor of Technology:IT:" ,4, new ArrayList(Arrays.asList("Data Structures,Computer Networks,Object Oriented Prog.")));
        studentImplementation.addNewCourse(c2);
        CourseDetails c3 = new CourseDetails(103,"Bachelor of Technology:CS:" ,4, new ArrayList(Arrays.asList("C++, Python, Data Structures, Operating Systems")));
        studentImplementation.addNewCourse(c3);
        CourseDetails c4 = new CourseDetails(104,"Bachelor in Science:" ,3, new ArrayList(Arrays.asList("Mathematics, Statistics , Computer Science")));
        studentImplementation.addNewCourse(c4);
        CourseDetails c5 = new CourseDetails(105,"Bachelor in Science:" ,3, new ArrayList(Arrays.asList("PHY,MATH,CHEMISTRY,BIOLOGY")));
        studentImplementation.addNewCourse(c5);
        CourseDetails c6 = new CourseDetails(106,"Bachelor of Commerce:" ,3, new ArrayList(Arrays.asList("Accounts,Math,Economics,Business Studies")));
        // registering courses for different student objects and mapping them to different course objects
        studentImplementation.courseRegistration(s1,c3);
        studentImplementation.courseRegistration(s2,c1);
        studentImplementation.courseRegistration(s3,c2);
        studentImplementation.courseRegistration(s4,c5);
        studentImplementation.courseRegistration(s5,c4);
        studentImplementation.courseRegistration(s6,c6);
        //printing all studentDetail objects mentioned above using iterator
        bufferWriter.write("To print all Student Details:" +"\n");
        Iterator  it = studentImplementation.showStudents().iterator();
        while(it.hasNext()) {
            bufferWriter.write(it.next().toString());
            bufferWriter.newLine();
        }
        //printing all the courseDetail objects mentioned above using iterator
        bufferWriter.write("\n"+"To print all Course Details:" +"\n");
        Iterator  it1 = studentImplementation.showCourse().iterator();
        while(it1.hasNext()) {
            bufferWriter.write(it1.next().toString());
            bufferWriter.newLine();
        }
        //printing registration details using mapping of studentID with courseID
        bufferWriter.write("\n"+"All Registration Details are:" +"\n");
        bufferWriter.write(studentImplementation.showRegistartion().toString());
        //Printing studentDetails by passing the courseID he/she is enrolled in
        bufferWriter.newLine();
        bufferWriter.write("\n"+"Printing StudentDetails of CourseId-102:" +"\n");
        Iterator<?> it3 = studentImplementation.CourseDetails(102).iterator();
        while(it3.hasNext()) {
            bufferWriter.write(it3.next().toString());
            bufferWriter.newLine();
        }
        bufferWriter.newLine();
        bufferWriter.write("\n"+"Printing StudentDetails of CourseID-103: " +"\n");
        Iterator<?> it4 = studentImplementation.CourseDetails(103).iterator();
        while(it4.hasNext()) {
            bufferWriter.write(it4.next().toString());
            bufferWriter.newLine();
        }
        //integer type so to print and return it we just use bw.write method with toString
        bufferWriter.write("\n"+"Printing CourseDetails of StudentId-1 and 3:" +"\n");
        bufferWriter.write( studentImplementation.StudentDetails(1).toString());
        bufferWriter.newLine();
        bufferWriter.write(studentImplementation.StudentDetails(3).toString());
        bufferWriter.flush();
        bufferWriter.close();
    }
}



