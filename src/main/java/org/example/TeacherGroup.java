package org.example;
import java.util.ArrayList;
import java.util.List;

public class TeacherGroup {
    private TeacherService valid = new TeacherService();
    private   List<Teacher> teacherList = new ArrayList<>();

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void addTeacher(Teacher teacher){
        if(valid.NameValid(teacher)){
            teacherList.add(teacher);
        }else{
            System.out.println("Учителя невозможно добавить в группу Учителей, т.к недостаточно данных об Учителе");
        }


    }
}
