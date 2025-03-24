public class rightPyramidnum {
    public static void main(String[] args) {

        //for 1 22 333
        int rows = 4; // Number of rows
        
        /*for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("  "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //fot 1-15
        int num=1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("  "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
