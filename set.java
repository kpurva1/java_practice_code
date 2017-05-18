/*
given input matrix of persons and their favorite items, output minimum number of ietms to be ordered such that 
each person will get atleast one favorite item

n = number of persons
k = number of items

input : n = 6, k=7
matrix
1000100
1000010
1000001
0100100
0010010
0001001

expected output : 3 (items 5,6,7)

*/

import java.util.*;
public class set {

	public static void set_op(int[][] m,int n,int k)
	{
		HashMap<Integer,String> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				if(m[i][j] == 1)
				{
					if(map.containsKey(j))
					{
						String mn = map.get(j);
						mn = mn + String.valueOf(i);
						map.put(j, mn);
					}
					else
						map.put(j, String.valueOf(i));
				}
			}
		}
		
		List<String> nl_list = new ArrayList<>();
		String nl="";
		String kl = "";
		for(int p=0;p<k;p++)
		{
			kl ="";
			nl ="";
			for(int i=p;i<k;i++)
			{
				kl = kl + String.valueOf(i);
				String mn = map.get(i);
				for(int j=0;j<mn.length();j++)
				{
					if(nl.contains(String.valueOf(mn.charAt(j))) == false)
					{
						nl = nl + String.valueOf(mn.charAt(j));
						
					}
				}
				if(nl.length() == n)
				{
					nl_list.add(kl);
					System.out.println(kl);
					break;
				}
			}
		}
		int min = k+1;
		String kn ="";
		for(int i=0;i<nl_list.size();i++)
		{
			if(min > nl_list.get(i).length())
			{
				min = nl_list.get(i).length();
				kn = nl_list.get(i);
			}
		}
		System.out.println(min + "," + kn);
		System.out.println(map);
	}
	
	public static void main(String[] args)
	{
		int n = 3;
		int k=4;
		
		//int[][] m ={{1,0,0,0,1,0,0},{1,0,0,0,0,1,0},{1,0,0,0,0,0,1},{0,1,0,0,1,0,0},{0,0,1,0,0,1,0},{0,0,0,1,0,0,1}};
		int[][] m = {{1,0,0,1},{0,1,1,0},{0,0,1,1}};
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
				System.out.println(m[i][j]+" ");
		}*/
		
		set_op(m,n,k);
	}
}
