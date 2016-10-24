/* PreLab section 5.4
1.
    The print statement would be the next value of counter because ( counter + 1 ) would make it 1 higher than it should be.
2. a)
 final int LIMIT = 16; TRACE
 int count = 1;             sum nextVal count
 int sum = 0;               --- ------- -----
 int nextVal = 2;           0   2       1
 while (sum < LIMIT)        2   4       2
 {                          6   8       3
    sum = sum + nextVal;    14  10      4
    nextVal = nextVal + 2;  
    count = count + 1;
 }
 System.out.println("Had to add together " + (count-1) + " even numbers " +
 "to reach value " + LIMIT + ". Sum is " + sum);
    b)set count lower a number 
3.
    yes, int love = 0;
    while ( love < 100)
    {
        System.out.println( “I love computer science!!”);
        love ++;
    }
4.
    not count controlled.
    int sum = 0; //setup
    String keepGoing = "y";
    int nextVal;
    int counter = 0;
    while (keepGoing.equals("y") || keepGoing.equals("Y"))
    {
        System.out.print("Enter the next integer: "); //do work
        nextVal = scan.nextInt();
        sum = sum + nextVal;
        System.out.println("Type y or Y to keep going"); //update condition
        keepGoing = scan.next();
        counter ++;
    }
    System.out.println("The sum of your integers is " + sum);
    System.out.println("The amount of integers read is " + counter);
5.
    The code below is supposed to print the integers from 10 to 1 backwards. What is wrong with it? (Hint: there are two
    problems!) Correct the code so it does the right thing.
    count = 10;
    while (count > 0) //(count >= 0) makes it go to 0
    {
        System.out.println(count);
        count = count --; //count = count + 1; is and infinate loop.
    }