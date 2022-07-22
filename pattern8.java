public class pattern8 {
    public static void main(String[] args) {
        
        
        // Pattern - 8
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // For size=4


        int row =0;
        int element =1;
        int size = 4;

        while(row<size)
        {
            int col =0;
            while(col<=row)
            {
                System.out.print(element+" ");
                element++;
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
