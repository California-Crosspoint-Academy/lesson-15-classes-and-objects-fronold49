public class Exercises {
    public static void main(String[] args) {

        // 1.
        // a. Class: Rectangle
        // b. Object: myRect
        // c. Parameters: double and int (length and width)

        // 2.
        // public Rectangle(double length, int width)

        // 3.
        // Creating a Lunch object called yummy5:
        Lunch yummy5 = new Lunch(true, 900);

        // 4.
        // a. Class: BankAccount
        // b. Object: account39
        // c. Parameter: double

        // 5.
        // A class is like a cookie cutter.
        // An object is like a cookie.

        // 6.
        // Constructors cannot have a return type (void is invalid).
        // It should be: public School(int d, String m)

        // 7.
        // a. One class, many objects

        // 8.
        // a. The class must exist first

        // 9.
        // Illegal, constructors cannot be defined inside main.
        // They must be inside the class definition.

        // 10.
        // a. mem -> int
        // b. instrmnts -> int
        // c. budget -> double

        // 11.
        // Signature of constructor:
        // public BibleStory(String x, int y, double z)

        // 12.
        // Instance fields: var1, var2, sss

        // 13.
        // Signatures of methods:
        // public void Samson(double zorro)
        // public String getDelilah()

        // 14.
        BibleStory philistine = new BibleStory("Ralph", 19, 24.18);

        // 15.
        BibleStory gravy = new BibleStory("temp", 5, 5.5);
        gravy.var2 = 106.9;

        // 16.
        BibleStory bart = new BibleStory("Story", 10, 20.0);
        System.out.println(bart.sss);

        // 17.
        String jj = bart.sss;

        // 18.
        Trail trailObj = new Trail("Rocky Path");
        System.out.println(trailObj.met());

        // 19.
        double result = zippo.peachyDandy(10);
        System.out.println(result);

        // 20.
        // error, 127.31 is a double, not an int.
        // The method peachyDandy expects an int.
    }
}

class Trail {
    int x;
    int y;
    String s;

    public Trail(String sInput) {
        s = sInput;
        x = 10;
        y = 10;
    }

    public String met() {
        int value = x * y;
        return Integer.toHexString(value);
    }
}
