package lab01_matrices;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class Rational implements Comparable<Rational>
{

	private int myNumerator;

	private int myDenominator;

	public Rational()
	{
		myNumerator = myDenominator = 1;
	}

	public Rational(int numerator, int denominator)
	{
		setNumerator(numerator);
		setDenominator(denominator);
		reduce();
	}

	public void setNumerator(int numerator)
	{
		myNumerator = numerator;
	}

	public void setDenominator(int denominator)
	{
		myDenominator = denominator;
	}

	public void add( Rational  rhs)
	{
		myNumerator = myNumerator*rhs.getDenominator()+rhs.getNumerator()*myDenominator;
		myDenominator = myDenominator * rhs.getDenominator();
		reduce();
	}

	public void subtract(Rational rhs)
	{
		myNumerator = myNumerator*rhs.getDenominator()-rhs.getNumerator()*myDenominator;
		myDenominator = myDenominator * rhs.getDenominator();
		reduce();
	}

	public void multiply(Rational rhs)
	{
		myNumerator = myNumerator*rhs.getNumerator();
		myDenominator = myDenominator * rhs.getDenominator();
		reduce();
	}

	public void divide(Rational rhs)
	{
		myNumerator = myNumerator*rhs.getDenominator();
		myDenominator = myDenominator * rhs.getNumerator();
		reduce();
	}


	public Object clone()
	{
		Rational rat = new Rational(myNumerator,myDenominator);
		return (Object)rat;
	}


	public boolean equals( Object  o)
	{
		Rational rhs = (Rational)o;
		if (compareTo(rhs)==0)
			return true;
		return false;
	}

	public int compareTo( Rational rhs)
	{
		if(((double)rhs.getNumerator()/(double)rhs.getDenominator())> ((double)getNumerator()/getDenominator()))
			return 1;
		else if(((double)rhs.getNumerator()/rhs.getDenominator()) < ((double)getNumerator()/getDenominator()))
			return -1;
		else
			return 0;
	}

	public int getNumerator()
	{
		return myNumerator;
	}

	public int getDenominator()
	{
		return myDenominator;
	}

	public String toString()
	{
	   return getNumerator() + "/" + getDenominator();
	}

	private void reduce()
	{
		int g = gcd(myNumerator,myDenominator);

		myNumerator = myNumerator/g;
		myDenominator = myDenominator/g;
	}

	private int gcd(int one, int two)
	{
		if (two==0)
			return one;
		return gcd(two,one%two);
	}
}