package java_practise;

import defualt_demo.SecondSubClass;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sp=new SuperClass();
		SubClass sub=new SubClass();
		SecondSubClass scnd = new SecondSubClass();
		
		System.out.println(sp.var_value(1));
		System.out.println("Run time polymorphism"+sub.var_value(1)); // Overriding ==> runtime polymorphism
		/*Runtime polymorphism: Changing the definition of the subclass method from the super class it has same signature but different
		 * definition*/
		System.out.println(sub.get_prot()+"\n"+sub.get_def());
		System.out.println(scnd.get_protect());
		System.out.println(scnd.modify_static());// we can change the value of static
		System.out.println(SubClass.getStat_str()); //static variables or methods can be called using the class name directly instead of the 
													// reference
		
		
	}

}
