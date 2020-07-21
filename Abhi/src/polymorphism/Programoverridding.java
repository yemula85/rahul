package polymorphism;

public class Programoverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jntu19ol object =new Jntu19ol();
		object.add();

		Jntu20ol rani=new Jntu20ol();
		
		rani.add();
		//overriding
		Jntu19ol tea=new Jntu20ol();
		tea.add();
		tea.add(5, 6);
		
	
		
		
		
	}

}
