import java.util.Scanner;
class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int i, min;
       int [] marks = new int [5];
       System.out.println("Enter the 5 elements:");
       for (i = 0; i < 5; i++){
        marks [i]= sc.nextInt();
       }
       min = marks[0];
       for ( i = 0; i < 5; i++){
          if(marks[i] < min){
              min = marks[i];
          } 
       }
       System.out.println( " The smallest element is:" + min);
    }
}