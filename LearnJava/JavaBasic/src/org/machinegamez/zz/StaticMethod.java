package org.machinegamez.zz;

/*
 * 静态方法是一种不能向对象实施操作的方法。
 * 例如，Math 类的 pow() 方法就是一个静态方法，语法为 Math.pow(x, a)，
 * 用来计算 x 的 a 次幂，在使用时无需创建任何 Math 对象。
 * 
 * 因为静态方法不能操作对象，所以不能在静态方法中访问实例变量，只能访问自身类的静态变量。
 * 
 * 以下情形可以使用静态方法：
 * 一个方法不需要访问对象状态，其所需参数都是通过显式参数提供（例如 Math.pow()）。
 * 一个方法只需要访问类的静态变量。
 * 
 * 读者肯定注意到，main() 也是一个静态方法，不对任何对象进行操作。
 * 实际上，在程序启动时还没有任何对象，main() 方法是程序的入口，将被执行并创建程序所需的对象。
 * 
 * 关于静态变量和静态方法的总结：
 * 一个类的静态方法只能访问静态变量；
 * 一个类的静态方法不能够直接调用非静态方法；
 * 如访问控制权限允许，静态变量和静态方法也可以通过对象来访问，但是不被推荐；
 * 静态方法中不存在当前对象，因而不能使用 this，当然也不能使用 super；
 * 静态方法不能被非静态方法覆盖；
 * 构造方法不允许声明为 static 的；
 * 局部变量不能使用static修饰。
 */
public class StaticMethod {
	static int sum(int x, int y){
		return x + y;
	}
	public static void main(String[] args){
		int sum = StaticMethod.sum(10, 20);
		System.out.println("10 + 20 = " + sum);
	}
}
