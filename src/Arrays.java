
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        int[] a = new int[5]; // array of 5 elements
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt(); // take input for each element
        }
        System.out.println("Array elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

//         String[] b =new String[3];
//        System.out.print("chal 3 num dall");
//        for (int i=0; i<b.length; i++){
//            b[i]=sc.nextLine();
//        }
//        System.out.println("the array is");
//        for (int j =0; j<b.length; j++){
//            System.out.println(b[j]);
//        }

        // PRACTICE SET ARRAYS
        // 1
        float[] num = {10f, 20.50f, 30f, 40f};
//        for (float element: num){
//            sum = sum + element;
//
//        }
//        System.out.println(sum);\
//        int i= 0;
//        while (i<100){
//            System.out.println("hello");
//            i++;
//        }
//


//        int [] marks = new int[5];
//        marks [0] = 100;
//        marks [1] = 200;
//        marks [2] = 300;
//        System.out.println(marks[0]);
//
//

//        int flats [][] = new int[2][3];
//        flats [0][0] = 101;
//        flats[0] [1] = 102;
//        flats[0] [2] = 102;
//        flats [1] [0] = 201;
//        flats [1] [1] = 202;
//        flats [1] [2] = 203;
////
//        for (int i=0; i< flats.length;i++){
//            for (int j=0; j<flats[i].length;j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }
//        System.out.println("\nHELLO DOSTO\n");
//
//        for (int i=0; i< flats.length; i++){
//            for (int j=0; j<flats[i].length; j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }

//        float [] a = {10.23f,20.2f,30.92f,40f,50.40f};
//        float summ = 0;
//        for (int i=0; i<a.length; i++){
//            summ = summ + a[i];
//        }
//        System.out.println(summ);


//        float [] a = {10.23f,20.2f,30.92f,40f,50.40f};
//        float summ = 0;
//        for (float element: a){
//            summ = summ + element;
//
//        }
//        System.out.println(summ);\


//        String [][] mobile$dress = {
//                {"oppo","samsung","vivo"},
//                {"tshirt","pants","bra"},
//        };
//        for (int i=0;i<mobile$dress.length;i++){
//            for (int j=0; j<mobile$dress[i].length; j++){
//                System.out.print(mobile$dress[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//
        /*while (true){

        String[] mobile = {"1: OPPO", "2: VIVO", "3: APPLE", "4: SAMSUNG"};
        while (true) {
            System.out.print("SEARCH ANYTHING : ");
            String search = sc.nextLine();
            if (search.equals("mobile")) {
                for (int i = 0; i < mobile.length; i++) {
                    System.out.println(mobile[i]);

                }
                break;
            } else {
                System.out.println("ITEM IS NOT AVAILABLE...");
            }
        }


        System.out.print("ENTER MOBILE NAME FOR SHOPPING : ");
        String mobilename = sc.nextLine();
        switch (mobilename) {
            case "oppo":
                System.out.println("6 GB ram\n128 gb storage\n15000 rs");
                System.out.print("ENTER \'o\' TO CONFIRM : ");
                String enterb = sc.nextLine();

                switch (enterb) {
                    case "o":
                        System.out.println("\t~~~ ORDER SUCCESSFUL ~~~");
                        break;
                }
        }

    }*/

        // arrays practice set~~~~~~~~~~~~~~~~
        // 1
//        float [] nu ={ 10.12f,20.43f};
//        float sum = 0;
//        for (float element:nu){
//            sum = sum + element;

//        }
//        System.out.println(sum);

        //2
//        int [] a = {10,29,30,46};
//        int numm = 100;
//        boolean isinarray = false;
//        for (int element:a){
//            if (numm == element){
//                isinarray = true;
//                break;
//
//            }
//        }
//        if (isinarray){
//            System.out.println("THE VALUE IS PRESENT IN THE ARRAY ");
//        }else {
//            System.out.println("THE VALUE IS NOT PRESENT IN THE ARRAY");
//        }

        //2 by own

//        float[] marks = {59.34f, 45.36f, 89.0f, 45.69f, 80.2f};
//        float numm = 80.2f;
//        boolean found = false;
//
//        for (float element : marks) {
//            if (numm == element) {
//                found = true;
//                break;
//            }
//        }
//
//        if (found) {
//            System.out.println("Element is present in array");
//        } else {
//            System.out.println("Element is not present in array");
//        }

        //3
//        float [] marks = {10.4f,29.43f,30.0f,46.54f};
//        float sum = 0;
//        for (float element: marks){
//            sum = sum + element;
//        }
//        System.out.println("THE AVG OF MARKS IS : "+ sum/ marks.length);
//

        //4
//        int [][] mat1 = {
//                {1,1,1},
//                {1,1,1},
//        };
//        int [][] mat2 = {
//                {1,1,1},
//                {1,1,1},
//        };
//        int [][] result = {
//                {0,0,0},
//                {0,0,0},
//        };
//        for (int i=0;i< mat1.length; i++){
//            for (int j=0;j<mat1[i].length;j++){
//                result [i][j]= mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println("");
//        }

        //6
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        int [] arr  = {10,20,30,50,1};
//        int min = Integer.MAX_VALUE;
//        for (int element : arr){
//            if (min>element){
//                min = element;
//            }
//        }
//        System.out.println("the minimum element is : "+min);

        //
//        int []arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int n = Math.floorDiv(arr.length, 2);
//        int temp;
//        for (int i=0; i<n; i++){
//            temp = arr[i];        // element 1 is stored in temp box
//            arr[i] = arr[l-i-1];  // index 0 is filled with 6
//            arr[l-i-1] = temp;    //arr[5] = temp
//
//        }for (int element :arr){
//            System.out.print(element);
//        }
//
//        String []arr = {"khan","ahmed","ayan"};
//        int l = arr.length;
//        int n = Math.floorDiv(arr.length,2);
//        String temp;
//        for (int i=0; i<n; i++){
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//             arr[l-i-1] = temp;
//        }for (String element: arr){
//            System.out.print(element + " ");
//        }

//        int []arr = {1,2,3,4,5,6};
//        boolean issorted = true;
//        for (int i=0; i<arr.length-1; i++){
//            if (arr[i] > arr[i + 1]){
//                issorted = false;
//                break;
//            }
//        }if (issorted){
//            System.out.println("sorted");
//        }else {
//            System.out.println("not sorted");
//        }

























































    }
}

























