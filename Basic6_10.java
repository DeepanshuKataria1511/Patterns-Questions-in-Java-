import java.util.*;
public class Basic6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


 //      Pattern 6
//        for n=4
//        *
//        **
//        ***
//        ****

//        Using while loop

        System.out.print("Enter the Number ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n)
        {
            int j=1;
            while (j<=i)
            {
                System.out.print("*" + " ");
                j++;
            }
            System.out.println();
            i++;
        }


//        Pattern 7
//        fro m = 4
//            1
//            2 3
//            4 5 6
//            7 8 9 10

//       Using for loop

        System.out.print("Enter the number ");
        int a =1;
        int m = sc.nextInt();
        for (int b=1;b<=m;b++)
        {
            for (int j = 1;j<=b;j++)
            {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }



//        Pattern 8
//            1
//            2 2
//            3 3 3
//            4 4 4 4

        // Using while loop

        System.out.print("Enter the Number ");
        int o = sc.nextInt();
        int c=1;
        int y =1;
        while (y<=o)
        {
            int j=1;
            while (j<=y)
            {
                System.out.print(c+" ");
                j++;
            }
            c++;
            y++;
            System.out.println();
        }




//        Pattern 9
//            1
//            2 3
//            3 4 5
//            4 5 6 7

        // Using While loop

        System.out.print("Enter the Number ");

        int p = sc.nextInt();
        int q =1 ;
        int r;
        while (q<=p)
        {
            int j =1 ;
            r=q;
            while (j<=q)
            {
                System.out.print(r + " ");
                j++;
                r++;
            }
//             Alternative is instead of r use i+j-1
            q++;
            System.out.println();
        }




        // Pattern 10
//        1
//        2 1
//        3 2 1
//        4 3 2 1

//        Using while loop

        System.out.print("Enter the number :");
        int g = sc.nextInt();
        int h = 1;
        int k;
        while (h<=g)
        {
            int j =1 ;
            k=h;
            while (j<=h)
            {
                System.out.print(k+ " ");
                k--;
                j++;
            }
            System.out.println();
            h++;
        }
    }
}
