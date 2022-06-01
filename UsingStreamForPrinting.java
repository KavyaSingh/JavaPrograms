//Given a list of integers, find out all the numbers starting with 1 using Stream functions

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamForPrinting
{
	public static void main(String args[])
	{
		List<Integer> listNum = new ArrayList<Integer>();
		listNum.add(12);
		listNum.add(412);
		listNum.add(18888);
		listNum.add(43);
		listNum.add(123);
		listNum.add(456);
		listNum.add(543);
		listNum.add(2344);

		//Collect in a list
		List<Integer> listOdd = listNum.stream().filter(I->(I.toString()).charAt(0)=='1').collect(Collectors.toList());
		System.out.println(listOdd);
		//Print directly
		listNum.stream().filter(I->(I.toString()).charAt(0)=='1').forEach(System.out::println);
		//Use map function as well
		listNum.stream().map(num->num.toString()).filter(num->num.startsWith("1")).forEach(System.out::println);


	}
}