public class exceptionHandleing{
    public static void main(String[] args) {
        try{
            int c=10;
            int d=0;
            int r=c/d;
            System.out.println("Solution is: "+r);
        }
        catch(ArithmeticException e){
                e.printStackTrace();
        }
        finally{
            System.out.println("ehhe mile nai na");
        }
    }
}