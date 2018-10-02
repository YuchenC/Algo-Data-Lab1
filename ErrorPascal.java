/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_lab1;

/**
 *
 * @author yuchen
 */
abstract class ErrorPascal implements Pascal
{
    public void printPascalIllegalArgument (int n)
    {
        if (n <= 0)
            throw new IllegalArgumentException ("number of levels must be larger than 0");
    }
    
    public void binomIllegalArgument (int n, int k)
    {
        if (n < k)
            throw new IllegalArgumentException("a must be larger or equal to b");
    }    
}

