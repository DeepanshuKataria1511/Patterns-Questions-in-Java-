import java.util.*;

public class Basic10_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




//        Pattern 11
//             A A A
//             B B B
//             C C C

        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int i =1 ;
        char ch = 'A';
        while (i <=n)
        {
            int j = 1;
            while (j<=n)
            {
                System.out.print(ch +  " ");
                j++;
            }
            ch++;
            System.out.println();
            i++;
        }



//        Pattern 12
//             A B C
//             A B C
//             A B C
        System.out.print("Enter the number :");
        int m = sc.nextInt();
        int l =1 ;
        while (l <=m)
        {
            int j = 1;
            char ch1 = 'A';
            while (j<=m)
            {
                System.out.print(ch1 +  " ");
                j++;
                ch1++;
            }

            System.out.println();
            l++;
        }




//        Pattern 13
//          A B c
//          D E F
//          G H I

        System.out.print("Enter the number :");
        int o = sc.nextInt();
        int i1 =1 ;
        char ch2 = 'A';
        while (i1 <=o)
        {
            int j = 1;
            while (j<=o)
            {
                System.out.print(ch2 +  " ");
                j++;
                ch2++;
            }
            System.out.println();
            i1++;
        }



//    Patttern 14
//            A B C
//            B C D
//            C D E


        System.out.print("Enter the number :");
        int n1 = sc.nextInt();
        int i2 =1 ;
        char ch3 = 'A';
        while (i2 <=n1)
        {
            int j = 1;
            int x = ch3 + i2 +j -2;
            char  y = (char)x;
            while (j<=n)
            {

                System.out.print(y+" ");
                j++;
                y++;
            }

            System.out.println();
            i2++;
        }



//
//        Pattern 15
//        A
//        B B
//        C C C

        System.out.print("Enter the number :");
        int n3 = sc.nextInt();
        int i3 = 1;
        char ch4='A';
        while(i3<=n3)
        {
            int j = 1;
            while (j<=i3)
            {
                System.out.print(ch4+" ");
                j++;
            }
            ch4++;
            i3++;
            System.out.println();
        }




    }
}
