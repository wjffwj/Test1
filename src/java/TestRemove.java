import domain.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRemove {
    public static void main(String[] args) {
        Student s=new Student(1,"2","2");
        Student s1=new Student(3,"3","2");
        Student s2=new Student(1,"2","2");
        Student s3=new Student(1,"2","2");
        List<Student> list=new ArrayList<Student>();
        list.add(s);list.add(s1);list.add(s2);list.add(s3);

        Iterator<Student> it=list.iterator();
        while(it.hasNext()){
            Student next = it.next();
            if(next.getId()==3){
                it.remove();
            }
        }
        System.out.println(list.toString());
    }
}
