public class pyramid{
    public static void main(String[] args) {
        int raws=5;
        int num=2;
        /*for(int i=1;i<=raws;i++){
            for(int j=1;j<=(raws-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //for showing 1 22 333 in pyramid
         for(int i=1;i<=raws;i++){
            for(int j=1;j<=(raws-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
                num++;
            }
            System.out.println();
        }
        
        //for showing odd number
        /*for (int i = 1; i <= raws; i++) {
            // Inner loop to print spaces for alignment
            for (int j = 1; j <= raws - i; j++) {
                System.out.print(" ");
            }
            // Inner loop to print odd numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2; // Increment oddNum by 2 to get the next odd number
            }
            System.out.println();
        } */
    //for showing even number
    /*for (int i = 1; i <= raws; i++) {
        // Inner loop to print spaces for alignment
        for (int j = 1; j <= raws - i; j++) {
            System.out.print(" ");
        }
        // Inner loop to print odd numbers
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num += 2; // Increment oddNum by 2 to get the next odd number
        }
        System.out.println();
    }*/
}
}