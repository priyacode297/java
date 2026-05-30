import java.util.Scanner;
class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int i, max;
       int [] marks = new int [5];
       //take input from user and store
       System.out.println("Enter the number of elements:");
       for (i = 0; i < 5; i++){
        marks [i]= sc.nextInt();
       }
       max = marks[0];
       for ( i = 0; i < 5; i++){
          if(marks[i] > max){
              max = marks[i];
          } 
       }
       System.out.println( " The largest element is:" + max);
    }
}