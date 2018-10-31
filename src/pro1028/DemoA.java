package pro1031;
/*
 * 封装
 */

public class DemoA {
	//一、私有化  private
	//除了当前类，其他无法访问
	
	private String name;
	
	//二、提供公开的方法访问私有属性
	//设置值的方法： setXxx
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	
}
