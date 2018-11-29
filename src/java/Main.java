

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        while(reader.hasNext()){
            String str=reader.nextLine();
            outPut(str);
        }
    }

    public static void outPut(String str){
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        String[] s = str.split(" ");
        Arrays.stream(s).forEach(item->{
            list.add(Integer.valueOf(item));
        });
        list.stream().forEach(i->{
            if(map.get(i)==null){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        });
        for(int i=0;i<list.size();i++){
            if(map.get(list.get(i))>=list.size()/2){
                System.out.println(list.get(i));
                break;
            }
        }
    }
}