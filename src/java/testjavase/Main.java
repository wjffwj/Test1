package testjavase;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        while(reader.hasNext()){
            StringBuffer sb=new StringBuffer();
            String str=reader.nextLine();
            String[] s = str.split(" ");
            for(int i=s.length-1;i>=0;i--){
                sb.append(s[i]+" ");
            }
            System.out.println(sb.toString().substring(0,sb.length()-1));
        }
    }
}
