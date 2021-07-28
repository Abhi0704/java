package com.college;

public class CollegeMain {
    public static void main(String[] args) {
        StudentImplementation stuObj = new StudentImplementation();
        stuObj.addNewStudent(new StudentDetails(1, "Abhijeet", "Singh", 'A'));
        stuObj.addNewStudent(new StudentDetails(2, "Vishal", "Singh", 'B'));
        stuObj.addNewStudent(new StudentDetails(3, "Shivam", "Sahoo", 'C'));
        stuObj.addNewStudent(new StudentDetails(4, "Aditya", "Pratap", 'B'));
        stuObj.addNewStudent(new StudentDetails(5, "Tushar", "Rai", 'A'));
        stuObj.addNewStudent(new StudentDetails(6, "Ravi", "Kumar", 'D'));

        System.out.println( stuObj.showStudents());
        System.out.println(stuObj.showStudentGrade(5));
        stuObj.studentsByGrades();
        stuObj.deleteStudent(6);
        System.out.println( stuObj.showStudents());



    }
}
