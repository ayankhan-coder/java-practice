package basics;

public class methods_ch_7 {
   static int logic(int x,int y){  //LOGIC 1---
        int z;
        if (x<y){
            z = x + y;
        }else {
            z = (x+y) * 5;
        }

        return z;
    }
    int ayan(int a, int b){  // LOGIC 2 ----
       return a + b;
    }
    static void joke(){   // LODIC 3---- if we don't want to return any data type we use void
        System.out.println("the joke is very funny");
    }
    static void change(int a){  // LOGIC 4---changing the int--and the value cant be changed
       a = 100;
    }
    static void change2(int [] arr){  // LOGIC 5---changing the value of array--it will change
       arr[0] = 100;
    }
    static void foo(){            // LOGIC 6--- method overloading means same variable work diff
        System.out.println("good morning bro");
    }
    static void foo(String a){
        System.out.println("good morning " + a+ " bro");
    }
    static void foo(String a,String b){
        System.out.println("good morning " +a + " bro");
        System.out.println("good morning "+b+" bro");
    }
    static int sum(int ...arr){   // LOGIC 7---VARARGS--it creates an array
        int result =0;
        for (int element:arr){
            result += element;
        }return result;
    }

    static int factorial(int n){  // LOGIC 8---RECURSION---repeating itself by calling
        if (n==0 || n==1){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }

      // PRACTICE SET~~~~~~~
    static void table(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + n*i); // P1--- multiplication table
            // System.out.printf("%d X %d = %d \n",n,i,n*i);
        }
    }

    static void pattern1(int n){      // P2---- star pattern 1
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int sumrec(int n){        // P3--- sum of n natural numbers using recursive
        if (n==1){
            return 1;
        }return n + sumrec(n-1);
    }

    static void pattern2(int n) {     // P4---star pattern 2
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int fib(int n){      // P5------ fibonacci series
        if (n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    static int  avg(int ...arr){    // P6----avg of numbers using ARGUMENTS
        int sum = 0;
        for (int element: arr){
            sum = sum + element;
        }
        return sum /arr.length;
    }

    static void recpattern(int n){  // P7---- pattern1 using recursion
        if (n>0){
            recpattern(n-1);
        }
        for (int i=1; i<=n; i++){
            System.out.print(" *");
        }
        System.out.println();
    }

    static int  sum(int  n){     // P10 -----sum of natural num using iterative
        int result = 0;
        for (int i=0; i<n; i++){
            result += i;
        }
        return result;
    }
//##############################################################################################################
    public static void main(String[] args){
       /* int a = 10;  // L1
        int b = 20;
        int c = logic(a,b);
        System.out.println(c);*/

        //SECOND METHOD BY CREATING OBJECT ---
        methods_ch_7 object = new methods_ch_7(); //L2
        int a = 20;
        int b = 1;
        int c = object.ayan(a,b);
        System.out.println(c);

        /*joke();*/ //L3

       /* int x = 10;//  L4
        change(x);
        System.out.println(x); */ // the value didn't change

        int [] marks = {10,19,19,60,20}; //L5
        change2(marks);
        System.out.println(marks[0]);// element of array changed

        /*foo();         // L6
        foo("ayan");              //all are diff
        foo("ayan","owais");*/

        System.out.println("the sum of two numbers: "+sum(1,2)); // L7 we can add multiple elements
        System.out.println("the sum of three numbers: "+sum(1,4,6));
        System.out.println("the sum of five numbers: "+sum(1,4,6,4,2));

       /* int A = 5;           // L8   RECURSION
        System.out.println("the factorial of 5 is : " + factorial(A));*/

        System.out.println("the multiplication table is :");//--- P1 multip table
        table(2);

        /*System.out.println("the pattern : "); // P2---- star pattern
        pattern1(4);*/

        System.out.println(sumrec(4));   // P3---sum of nat numbers

       /* System.out.println("the reverse pattern is : ");  //--- P4 pattern 2
        pattern2(4);*/

        int fibo = fib(7);    // P5-----fibonacci series
        System.out.println(fibo);

       /* int ab = avg(40,50,10,100,80,95);  // P6--- avg of num using arguments
        System.out.println(ab);*/


        System.out.println("pattern using recur"); // P7--- patter1 using recursion
        recpattern(4);

       /*l System.out.println(sum(4));*/      //P10--- sum of natural num with iterative

    }
}
