package com.company;

class secondex
{
    public static int recurSum(int n)
    {
        if (n <= 1)
            return n;
        return n*n + recurSum ( n - 1);
    }

    public static void main(String args[])
    {
        int n = 3;
        System.out.println(recurSum(n));
    }
}