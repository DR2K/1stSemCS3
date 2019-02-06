package Interfaces;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import static java.lang.System.*;

public class Person implements Comparable<Person>
{
  private int myYear;
  private int myMonth;
  private int myDay;
  private String myName;

  public Person( int y, int m, int d, String n)
  {
  	myYear = y;
  	myMonth = m;
  	myDay = d;
  	myName = n;
  }

  public int compareTo( Person other )
  {
  	if(myYear-other.myYear!=0)
  		return myYear-other.myYear;
  	else if(myMonth-other.myMonth!=0)
  		return myMonth-other.myMonth;
  	else if(myDay-other.myDay!=0)
  		return myDay-other.myDay;
  	return 0;
  }

  public String toString( )
  {
     return myName;
  }
}