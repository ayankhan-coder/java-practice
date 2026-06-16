package basics;

public class Tasks {
    static int fib(int n){      // P5------ fibonacci series
        if (n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {


        String name = "mohommad zameeruddin";
        int countA = 0;
        int countB = 0;
        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if (ch=='o'){
                countA++;
            } else if (ch=='e') {
                countB++;
            }
        }
        System.out.println("a:"+ countA);
        System.out.println("e "+ countB);

        /*problem 4 the num is  divisible by 3 or not*/
//        int []num = {3,6,7,9,10,11,12};
//        for (int element :num){
//            if (element %3 == 0){
//                System.out.println(element +"  is divisible");
//            }else {
//                System.out.println(element +"  is not divisible");
//            }
//        }



        /*problem 3 even & odd*/
//       int []num = {1,3,67,4,25,6,7,9,8,20};
//       for (int element :num){
//           if (element%2 ==0){
//               System.out.println(element +"  is even");
//           }else {
//               System.out.println(element +"  is odd");
//           }
//       }


        /*Problem 2 fibonacci series*/
         System.out.println(fib(10));

        //*problem 1 separating zero and numbers
//        int []num ={4,0,7,0,0,9};
//        System.out.println("the numbers : ");
//        for (int element:num){
//            if (element != 0){
//                System.out.println(element);
//            }
//        }
//        System.out.println("the zero : ");
//        for (int element:num){
//            if (element ==0){
//                System.out.println(element);
//            }
//        }

    }
}
