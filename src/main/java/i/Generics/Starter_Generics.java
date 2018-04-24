package i.Generics;

import java.util.ArrayList;
import java.util.List;

public class Starter_Generics {
    public static void main(String[] args) {

        /***********************************************************************************************************/
        System.out.println("*****************************************GENERICS*********************************************");

        List list1 = new ArrayList();
        list1.add("hello");
        String s1 = (String) list1.get(0);// Casting required

        System.out.println("Non Generics List Output: " + s1 );


        List<String> list2 = new ArrayList<>();
        list2.add("hello");
        String s2 = list2.get(0);   // No Casting required

        System.out.println("Generics List Output: " + s2 );

        /**Parameters Naming Convention
         E - Element (used extensively by the Java Collections Framework)
         K - Key
         N - Number
         T - Type
         V - Value
         S,U,V etc. - 2nd, 3rd, 4th types
         */

        Pair<String, Integer> p1 = new Class_01_Basic<String, Integer>("Even", 8);
        Pair<Integer, String>  p2 = new Class_01_Basic<Integer, String>(12, "world");


        List<Pair> list3 = new ArrayList<>();
        list3.add(p1);
        list3.add(p2);

        System.out.println("Generics List First 'K': " + list3.get(0).getKey());
        System.out.println("Generics List Second 'K': " +" "+list3.get(1).getKey());

    }
}
