package com.mona.practice;

public class Sol1 {
  public static void main(String[] args) {
	 String s="Hello Java Programs";
//	String[] s1=s.split(" ");
//	for (int i =s1.length-1; i>=0; i--) {
//		StringBuffer str=new StringBuffer(s1[i]);
//		System.out.print(str.reverse()+" ");
//	}
//
//  }
	char ch[]=s.toCharArray();
	int left=0;
	int right=ch.length-1;
	while(left<right)
	{
		if(ch[left]!=32 && ch[right]!= 30)
		{
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		else if(ch[left]==32)
		{
	      left++;
		}
		else if(ch[right]==32)
		{
			right--;
		}
	
	}
	System.out.println(new String(ch));		
}
	
}

