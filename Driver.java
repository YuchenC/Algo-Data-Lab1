
package algorithm_lab1;

public class Driver 
{
    public static void main (String[] args)
    {
        RecursivePascal RecursivePascal = new RecursivePascal();
        IterativePascal IterativePascal = new IterativePascal();
        java.util.Scanner in = new java.util.Scanner (System.in);
        System.out.println("True or false (true for printing triangles, false for testing binom) : ");
        boolean test = in.nextBoolean();
        
        if (test)
        {
            System.out.println("\nInteger: " );
            int n = in.nextInt();
           
            System.out.println("\nPrintPascla in Recursive implementation");
            RecursivePascal.printPascal(n);
            //System.out.println("\nPrintPascal in Iterative implementation");
            //IterativePascal.printPascal(n);
        }
        else
        {
            System.out.println("\nGive two integers a and b, a >= b: ");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("\nbinom in Recursive implementation");
            System.out.println(RecursivePascal.binom(a, b));
            System.out.println("\nbinom in Iterative implementation");
            System.out.println(IterativePascal.binom(a, b));
        }   
    }  
}
