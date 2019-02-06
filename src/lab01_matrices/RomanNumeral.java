package lab01_matrices;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import javafx.util.converter.NumberStringConverter;

import static java.lang.System.*;

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private Integer number;

	private String roman;

	private final static int[] NUMBERS = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		String rom = "";
		number = num;
		for(int ind = 0;ind<NUMBERS.length;ind++)
		{
			if (num>=NUMBERS[ind])
			{
				rom += LETTERS[ind];
				num = num-NUMBERS[ind];
				ind--;
			}
		}
		roman = rom;
	}

	public void setRoman(String rom)
	{
		int val = 0;
		roman = rom;
		int offset = 0;
		for (int ind = 0; ind<LETTERS.length;ind++)
		{
			if(rom.length()>offset && rom.startsWith(LETTERS[ind],offset))
			{
				val += NUMBERS[ind];
				offset +=LETTERS[ind].length();
				ind--;
			}
		}
		number = val;
	}



	public Integer getNumber()
	{
		return number;
	}

	public int compareTo(RomanNumeral r)
	{
		if(r.getNumber()>number)
			return 4;
		if (r.getNumber()<number)
			return -4;
		return 0;
	}

	public String toString()
	{
		return roman;
	}
}