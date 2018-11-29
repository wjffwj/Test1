package testjavase;

/**
 * test方法区
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer a=40;
        Integer e=40;
        Integer b=new Integer(40);
        Integer c=20+20;
        Integer d=new Integer(40);
        System.out.println(a==b); //false
        System.out.println(a==c); //true
        System.out.println(b==d); //false
        System.out.println(a==e);//true
        Integer x=190;
        Integer z=190;
        System.out.println(x==z);//false
        int asd=190;
        System.out.println(x==asd);//true
    }
}
