package abstractpackage;

public class Progclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jntu19A object =new Jntu19A();
		object.add();
		object.sub();
		Jntu20B ram =new Jntu20B();
		ram.add();
		ram.sub();
		
		
		// abstractclass implimetion
		JntuA ravi=new Jntu19A();
		ravi.add();
		ravi.sub();
		ravi.multi();
		JntuA tea=new Jntu20B();
		tea.add();
		tea.multi();
		tea.sub();
		
		

	}

}
