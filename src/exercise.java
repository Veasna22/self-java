import java.util.*;
public class exercise
{
    Scanner in = new Scanner(System.in);
    //declare variable
    int i,j,len,temp=0;
    int num[];

    public void getdata()
    {
        //get Size of an array from user
        System.out.print("Enter Size of an array : ");
        len=in.nextInt();
        num = new int[len];
        System.out.print("Enter the number : ");
        for ( i = 0 ; i<len;i++)
        {
            num[i]=in.nextInt();
        }

    }
    public void disp_array()
    {
        //print array which input by user
        System.out.print("Original order of an array: ");

        for(i = 0; i < len; i++)
        {
            System.out.print(" "+num[i]);
        }
    }
    public void asce()
    {
        // loop for sorting array in ascending order
        for(i = 0; i < len; i++)
        {
            for(j = i+1; j < len; j++)
            {
                if(num[i]>num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        //print ascending order
        System.out.print("nArray in Ascending order : ");
        for(i=0;i<len;i++)
        {
            System.out.print(" "+num[i]);
        }
    }
    public void desc()
    {
        // loop for sorting array in descending order
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(num[i]<num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        // print descending order
        System.out.print("nArray in Descending order : ");
        for(i=0;i<len;i++)
        {
            System.out.print(" "+num[i]);
        }
    }
    public static void main(String args[])
    {
        exercise sort= new exercise();
        sort.getdata();
        sort.disp_array();
        sort.asce();
        sort.desc();
    }
}




