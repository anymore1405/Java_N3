package Bai12;

import java.util.ArrayList;
import java.util.List;

//Nguyễn Khắc Tài - CT030147

public class QuanLy {
    private List<GiaoVien> teacherList;

    public  QuanLy () {
        this.teacherList = new ArrayList<>();
    }

    public void addTeacher (GiaoVien teacher){
        this.teacherList.add(teacher);
    }

    public void showInfo() {
        this.teacherList.forEach(teacher -> System.out.println(teacher.toString()));
    }

    public double getSalary(String id) {
        GiaoVien teacher = this.teacherList.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return  0;
        }
        return teacher.getRealSalary();
    }
}