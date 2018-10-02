
package algorithm_lab1;

public class IterativePascal extends ErrorPascal implements Pascal 
{ 

    boolean reverse;
    public void reverse()
    {
        if (reverse == true)
            this.reverse = true;
        else
            this.reverse = false;
    }
    
    public int binom (int n, int k)
    {
        binomIllegalArgument(n, k);
        
        int a = 1;
        int b = 1;
        int c = 1;
        if (n == 0)
            a = 1;
        else
            for (int i = 1; i <= n; i++)
                a = a * i;
        if (k == 0)
            b = 1;
        else
            for (int i = 1; i <= k; i++)
                b = b * i;
        if (n == k)
            c = 1;
        else
            for (int i = 1; i <= (n - k); i++)
                c = c * i;
        //System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        return a / (b * c);  
    }
    
    public void printPascal (int n)
    {
        printPascalIllegalArgument(n);
        
        if (!reverse)
        {
            if (n == 0)
            {
                int triangle0 = 1;
                System.out.println(triangle0);
            }
            else
            {
                for (int i = 0; i < n; i++)
                {
                    for (int j = 0; j < i + 1; j++)
                    {
                        int[] triangle = new int [j + 1];
                        triangle[j] = binom(i, j);
                        System.out.print(triangle[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        else
        {
            for (int i = n - 1; i >= 0; i--)
            {
                
                for (int j = 0; j <= i; j++)
                {
                    int[] triangle = new int [j + 1];
                    triangle[j] = binom(i, j);
                    System.out.print(triangle[j] + " ");
                }
                System.out.println();
                    
            }  
        }
    }    
}
