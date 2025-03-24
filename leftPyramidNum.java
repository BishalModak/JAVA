public class leftPyramidNum {
    public static void main(String[] args) {
        int raws=5;
        int num=1;
        for(int i=1;i<=raws;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
