package com.college;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import com.college.CourseDetails;
import com.college.StudentDetails;

public interface StudentInterface {
//student objects

    Set<StudentDetails> showStudents();
    void addNewStudent(StudentDetails student);
    Set<CourseDetails> showCourse();
    void addNewCourse(CourseDetails courseDetail);
    void courseRegistration(StudentDetails studDetails,CourseDetails courseDetails);
    HashMap<StudentDetails, CourseDetails> showRegistartion();
    List<StudentDetails> CourseDetails (int CourseId);
    CourseDetails StudentDetails (int studentId);
}
