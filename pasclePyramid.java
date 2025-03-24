public class pasclePyramid {
    public static void main(String[] args) {
        int raws=6;
        
        for(int i=1;i<=raws;i++){
            int coef=1;
            for(int j=1;j<=(raws-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                if(k==0||i==0){
                    coef=1;
                }
                else{
                    System.out.print(coef + " ");
                    coef=coef*(i-k+1)/k;
                    
                }
                
            }
            System.out.println();
        }
    }
}
