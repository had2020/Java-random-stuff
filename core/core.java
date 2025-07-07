import java.util.Scanner;

//   STRUCT  
class User {
    String name;
    int age;

    public void greet() {
        System.out.println("Hi, I'm " + name);
    }
}

//   ENUM  
enum Direction {
    NORTH, SOUTH, EAST, WEST;
}

//   INTERFACE (Trait)  
interface Greet {
    void greet();
}

class Person implements Greet {
    public void greet() {
        System.out.println("Hello!");
    }
}

//   GENERIC FUNCTION  
class Printer {
    public static <T> void printItem(T item) {
        System.out.println(item);
    }
}

//   MAIN CLASS  
public class core {

    // FUNCTION
    public static int add(int a, int b) {
        return a + b;
    }

    // ERROR HANDLING
    public static int divide(int a, int b) throws Exception {
        if (b == 0) throw new Exception("Divide by zero");
        return a / b;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, core of Java!");

        // VARIABLES
        byte a = 127;            // i8
        short b = 32000;         // i16
        int c = 1_000_000;       // i32
        long d = 10000000000L;   // i64
        float e = 3.14f;         // f32
        double f = 2.718281828;  // f64

        System.out.println(0.1 + 0.2); // floating point fun

        // INPUT
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Entered: " + num);

        // CONTROL FLOW
        if (num > 5) {
            System.out.println("Greater");
        } else {
            System.out.println("Less");
        }

        for (int i = 0; i < 5; i++) {
            num += 1;
        }

        // STRUCT EXAMPLE
        User u = new User();
        u.name = "Hadrian";
        u.age = 17;
        u.greet();

        // ENUM + SWITCH
        Direction facing = Direction.NORTH;
        switch (facing) {
            case NORTH -> System.out.println("Up");
            default -> System.out.println("Not up");
        }

        // ERROR HANDLING
        System.out.println("10 / 2 = " + divide(10, 2));

        // THREADS
        Thread t = new Thread(() -> System.out.println("Thread!"));
        t.start();
        t.join();

        // GENERICS
        Printer.printItem("Rust is better");
        Printer.printItem(42);

        // TRAITS / INTERFACES
        Person p = new Person();
        p.greet();
    }
}
