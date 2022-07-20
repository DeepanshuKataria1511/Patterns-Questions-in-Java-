public class pattern6 {
    public static void main(String[] args) {
    
        // Pattern 6 -  for size = 4
        // *
        // **
        // ***
        // ****

        int size = 4;
        int row = 0;
        while(row < size)
        {
            int col = 0;
            while (col<=row)
            {
                System.out.print("* ");
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
