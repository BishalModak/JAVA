package Generics;

public class main {
    public static void main(String[] args) {
        genericsMethod demo = new genericsMethod();
        demo.<String> genericsMethod("Java");
        demo.<Integer> genericsMethod(60); 
    }
}
