import java.util.HashMap;

//Given a String, find the first non-repeated character in it using Stream functions
public class UsingStreamToFindFirstNonRepetativeCharacter {

    public static void main(String args[])
    {
        String stringOb = "This is a stream example";
        HashMap<Character,Integer> mapCount = new HashMap<Character,Integer>();

        //Form map
        for(int i=0;i<stringOb.length();i++)
        {
            Character charval = stringOb.charAt(i);
            if(mapCount.containsKey(charval))
                mapCount.put(charval,mapCount.get(charval)+1);
            else
                mapCount.put(charval,1);
        }
        System.out.println(mapCount);
        System.out.println(mapCount.entrySet().stream().filter(ch -> ch.getValue()==1).findFirst().get().getKey());

    }

}
