public class invertedLeftPyramid {
    public static void main(String[] args) {
        int raws=5;
        char alp='A';
        for(int i=raws;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(alp+" ");
                
            }
            alp++;
            System.out.println();
        }
    }
}
