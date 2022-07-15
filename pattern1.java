// Pattern - 1

//    For n = 4
//     * * * *
//     * * * *
//     * * * *
//     * * * *


import java.util.*;

public class pattern1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int i=0;
        while(i<n)
        {
            int j=0;
            while(j<n)
            {
                System.out.print("*" + " ");
                j++;
            }
            i++;
            System.out.println();
        }




        input.close();
    }
}