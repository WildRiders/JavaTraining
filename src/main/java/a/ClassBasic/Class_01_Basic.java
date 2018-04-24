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

    /**Constractor
    * 1) same name as Class
    * 2) Can be private, default, protected or public
    * 3) Can overloaded
    *
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
     * 1)
     *
     */

                        public static void doSomethingStatic(){
                            System.out.println("I'm doing something - static");
                        }

    /**equals and hashCode
    1)
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

    /**
     * 1) toString method -
     */
                        @Override
                        public String toString() {
                            return "Class_01_Basic{" +
                                    "id=" + getId() +
                                    ", name='" + getName() + '\'' +
                                    '}';
                        }
}