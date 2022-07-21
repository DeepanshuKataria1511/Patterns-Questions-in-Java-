public class pattern7 {
    public static void main(String[] args) {
        

         
        // Pattern 7  for size = 4
        //  1
        //  2 2
        //  3 3 3
        //  4 4 4 4

        int size = 4;
        int row=0;
        int a = 1;
        while(row < size)
        {
            int col = 0;
            while(col<=row)
            {
                System.out.print(a+" ");
                col++;
            }
            a++;
            row++;
            System.out.println();
        }
    }
}
