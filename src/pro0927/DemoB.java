package pro0927;

import java.util.Scanner;

//if-else�ṹ
//ϵͳ����һ����������û�����һ�������ж��Ƿ����

public class DemoB {
	public static void main(String[] args) {
		//����һ�������
		double n=Math.random();//[0,1)
		int num1=((int)(n*6+1));//0-6�������
		
		Scanner in=new Scanner(System.in);//����һ����
		System.out.println("������һ����");
		int num2=in.nextInt();//���������
		
			if(num1==num2){       //�ж����
				System.out.println("��ϲ�㣬�������"+num2+"������");
			}else{
				System.out.println("��Ǹ�������Ϊ"+num1+"    2b");
			}
		
	}
	
	

}
