package a.ClassBasic;

/** PIC rule: PACKAGE -> IMPORT -> CLASS*/

public class Class_01_Basic {

    /**class fields or other variable
     * 1) Class fields doesn't need to be initialized
     * 2) Java initializes data Object -> null, primitives -> 0, boolean -> false;
     * 3) Type Variables
     *      a) Instance variables (Non-static Variables)
     *      b) Class variables (static Variables)
     *      c) Local variables
     *  4) Modifiers
     *      a) Access Modifiers − default, public , protected, private
     *      b) Non-access Modifiers − final, abstract, strictfp (restricts floating-point calculations)
     *
     * */
                        public int id; //access from everywhere
                        private String name; //restricted access

                        public final int CONSTANT_VALUE=12; //must be initialized

                        public static int staticValue; //

                        //test

    /**Constructor
    * 1) same name as Class
    * 2) Can be private, default, protected or public
    * 3) Can overloaded
    * */

                        public Class_01_Basic() {
                        }

                        public Class_01_Basic(int id) {
                            this.id = id;
                        }

                        public Class_01_Basic(int id, String name) {
                            this.id = id;
                            this.name = name;
                        }

    /**Getter and setter
        1) Helps accessing to fields
     */
                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

    /**Other Methods
     * 1) void - doesn't return anything
     * 2) String, int etc - return values/objects
     */

                        public void doSomething(){
                            System.out.println("I'm doing something");
                        }

                        public int calculateNumbers(){
                            return 3*2;
                        }

    /** static methods
     * 1) Belongs to class, no to object
     * 2) The instance doesn't need to created
     * 3) Can access to static members and change the value of it
     */

                        public static void doSomethingStatic(){
                            System.out.println("I'm doing something - static");
                        }

    /**equals and hashCode
     * hashCode
     * 1) Unique random int value
     * 2) equals = true, when 2 objects have same hasCode numbers
     * 3) equals = true, when 2 objects have different hasCode numbers
     * 4) use Generate hashCode() and equals()
     */
                        @Override
                        public boolean equals(Object o) {
                            if (this == o) return true;
                            if (o == null || getClass() != o.getClass()) return false;

                            Class_01_Basic that = (Class_01_Basic) o;

                            if (getId() != that.getId()) return false;
                            return getName() != null ? getName().equals(that.getName()) : that.getName() == null;
                        }

                        @Override
                        public int hashCode() {
                            int result = getId();
                            result = 31 * result + (getName() != null ? getName().hashCode() : 0);
                            return result;
                        }

    /**toString()
     * 1) string representation of object
     * 2) getClass().getName() + '@' + Integer.toHexString(hashCode())
     */
                        @Override
                        public String toString() {
                            return "Class_01_Basic{" +
                                    "id=" + getId() +
                                    ", name='" + getName() + '\'' +
                                    '}';
                        }
}