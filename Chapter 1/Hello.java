// ********************************************
// Hello.java
//
// Print a Hello, World message.
// ********************************************
public class Hello
{
// -----------------------------------
// main method -- prints the greeting
// -----------------------------------
    public static void main (String[] args)
    {
        System.out.println ("Hello, World!");
    }
} 

/*2.Hello.java:6: error: class Helo is public, should be declared in a file named Helo.java
public class Helo
       ^
3. Hello, World! becomes Helo, World!
4. Hello.java:13: error: unclosed string literal
        System.out.println ("Hello, World!);
                            ^
Hello.java:13: error: ';' expected
        System.out.println ("Hello, World!);
                                            ^
Hello.java:15: error: reached end of file while parsing
} 
 ^
5.Hello.java:13: error: ')' expected
        System.out.println (Hello, World!");
                                        ^
Hello.java:13: error: unclosed string literal
        System.out.println (Hello, World!");
                                         ^
Hello.java:13: error: ';' expected
        System.out.println (Hello, World!");
                                            ^
Hello.java:15: error: reached end of file while parsing
} 
 ^
6.Hello.java:13: error: ';' expected
        System.out.println ("Hello, World!")
                                            ^
*/