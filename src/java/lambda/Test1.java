package lambda;

import domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student student=new Student(1,"jack","男");
        Student student1=new Student(2,"mack","男");
        Student student2=new Student(3,"jimi","女");
        list.add(student);list.add(student1);list.add(student2);

        //lambda表达式
        List<Integer> ids=list.stream().map(Student::getId).collect(Collectors.toList());
        List<String>  names=list.stream().map(Student::getName).collect(Collectors.toList());
        List<String>  sexs=list.stream().map(Student::getSex).collect(Collectors.toList());
        System.out.println(ids);
        System.out.println(names);
        System.out.println(sexs);
        //过滤
        List<Integer> idss=list.stream().filter(item-> item.getId()%2==0).map(Student::getId).collect(Collectors.toList());
        System.out.println(idss);


    }
}
