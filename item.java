/* find associated items
input : [[item1,item2],[item2,item3],[item2,item4],[item5,item6]]
expected output : item1,item2,item3,item4
*/




import java.util.*;

public class item {
	
	public static void association()
	{
		String ass="";
		
		String[][] items = {{"item1","item2"},{"item2","item3"},{"item4","item5"},{"item5","item6"},{"item6","item7"}};
		
		//System.out.println(items[0][1]);
		int i,j = 0;
		Integer val0,val1 = 0;
		HashMap<String,Integer> item_map = new HashMap<String,Integer>();
		for(i=0;i<items.length;i++)
		{
			if (i==0)
			{
				ass = ass + items[i][0] + "," + items[i][1];
				
			}
			else if (ass.contains(items[i][0])) 
			{
				ass = ass + "," + items[i][1];
			}
			else if (ass.contains(items[i][1]))
			{
				ass = ass + "," + items[i][0];
			}
			
			
			
		}
		
		for(i=0;i<items.length;i++)
		{

				val0 = item_map.get(items[i][0]);
				val1 = item_map.get(items[i][1]);
				if (val0 != null || val1 != null)
				{
					//val = val+1;
					item_map.put(items[i][0],1 );
					item_map.put(items[i][1],1 );
					
				}
				else
				{
					item_map.put(items[i][0], 0);
					item_map.put(items[i][1], 0);
				}
			
		}
		
		
		
		
		System.out.println(ass);
		System.out.println(item_map);
		
		Iterator it = item_map.entrySet().iterator();
		String ass1="";
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			if (pair.getValue().toString().equals("1"))
			{
				ass1 = ass1 + " " + pair.getKey() ;
			}
		}
		
		System.out.println(ass1);
		
		
		List<String> item_list = new ArrayList<>();
		item_list.add(items[0][0] + "," +items[0][1] );
		int flag = 0;
		for(i=1;i<items.length;i++)
		{
			flag =0;
			for(j=0;j<item_list.size();j++)
			{
				if((item_list.get(j).contains(items[i][0]) || item_list.get(j).contains(items[i][1])))
				{
					if (item_list.get(j).contains(items[i][0])) //&& flag == 0)
						//
					{
						item_list.set(j, (item_list.get(j) + "," + items[i][1]));
						
					}
					else //if (flag == 0)
					{
						item_list.set(j, (item_list.get(j) + "," + items[i][0]));
					}
				}
				else
				{
					item_list.add(items[i][0] );//+ "," +items[i][1] );
					//flag = 1;
					
				}
			}
		}
		System.out.println(item_list);
		int l = item_list.get(0).length();
		String ass3 = item_list.get(0);
		
		for (i=1;i<item_list.size();i++)
		{
			if (l < item_list.get(i).length())
			{
				l = item_list.get(i).length();
				ass3 = item_list.get(i);
			}
		}
		System.out.println(ass3);
	}
	
	public static void main(String[] args) 
	{
		association();
	}

}
