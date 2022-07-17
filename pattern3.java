import java.util.Scanner;

public class pattern3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //      Pattern-3 
        //      for size = 4 
        //      1 2 3 4 
        //      1 2 3 4 
        //      1 2 3 4 
        //      1 2 3 4 

        System.out.print("Enter the size of the pattern: ");
        int size=input.nextInt();

        int row=1;
        while(row<=size)
        {
            int a=1;
            int col=1;
            while(col<=size)
            {
                System.out.print(a + " ");
                col++;
                a++;
            }
            row++;
            System.out.println();
        }
        input.close();
    }
}