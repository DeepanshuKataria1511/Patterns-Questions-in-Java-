public class pattern5 {
    public static void main(String[] args) {


        // Pattern - 5  for size = 3
        // 1 2 3
        // 4 5 6 
        // 7  8 9
    
        int size=3;
        int num=1;
        int row =0;
        while(row < size)
        {
            int col=0;
            while(col< size)
            {
                System.out.print(num+ " ");
                num++;
                col++;
            }
            row++;
            System.out.println();
        }

    }

}
