package pro1031;

public class DemoA {
	public void a(){
		DemoA da=new DemoA();
		//ͨ�����Ե�set������ֵ
		da.setName("����");
		da.setAge(19);
		da.setSex("��");
		System.out.println(da.getAge());
		System.out.println(da.getName());
		System.out.println(da.getSex());
	}
	public static void main(String[] args) {
		new DemoA.a();
	}

}
