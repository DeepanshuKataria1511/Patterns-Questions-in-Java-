public class pattern12 {
    public static void main(String[] args) {
        // Pattern - 12
        // A B C D
        // A B C D
        // A B C D
        //for Size=4

        int size = 4;
        int row = 0;
        
        while(row<size)
        {
            char ch = 'A';
            int col=0;
            while(col<size)
            {
                System.out.print(ch + " ");
                ch++;
                col++;
            }
            row++;
            System.out.println();
        }
    }
    
}
