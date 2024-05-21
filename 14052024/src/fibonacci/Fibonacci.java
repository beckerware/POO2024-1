package fibonacci;

public class Fibonacci {
    
    public static int fib(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O valor de n deve ser maior que 0");
        }
        
        if (n == 1) {
            return 0;  
        } else if (n == 2) {
            return 1;  
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; 
        System.out.println("O " + n + "-ésimo número de Fibonacci é: " + fib(n));
    }
}
