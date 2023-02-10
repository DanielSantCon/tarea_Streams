import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class orden {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,2,1,34,6,4,2,5,7,2,3,34,4);
        Set<Integer> set =new LinkedHashSet<>(list);
        List<Integer> list2 = new ArrayList<>(set);
        Collections.sort(list2);
        for (Integer l :list2)
        {
            int l2=l*l;
            System.out.println(l2);
        }

        SortedSet<Integer> list3 = new TreeSet<>(list);
        Map<Integer,Integer> map=list3.stream()
                .collect(Collectors.toMap(i ->i,i->i*i ));
        map.forEach((key,value)-> System.out.println("key "+key+" value: "+value));



        Integer[] arr=map.keySet().toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));


        Integer[] arr1=map.entrySet().stream()
                .map(Map.Entry::getValue)
                .sorted()
                .toArray(Integer[]::new);
        Arrays.stream(arr1).forEach(System.out::println);




    }
}
