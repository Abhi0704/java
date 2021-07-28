package com.college;
import java.util.List;

public interface StudentInterface {
//student objects

    List<StudentDetails> showStudents();
    void addNewStudent(StudentDetails student);
    List<StudentDetails> deleteStudent(int id);
    char showStudentGrade(int studentId);
    void studentsByGrades();

}
