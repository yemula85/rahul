package methods;

public class Programclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Nonreturntype object=new Nonreturntype();
		//  without parameters
		object.add();
		
		//with parameters
		object.add(5, 4);
		//with parameters
		object.sub(50, 25);
		
		Returntype modi=new Returntype();
		//without parameters
		 int m= modi.add();
		System.out.println(m);
		
		//with parameters
		int t= modi.add(10, 30);
		System.out.println(t);
		
		   int o= modi.sub(10, 5);
		   System.out.println(o);
		
		int z= modi.add1();
		System.out.println(z);
		
		    int a=modi.multi(20, 5);
		   System.out.println(a);
	
	}

}
