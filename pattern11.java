public class pattern11 {
    public static void main(String[] args) {
        
        // Pattern 11
        // A A A A
        // B B B B 
        // C C C C
        // D D D D
        // FOR size =4


        int size = 4;
        int row = 0;
        char ch = 'A';

        while(row<size)
        {
            int col =0;
            while(col<size)
            {
                System.out.print(ch + " ");
                col++;
            }
            ch++;
            row++;
            System.out.println();
        }
    
    }
    
}
