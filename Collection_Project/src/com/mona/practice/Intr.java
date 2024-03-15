package com.mona.practice;

public interface Intr {

  String username="Sweety";
}
interface Intr1
{
  
}

class DB implements Intr,Intr1
{
	void use() {
		System.out.println(username);
		
}
class DB1 extends DB
{
	
}
class DB2 extends DB
{
	
}
}
