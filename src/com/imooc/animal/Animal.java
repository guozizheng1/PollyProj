package com.imooc.animal;

//抽象类：不允许被实例化，可以通过向上转型，指向子类实例
public abstract class Animal {
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
	//抽象方法不允许有方法体；子类中需要重写父类的抽象方法，否则子类也是抽象类
	//static final private是不能与abstract并存的
	public  abstract void eat();
	//如果父类当中含有static修饰的方法，则该方法是无法被子类重写的，只能被继承
	public static void say() {
		System.out.println("动物间是需要打招呼的");
	}
	

}
