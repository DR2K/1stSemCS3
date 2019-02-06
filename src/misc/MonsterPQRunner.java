package misc;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -
import java.util.*;
public class MonsterPQRunner
{
	public static void main ( String[] args )
	{
	MonsterPQ a=new MonsterPQ();
	Scanner in=new Scanner(System.in);
for(int i=0;i<3;i++){
	System.out.println("Enter heigth: ");
	int ht=in.nextInt();
	System.out.println("Enter weight: ");
	int wt=in.nextInt();
	System.out.println("Enter age: ");
	int age=in.nextInt();
	Monster b=new Monster(ht,wt,age);	
	a.add(b);
	}
	System.out.println("toString: "+ a+ " min: "+a.getMin()+" natural: "+a.getNaturalOrder());
	in.close();
	}
}