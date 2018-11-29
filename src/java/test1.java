import domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class test1 {
    public static void main(String[] args) {
       Student student1=new Student();
       student1.setId(1);
       student1.setName("haha");
       student1.setSex("1");
       Student student2=new Student();
        student2.setId(2);
        student2.setName(null);
        student2.setSex(null);
        Student student3=new Student();
        student3.setId(2);
        student3.setName("jaja");
        student3.setSex(null);
        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        list = list.stream().filter((Student s) -> s.getName() != null && s.getSex() != null).collect(Collectors.toList());
        System.out.println(list);


    }
}
