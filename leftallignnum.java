public class leftallignnum {
    public static void main(String[] args) {
        //for 1 22 333 print 
        int rows=5;
        /*for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        
        //for 1-15 print
        int num=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
