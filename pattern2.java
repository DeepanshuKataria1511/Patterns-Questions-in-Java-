import java.util.*;
public class pattern2 {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        

        // Pattern - 2 
            
            // for size = 4 
            // 1 1 1
            // 2 2 2
            // 3 3 3
        
            System.out.print("Enter the size of pattern : ");
            int size=input.nextInt();
            int a=1;
            int i=1;
            while(i<=size)
            {
                int j=1;
                while(j<=size)
                {
                    System.out.print(a+" ");
                    j++;
                }
                i++;
                a++;
                System.out.println();
            }
            input.close();
    }
    
}
