package projectj;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> map=new HashMap<>();
//Map<String,String> map=new Hashtable<>();		
map.put("Name1","Vimal");
map.put("Name2","Vicky");
map.put("Name3","Thulasi");
map.put("Name2","Prakash");
Set<String>keys=map.keySet();
for(String key:keys)
{
//System.out.println(map.get(""));
	System.out.println(key+"  "+map.get(key));
}
	}

}
