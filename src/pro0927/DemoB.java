package pro0927;

import java.util.Scanner;

//if-else结构
//系统产生一个随机数，用户输入一个数，判断是否猜中

public class DemoB {
	public static void main(String[] args) {
		//产生一个随机数
		double n=Math.random();//[0,1)
		int num1=((int)(n*6+1));//0-6的随机数
		
		Scanner in=new Scanner(System.in);//输入一个数
		System.out.println("请输入一个数");
		int num2=in.nextInt();//接收这个数
		
			if(num1==num2){       //判断相等
				System.out.println("恭喜你，你输入的"+num2+"猜中了");
			}else{
				System.out.println("抱歉，随机数为"+num1+"    2b");
			}
		
	}
	
	

}
