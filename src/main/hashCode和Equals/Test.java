package hashCode和Equals;

import 序列化.Parent;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Stu stu=new Stu("魏俊峰",23);
        Stu stu1=new Stu("魏俊峰",23);
        System.out.println(stu==stu1);//false
        System.out.println(stu.equals(stu1));//false


        Set<Stu> set=new HashSet<>();
        set.add(stu);
        System.out.println(set.size());
        set.add(stu1);
        System.out.println(set.size());


        String a=new String("123");
        String b=new String("123");
        System.out.println(a.hashCode()==b.hashCode());
        Integer c=new Integer(1);
        Integer d=new Integer(1);
        System.out.println(c.hashCode()==d.hashCode());

        Parent p=new Parent();
        Parent p1=new Parent();
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
    }
}
