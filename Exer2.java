
public class Exer2 {

    public static void main(String[] args) {
        System.out.println("Começo\n");
        System.out.println("fatorial\n");
        System.out.println("Fatorial de 0: " + fatorial(0) + "\n");
        System.out.println("Fatorial de 1: " + fatorial(1) + "\n");
        System.out.println("Fatorial de 2: " + fatorial(2) + "\n");
        System.out.println("Fatorial de 3: " + fatorial(3) + "\n");
        System.out.println("Fatorial de 4: " + fatorial(4) + "\n");
        System.out.println("Fatorial de 5: " + fatorial(5) + "\n");
        System.out.println("\n");
        System.out.println("somToZero\n");
        System.out.println("SomToZero de 0: " + somToZero(0) + "\n");
        System.out.println("SomToZero de 1: " + somToZero(1) + "\n");
        System.out.println("SomToZero de 2: " + somToZero(2) + "\n");
        System.out.println("SomToZero de 3: " + somToZero(3) + "\n");
        System.out.println("SomToZero de 4: " + somToZero(4) + "\n");
        System.out.println("SomToZero de 5: " + somToZero(5) + "\n");
        System.out.println("\n");
        System.out.println("fibonacci\n");
        System.out.println("Fibonacci de -1: " + fibonacci(-1) + "\n");
        System.out.println("Fibonacci de 1: " + fibonacci(1) + "\n");
        System.out.println("Fibonacci de 2: " + fibonacci(2) + "\n");
        System.out.println("Fibonacci de 3: " + fibonacci(3) + "\n");
        System.out.println("Fibonacci de 4: " + fibonacci(4) + "\n");
        System.out.println("Fibonacci de 5: " + fibonacci(5) + "\n");
        System.out.println("\n");
        System.out.println("somBtw\n");
        System.out.println("somBtw de 0 há 0: " + somBtw(0, 0) + "\n");
        System.out.println("somBtw de 1 há 7: " + somBtw(1, 7) + "\n");
        System.out.println("somBtw de 1 há 3: " + somBtw(1, 3) + "\n");
        System.out.println("somBtw de 5 há 7: " + somBtw(5, 7) + "\n");
    }

    public static int fatorial(int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return -1;
        } else {
            return fatorial(n - 1) * n;
        }
    }

    public static  int somToZero (int n){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        else{
            return n + somToZero(n-1);
        }
    }

    public static int fibonacci ( int n){
        if (n==0 || n==1){
            return 1;
        }
        if(n< 0){
            return -1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int somBtw (int i,int j){
        if (i==j){
            return 0;
        }
        
        else if ( i< j){
            return (i + somBtw( i+1 , j)) ;
        }
        else{

            return somBtw(j, i);
        }
        
    }

    private static int someBtw2 (int i,int j){
        
    }
}
