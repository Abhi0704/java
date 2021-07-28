package com.college;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentImplementation implements StudentInterface{

    public static List<StudentDetails> studentsDataList = new ArrayList<>();
    @Override
    public List<StudentDetails> showStudents() {
        return studentsDataList;
    }

    @Override
    public void addNewStudent(StudentDetails student) {
        studentsDataList.add(student);
    }

    @Override
    public List<StudentDetails> deleteStudent(int id) {
        int getIndex =0 ;
        for(int i=0;i<studentsDataList.size();i++)
        {
            if(studentsDataList.get(i).studentId==id) {
                getIndex= i;
                break;
            }
        }
        studentsDataList.remove(getIndex);
        return studentsDataList;
    }

    @Override
    public char showStudentGrade(int id) {
        char gradeOfStu = 0;
        for(int i=0;i<studentsDataList.size();i++) {
            if(studentsDataList.get(i).studentId==id) {
                gradeOfStu = studentsDataList.get(i).grade;
                break;
            }
        }
        return gradeOfStu;
    }


    @Override
    public void studentsByGrades() {
        Collections.sort(studentsDataList);
        System.out.println(studentsDataList.toString());

    }
}
