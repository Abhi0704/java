package com.college;
import java.io.Serializable;
import java.util.List;
public class CourseDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    int courseId;  // This is unique ID for every course
    String nameOfCourse;
    int durationOfCourse;
    List<String> nameOfSubjects;

    public CourseDetails(int courseId, String nameOfCourse, int durationOfCourse, List<String> nameOfSubjects) {
        this.courseId = courseId;
        this.nameOfCourse = nameOfCourse;
        this.durationOfCourse = durationOfCourse;
        this.nameOfSubjects = nameOfSubjects;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public int getDurationOfCourse() {
        return durationOfCourse;
    }

    public List<String> getNameOfSubjects() {
        return nameOfSubjects;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public void setDurationOfCourse(int durationOfCourse) {
        this.durationOfCourse = durationOfCourse;
    }

    public void setNameOfSubjects(List<String> nameOfSubjects) {
        this.nameOfSubjects = nameOfSubjects;
    }

    @Override
    public boolean equals(Object obj) {
        CourseDetails courseDetails = (CourseDetails) obj;
        return (courseId == courseDetails.courseId);
    }

    @Override
    public String toString() {
        return "CourseDetails {courseId= " + courseId + ", courseName=" + nameOfCourse + ", courseDuration="
                + durationOfCourse + ", subjectsName=" + nameOfSubjects + "}";
    }
}

