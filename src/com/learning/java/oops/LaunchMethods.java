package com.learning.java.oops;

class Calc
{
    int n1, n2, res;
    //return type, name , parameter, body
//	void multiply()//parameters
//	{
//		n1=x;
//		n2=y;
//		res=n1*n2;
//		System.out.println("Result is "+ res);
//	}
//	int  multiply()//parameters
//	{
//		n1=x;
//		n2=y;
//		res=n1*n2;
//		return res;
//	}
//
//	void multiply(int x, int y)//parameters
//	{
//		n1=x;
//		n2=y;
//		res=n1*n2;
//		System.out.println("Result is "+ res);
//	}

    int multiply(int x, int y)//parameters
    {
        n1=x;
        n2=y;
        res=n1*n2;
        return res;
    }
}
public class LaunchMethods
{
    public static void main(String[] args)
    {
        Calc c=new Calc();
        int result=c.multiply(10, 5);//args
        System.out.println("Result is "+ result);

    }
}
