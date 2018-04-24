package b.DataType;

public class Class_02_Object {

    /** Obejcts
     * 1) equals, toString, hashCode
     *
     *
     */

    /**
     * Two object refer to different instances
     * */
            Object o1 = new Object();
            Object o2 = new Object();

            boolean equality1 = o1 == o2;
            boolean equality2 = o1.equals(o2);

        /**
         * o3 refer to same object like o1
         * */
            Object o3 = o1;

            boolean equality3 = o1.equals(o3);

            int hash1 = o1.hashCode();
            int hash2 = o2.hashCode();
            int hash3 = o3.hashCode();

        /**
         * s1 can't refer to o1
         * */

        String s1 = new String();

                boolean equality4 = o1.equals(s1);
                boolean equality5 = o1== s1;
}


