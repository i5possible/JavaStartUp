package ReusingClass;

/**
 * Created by hliang on 09/12/2016.
 */
//: reusing/Bath.java
// Constructor initialization with composition.

/**
 * 1. Initializing at point of definition.
 * 2. In the constructor for that class.
 * 3. Using instance initialization.
 * 4. Right before you catually need to use the object. This is often called lazy initialization.
 * It can reduce overhead in situations where object creation is expensie and the object doesn't need to be created every time.
 */
class Soap {
    private String s;

    Soap() {
        System.out.print("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    private String // Initializing at point of definition:
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    // Instance initialization:
    {
        i = 47;
        s4 = "Kevin";
    }

    public Bath() {
        System.out.print("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.print(b);
    }

    public String toString() {
        //if(s4 == null) // Delayed initialization:
        s4 = "Joy";
        return
                "s1 = " + s1 + "\n" +
                        "s2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille;
    }
} /* Output:
Inside Bath()
Soap()
s1 = Happy
s2 = Happy
s3 = Joy
s4 = Kevin
i = 47
toy = 3.14
castille = Constructed
*///:~
