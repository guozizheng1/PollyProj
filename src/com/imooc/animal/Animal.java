package com.imooc.animal;

public class Animal {
	//属性：昵称、年龄
	private String name;
	private int month;
	
	public Animal(){
		
	}
	
	public Animal(String name, int month){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	
	//方法：吃东西
	public void eat(){
		System.out.println("动物都有吃东西的能力");
	}
	//如果父类当中含有static修饰的方法，则该方法是无法被子类重写的，只能被继承
	public static void say() {
		System.out.println("动物间是需要打招呼的");
	}
	

}
