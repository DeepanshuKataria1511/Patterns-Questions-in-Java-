public class pattern9 {
    public static void main(String[] args) {
        
        // Pattern - 9
        // 1
        // 2 3
        // 3 4 5
        // 4 5 6 7
        // for size=4


        int a =1;
        int size=4;
        int row =1;
        while(row<=size)
        {
            int col = 0;
            while(col<row)
            {
                System.out.print(row+col+" ");
                col++;

            }
            row++;
            System.out.println();
        }
    } 
}
