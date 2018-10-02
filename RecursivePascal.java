package algorithm_lab1;

public class RecursivePascal extends ErrorPascal implements Pascal 
{
    boolean reverse;
   
    public void reverse()
    {
        if (reverse == true)
            this.reverse = true;
        else
            this.reverse = false;
    }
    
    /* 
    Method binom calculates binomial coefficient, 
    which is a prepation step for printing Pascal's triangle
    @param n 
    @param k
    @return result of the calculation
    */
    public int binom (int n, int k)
    {
        binomIllegalArgument(n, k);
        int result;
        if (k == 0 | n == k)
            return result = 1;
        else if (n > k)
            return result = binom(n - 1, k - 1) + binom (n - 1, k);
        else
        	return -1;
    }
    
    /*
    Method printPascal prints out given levels of Pascal's triangle.
    @param n n levels of Pascal's triangle to be printed, given by user.
    @param upORdown direction of the print-out of Pascal's triangle, 
                    true for incrementing, false for decrementing
    */
    public void printPascal (int n)
    {
        printPascalIllegalArgument(n);
        
        if (!reverse)
        {
            n--;
            if (n > 0)
                printPascal(n);
            int[] triangle = new int [(n + 1) / 2];
            for (int i = 0; i < triangle.length; i++)
            {
                triangle[i] = binom(n, i);
                System.out.print(triangle[i] + " ");   
            }
            if ((n - 1) % 2 != 0)
                System.out.print(binom(n, (n/2) ) + " ");
            for (int i = 0; i < triangle.length; i++)
                System.out.print(triangle[triangle.length -1 - i] + " ");
            System.out.println();         
        }
        
        else
        {
            if (n == 1)      
                System.out.println(1);
		
            else
            {
                int[] triangle = new int [n / 2];
                for (int i = 0; i < triangle.length; i++)
                {
                    triangle[i] = binom(n - 1, i);
                    System.out.print(triangle[i] + " ");
                }
                if (n % 2 != 0)
                    System.out.print(binom(n - 1, (n/2) ) + " ");
                for (int i = 0; i < triangle.length; i++)
                    System.out.print(triangle[triangle.length -1 - i] + " ");
                System.out.println();
                printPascal(n - 1);    
            }    
        }
    }

    
}

           
	
	
	
	


