import java.util.*;
public class Dowhile_learn {
    public static void main ( String [] args){
        int data;
        int sum=0;

        Scanner input = new Scanner(System.in);  //syntax of input java

        do{
            System.out.print("Enter Integer : ");
            data = input.nextInt();

            sum+=data;


        }while (data!=0);
        System.out.println("The Sum is "+sum);





    }





}
