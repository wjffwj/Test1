package service;

public interface Ok {


    int getOk();

    default void sayHi(){//Jdk1.8的新特性-默认方法-可以写具体方法，
        System.out.println("Hi~~");
    }
}
