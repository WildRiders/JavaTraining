package d.Containers;

import java.util.*;

public class Starter_Containers {
    public static void main(String[] args) {

        /***********************************************************************************************************/
        System.out.println("*****************************************LIST********************************************");

        /**Lists
         * 1) Can contain only objects - one type only
         * 2) size can be modified
         * 3) Unsorted, duplicates, accesses by indexOf()
         * 4) Two main types - ArrayList, LinkedList
         * 5) ArrayList vs LinkedList
         *      - inserting and removing - slower than LinkedList
         *      - referring - faster than LinkedList
         * */

        /** Initialization*/
        List<String> exampleList1 = new ArrayList<>();
        ArrayList<String> exampleList2 = new ArrayList<>();
        LinkedList<String> exampleList3 = new LinkedList<String>();
        //LinkedList<String> exampleList4 = new ArrayList();//TODO CAN'T DO THAT

        ArrayList<String> places = new ArrayList<String>();
        places.add("Buenos Aires");
        places.add("Córdoba");
        places.add("La Plata");

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(new Integer("2"));
        integers.add(Integer.valueOf("4"));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        /** Looping*/

        //One line
        for (int i = 0; i < numbers.size(); i++)
            System.out.println("Looping List One Line " + i);

        //More than one line
        for (int i = 0; i < numbers.size(); i++) {
            String loopName = "Looping List More Than One";
            System.out.println(loopName + " " + i);
        }

        //For Each
        for (int item : numbers) {
            System.out.println("Looping List For Each " + item);
        }

        //Iterator
        for (Iterator<Integer> iter = numbers.iterator(); iter.hasNext(); ) {
            Integer element = iter.next();
            System.out.println("Looping List Iterator " + element);
        }


        //Functional language - stream + Java8Features + Method reference (double colon) Java8
        Arrays.asList(1, 2, 3, 4).forEach(System.out::println);
        Arrays.asList(1, 2, 3, 4).forEach(s -> System.out.println("Looping Java8Features For Each " + s));


        //Functional language - stream + Java8Features Java8
        Arrays.asList(1, 2, 3, 4).stream().forEach(System.out::println);

        /***********************************************************************************************************/
        System.out.println("*****************************************SET*********************************************");

        /**SET interface
         * 1) Can contain only objects - one type only
         * 2) No duplicates
         * 3) HashSet - unordered, unsorted, no duplicates
         *      - Stores elements in hashTable
         *      - uses hashCode()
         *      - iterates in random order
         *      - effective retrieving
         *      - constant time to check element in table
         *      - most common set
         *      - O(1) constant time
         * 4) ThreeSet - unsorted, no duplicates
         *      - sorted natural order,  no duplicates
         *      - O(log n) efficiency - slower than data size
         * 5) LinkedHashSet
         *      - ordered, unsorted, no duplicates
         *
         */

        /** Initialization***/

        HashSet<Object> hashSetStrings = new HashSet<>();
        Set<Integer> hashSetNumbers= new HashSet<>();
        hashSetNumbers.add(3);
        hashSetNumbers.add(1);
        hashSetNumbers.add(2);

        System.out.println("HashSet Table " + hashSetNumbers);

        Set<Integer> treeSetNumbers= new TreeSet<>(Arrays.asList(3,2,2,3,1));

        System.out.println("TreeSet Table " + treeSetNumbers);

        /** Looping */
        //Same as List

        /***********************************************************************************************************/
        System.out.println("*****************************************MAP*********************************************");

        /**MAP interface
         * 1) Can contain only objects
         * 2) Key, Value Table
         * 3) HashMap - unordered, unsorted
         * 4) ThreeSet - sorted by key
         * 5) LinkedHashMap
         *
         */

        Map<String,String> hashMapExample = new HashMap<>();
        hashMapExample.put("c", "d");
        hashMapExample.put("a", "b");

        System.out.println("HashMap Table " + hashMapExample);

        /** Looping */

        //Forech
        for (Map.Entry<String, String> entry : hashMapExample.entrySet())
        {
            System.out.println("Looping Map " + entry.getKey() + "/" + entry.getValue());
        }

        //Forech entrySet
        for (Map.Entry<String, String> entry : hashMapExample.entrySet())
        {
            System.out.println("Looping Map " + entry.getKey() + "/" + entry.getValue());
        }

        //Iterator
        Iterator<Map.Entry<String, String>> entries = hashMapExample.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        //Generics
        Collection<?> keys = hashMapExample.keySet();
        for(Object key: keys){
            System.out.println("Key " + key);
            System.out.println("Value " + hashMapExample.get(key));
        }

        //ForEach Java8
        hashMapExample.forEach((k, v) -> System.out.println("Looping Java8Features For Each " + k +"/" +v));


    }
}
