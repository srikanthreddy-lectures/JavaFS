package challengs1;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String str="AM PM Day Cook Right";

        //1 split the text to get each word   - split(" ")
        // and
        //2 filter each word and each char is uppercase - filter(str -> Character.isUpperCase(str.charAt(1)))
        // and
        //3 collect the result in a list or display result on the console using for-each
        //   collect(asList) or for-each

        //Stream.of(str.split(" "))
        //       .filter(s -> Character.isUpperCase(s.charAt(1)))
        //        .forEach(x-> System.out.print(x+" "));

        //[AM, PM] --- List (after filter)
        
        List<String> list = Stream.of(str.split(" "))
               .filter(s -> Character.isUpperCase(s.charAt(1)))
                .collect(Collectors.toList());
        System.out.println(list);

        
        
        String str2 ="IN India";
        Map<String, String> myMap = Arrays.asList(str2).stream().map(s -> s.split(" ")).collect(Collectors.toMap(s -> s[0], s->s[1]));
        System.out.println(myMap);
        
    }
}
