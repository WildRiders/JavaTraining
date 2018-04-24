package g.Java8Features;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Starter_02_Stream {

    public static void main(String[] args) {

        /**
         * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
         * sequence of data
         * java.util.stream
         * new in JAVA 8
         *
         */

        System.out.print("Stream: ");
        Stream test1 =Stream.of("duck", "duck", "duck", "goose");
        test1.distinct().forEach(s-> System.out.print(s+" "));
        System.out.println("");

        System.out.print("List to Stream: ");
        List<String> test2 = Arrays.asList("duck", "duck", "duck", "goose");
        test2.stream().distinct().forEach(s-> System.out.print(s+" "));
        System.out.println("");


        List<String> test3=Arrays.asList("duck", "duck", "duck", "goose");
        List<String> collect =  test3.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Collected to list: " + collect);


    }
}


