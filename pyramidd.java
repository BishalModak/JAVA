public class pyramidd {
    public static void main(String[] args) {
    int raws=5;
    for(int i=1;i<=raws;i++){
        for(int j=1;j<=(raws-i);j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}