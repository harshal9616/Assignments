package com.yash.tddassignment;

public class Que4 {

	public static boolean armstrongno(int n)
    {
        int rem=0,sum=0;
        int original=n;

        while(n>0)
        {
            rem=n%10;
            sum=(rem*rem*rem)+sum;
            n=n/10;

        }

    if(sum==original)
    {
      return true;    
    }
    else
    {
        return false;
    }
    }
}
