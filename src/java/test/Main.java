package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        while(reader.hasNext()){
            int sum;
            String str=reader.nextLine();
            List<Integer> ilist=new ArrayList<>();
            List<String> list = Arrays.stream(str.split(" ")).collect(Collectors.toList());
            list.stream().forEach(item->{
                 item=new StringBuffer(item).reverse().toString();
                ilist.add(Integer.valueOf(item));
            });
            sum = ilist.stream().mapToInt(i -> i).sum();
            String strs=String.valueOf(sum);
            System.out.println(Integer.valueOf(new StringBuffer(strs).reverse().toString()));
        }
    }
}
