package 稀疏数组;

import java.util.List;

public class studentInfo {
    public static void main(String[] args) {
        List<student> students = null;
        //信息的添加
        System.out.println("信息的添加");
        students.add(new student(10,"一号",164,1));
        students.add(new student(30,"三号",198,3));
        students.add(new student(20,"二号",175,2));

        //信息加入
        students.add(new student(20,"二号",175,2));


    }


}

class student{
    public int age;
    public String name;
    public int higt;
    public int id;

    public student(int age, String name, int higt, int id) {
        this.age = age;
        this.name = name;
        this.higt = higt;
        this.id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", higt=" + higt +
                ", id=" + id +
                '}';
    }



}
