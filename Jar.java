import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = 10; 
        int K = 5;  
        int M = 10; 
    
        if (sc.hasNextInt()) {
            int order = sc.nextInt();

            if (order <= 0 || order > M) {
                System.out.println("INVALID INPUT");
                System.out.println("Number of Candies available: " + M);
            } else {
                M = M - order;
                System.out.println("Number of Candies Sold: " + order);
                if (M <= K) {
                    M = N;
                }
                
            }
        }
        
        sc.close(); 
    }
}
