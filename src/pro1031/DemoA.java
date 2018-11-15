package pro1031;

public class DemoA {
	public void a(){
		DemoA da=new DemoA();
		//通过属性的set方法赋值
		da.setName("张三");
		da.setAge(19);
		da.setSex("男");
		System.out.println(da.getAge());
		System.out.println(da.getName());
		System.out.println(da.getSex());
	}
	public static void main(String[] args) {
		new DemoA.a();
	}

}
