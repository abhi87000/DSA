//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    import java.util.*;

public class Main {

    public static void main(String[] args) {
        LRU lru=new LRU(2);
        lru.add(1,2);
        lru.add(2,4);
        lru.add(1,3);
        lru.add(3,3);
        lru.add(4,6);

//        lru.hashMap.entrySet().stream().forEach((hash)-> System.out.println(hash.getKey()+" "+lru.get(hash.getKey())));
        new ArrayList<>(lru.hashMap.keySet())
                .forEach(key -> System.out.println(key + " " + lru.get(key)));
//        for(Map.Entry<Integer, LRU.Node> entry:lru.hashMap.entrySet())


//        lru.hashMap.forEach((key,val)-> System.out.println(key +" "+ lru.get(key)));
//        lru.hashMap.entrySet().stream().forEach(integerNodeEntry -> System.out.print
//        ln(integerNodeEntry.getKey()+" "+integerNodeEntry.getValue().g));

    }
}