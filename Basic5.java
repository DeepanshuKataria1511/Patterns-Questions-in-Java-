import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //   Pattern 1
//        ****
//        ****
//        ****
//        ****

        // Using while loop
        int i=1;
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        while (i<=n)
        {
            int j=1;
            while (j<=n)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }


//          Pattern 2
//            1 1 1
//            2 2 2
//            3 3 3

        // Using While loop

        int m=sc.nextInt();
        int q =1 ;
        while (q<=m)
        {
            int j =1;
            while (j<=m)
            {
                System.out.print(q + " " );
                j++;
            }
            q++;
            System.out.println();
        }


//         Pattern 3
//            1 2 3 4
//            1 2 3 4
//            1 2 3 4
//            1 2 3 4


        // Using while loop
        System.out.print("Enter a Number :");
        int o = sc.nextInt();
        int b =1 ;
        while (b<=o)
        {
            int j =1;
            int a=1;
            while (j<=o)
            {
                System.out.print(a+ " ");
                a++;
                j++;
            }
            System.out.println();
            b++;
        }

//        Pattern 4
//            3 2 1
//            3 2 1
//            3 2 1

//         Using While Loop
        System.out.print("Enter a number : ");
        int p = sc.nextInt();
        int d=1;
        while (d<=p)
        {
            int j = 1;
            int a =3;
            while (j<=n)
            {
                System.out.print(a + " ");
                j++;
                a--;
            }
            d++;
            System.out.println();
        }


//        Pattern 5
//            1 2 3
//            4 5 6
//            7 8 9
//

        // Using While Loop
        System.out.print("Enter a Number: ");
        int z = sc.nextInt();
        int y=1;
        int a =1;
        while (y<=z)
        {
            int j = 1;
            while (j<=z)
            {
                System.out.print(a + " ");
                j++;
                a++;
            }
            y++;
            System.out.println();
        }





    }
}
