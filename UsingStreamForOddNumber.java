import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class UsingStreamForOddNumber
{
	public static void main(String args[])
	{
		List<Integer> listNum = new ArrayList<Integer>();
		listNum.add(11);
		listNum.add(331);
		listNum.add(1334);
		listNum.add(12);
		listNum.add(332);
		listNum.add(46);
		listNum.add(7);
		listNum.add(90);
		listNum.add(999);
		listNum.add(58);
		listNum.add(4);
		
		List<Integer> listOdd = listNum.stream().filter(I->I%2!=0).collect(Collectors.toList());
		System.out.println(listOdd);
	}
}