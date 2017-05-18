/*
given an integer return if it's biary equivalent is a palindrom

input : 9
expected output : true 
(binary equivalent of 9 : 1001
input : 8
expected output : false
(binary equivalent of 8 : 1000
*/


public class binary {
	
	public static void palindrom(int num)
	{
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);
		//StringBuilder rev_bin = new StringBuilder(bin).reverse();
		//if (bin.equals(rev_bin.toString()))
		//{
			//System.out.println(bin + " is a palindrom");
		//}
		//else
		//{
			//System.out.println(bin + " is not a palindrom");
		//}
		
		int i = 0;
		int j = bin.length()-1;
		int cnt = 1;
		while(j>i)
		{
			System.out.println(bin.charAt(i));
			System.out.println(bin.charAt(j));
			if (bin.charAt(i) != bin.charAt(j))
			{
				cnt =0 ;
			}
		
			j--;
			i++;
		}
		if (cnt == 1)
		{
			System.out.println(bin + " is a palindrom");
		}
		else
		{
			System.out.println(bin + " is not a palindrom");
		}
		
		
	}
	
	
	public static void main(String[] args) 
	{
		
		int num = 8;
		palindrom(num);
	}

}

