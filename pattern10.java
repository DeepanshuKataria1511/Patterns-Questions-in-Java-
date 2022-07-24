public class pattern10 {
    public static void main(String[] args) {
        // Pattern - 10
        // 1
        // 2 1
        // 3 2 1
        // 4 3 2 1
        // for size =4


        int row=0;
        int size = 4;
        int a =1;
        while(row<size)
        {
            int col =0;
            while(col<=row)
            {
                System.out.print(a+" ");
                col++;
                a--;
            }
            row++;
            a =row+1;
            System.out.println();
        }
    }
}
