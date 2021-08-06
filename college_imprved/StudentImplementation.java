package com.college;


import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class StudentImplementation implements StudentInterface{
    Set<StudentDetails> studentList = new HashSet<>();
    // set for course
    Set<CourseDetails> courseList = new HashSet<>();
    // Map to configure student with course
    HashMap<StudentDetails, CourseDetails> studentCourseMap = new HashMap<StudentDetails, CourseDetails>();

    @Override
    public Set<StudentDetails> showStudents() {
        return studentList;
    }

    public void addNewStudent(StudentDetails studentobj) {
        studentList.add(studentobj);
    }
    @Override
    public Set<com.college.CourseDetails> showCourse() {
        return courseList;
    }
    @Override
    public void addNewCourse(CourseDetails courseDetail) {
        courseList.add(courseDetail);
    }
    @Override
    public void courseRegistration(StudentDetails studDetails, CourseDetails courseDetails) {
        studentCourseMap.put(studDetails,courseDetails);
    }
    @Override
    public HashMap<StudentDetails, CourseDetails> showRegistartion() {
        return studentCourseMap;
    }
    @Override
    public List<StudentDetails> CourseDetails(int CourseId) {
        List<StudentDetails> studentList = new ArrayList<StudentDetails>();
        for(Entry<StudentDetails, CourseDetails> studMap : studentCourseMap.entrySet()) {
            if(studMap.getValue().courseId == CourseId) {
                studentList.add(studMap.getKey());
            }
        }
        return studentList;
    }
    @Override
    public CourseDetails StudentDetails(int studentId) {
        CourseDetails couseDetails = null;
        for(Entry<StudentDetails, CourseDetails> studMap : studentCourseMap.entrySet()) {
            if(studMap.getKey().studentId == studentId) {
                couseDetails = new CourseDetails(studMap.getValue().getCourseId(), studMap.getValue().getNameOfCourse(), studMap.getValue().getDurationOfCourse(),studMap.getValue().getNameOfSubjects());
            }
        }
        return couseDetails;
    }

}


