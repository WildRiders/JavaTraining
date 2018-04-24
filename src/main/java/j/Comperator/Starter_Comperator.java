package j.Comperator;

import java.util.*;

public class Starter_Comperator {
    public static void main(String[] args) {

        /***********************************************************************************************************/
        System.out.println("*****************************************COMPARABLE*********************************************");


        /**
         * interface, functional interface
         * public interface Comparable<T>{
         *     public int compareTo(T o)
         * }
         *
         * return: 0 objects are equal
         *        number<0 current object smaller than argument
         *        number>0 current object bigger than argument
         *
         * */

        class Boy implements Comparable<Boy>{

            String name;
            Integer age;// Objects

            public Boy(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Boy{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }

            @Override
            public int compareTo(Boy o) {
                return age.compareTo(o.age);
            }
        }

        List<Boy> boys = Arrays.asList(new Boy("John", 56),new Boy("Tom", 45));


        System.out.println("Before sorting: "+  boys.toString());

        Collections.sort(boys);
        System.out.println("After sorting: "+  boys.toString());
        System.out.println();

        /***********************************************************************************************************/
        System.out.println("*****************************************COMPARATOR*********************************************");

        class Girl {

            String name;
            int age;// Objects

            public Girl(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public int getAge() {
                return age;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "Girl{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        class GirlSortingByAge implements Comparator<Girl> {
            @Override
            public int compare(Girl firstPlayer, Girl secondPlayer) {
                return (firstPlayer.getAge() - secondPlayer.getAge());
            }

    }

        GirlSortingByAge sortingByAge = new GirlSortingByAge();
        List<Girl> girls = new ArrayList<>(Arrays.asList(new Girl("Anna", 56),new Girl("Maria", 45)));

        System.out.println("Before sorting: "+  girls.toString());

        Collections.sort(girls,sortingByAge);
        System.out.println("After sorting: "+  girls.toString());
        System.out.println();

        /***********************************************************************************************************/
        System.out.println("*****************************************LAMBDA*********************************************");

        Comparator<Girl> byAge = (Girl g1, Girl g2)  -> g1.age - g2.age;
        Comparator<Girl> byName = new Comparator<Girl>() {
            @Override
            public int compare(Girl o1, Girl o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        girls.add(new Girl("Emma", 12));
        System.out.println("Before Lambda sorting: "+  girls.toString());

        Collections.sort(girls,byAge);
        System.out.println("After sorting: "+  girls.toString());

        Collections.sort(girls,byName);
        System.out.println("After sorting byName: "+  girls.toString());
        System.out.println();

        /***********************************************************************************************************/
        System.out.println("*****************************************LAMBDA*********************************************");

}
}


