package domain;

public class Test {
    public static void main(String[] args) {
        String s1 = "This is only a" + " simple" + "test";
        StringBuilder sb=new StringBuilder().append("This is only a").append(" simple").append("test");
        System.out.println(s1.equals(sb));
    }
}
