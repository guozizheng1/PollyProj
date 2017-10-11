package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;//快捷键ctrl+shift+O


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal one = new Animal();//1
		
		/*1、向上转型、隐式转型、自动转型
		 *2、父类引用指向子类实例,可以调用子类重写父类的方法以及父类派生的方法，无法调用子类独有的方法
		 *3、小类转型为大类
		 *4、注意：父类中的静态方法无法被子类重写，所以向上转型之后，只能调用到父类的静态方法
		 * */
		Animal two = new Cat();//2
//		Cat cat = new Cat();
//		two = cat;
//		two.eat();
		two.say();
		Cat cat = (Cat)two;
		cat.say();
		
		
		Animal three = new Dog();//3
		
		//one.eat();
		two.eat();
		two.setMonth(2);
		two.getMonth();
		three.eat();
		System.out.println("=========================");
		/*向下转型、强制类型转换
		 * 子类的引用指向父类对象，必须进行强制转换，可以调用子类特有的方法
		 * 必须满足转型条件才能进行强转
		 * instanceof运算符：返回true/false
		 */
		if (two instanceof Cat){
			Cat temp = (Cat)two;
			temp.eat();
			temp.run();
			temp.getMonth();
			System.out.println("two可以转换为Cat类型");
		}
		
		if(two instanceof Dog){
			Dog temp2 = (Dog)two;
			temp2.eat();
			temp2.getSex();
			System.out.println("two可以转换为Dog类型");
		}
		 //Exception in thread "main" java.lang.ClassCastException: com.imooc.animal.Cat cannot be cast to com.imooc.animal.Dog
		if(two instanceof Animal){
			System.out.println("Animal");
		}
		
		if(two instanceof Object){
			System.out.println("Object");
		}
	}

}
