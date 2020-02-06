package com.cts.training.lib;

public class Pattern {
	
	public void pattern1(int rows) {
		int r=rows;
		
        for(int i=0 ; i<r ; i++)
        {
            byte k=1;
            for(int j=0 ; j<(r+i); j++)
            {
               if(j<r-i-1)
                    System.out.print(" ");
                else
                {
                    System.out.print(""+k);
                    if(j<(r-1))
                        k++;
                    else
                        k--;
                }
            }
            System.out.println(" ");
        }
	}
	
	public void pattern2(int rows) {
		int r = rows;
		for(int i=1;i<=r;i++)
	     {
	         for(int j=i;j<=r;j++)
	         {
	             System.out.print(" ");
	         }
	         for(int k=1;k<=i;k++)
	         {
	             System.out.print(i+" ");
	         }
	         System.out.println();
	     } 
	}

}
