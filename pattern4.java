public class pattern4 {
    public static void main(String[] args) {
        
    //    Pattern 4 :  For Size=5
    //    5 4 3 2 1
    //    5 4 3 2 1
    //    5 4 3 2 1
    //    5 4 3 2 1
    //    5 4 3 2 1

    int row=1;
    int size=5;

    while(row<=size)
    {
        int num=5;
        int col=1;
        while(col<=size)
        {
            System.out.print(num+" ");
            col++;
            num--;
        }
        row++;
        System.out.println();
    }
    }
    
}
