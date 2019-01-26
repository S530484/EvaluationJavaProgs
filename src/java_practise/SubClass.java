package java_practise;

public class SubClass extends SuperClass {

	public int var_value(int b)
	{
		if (b>0)
			return 1000;
		else
			return 0;
	}
	
	public String get_prot()
	{
		return prot_var;
	}
	
	public String get_def()
	{
		return def_var;
	}
	
	// You can use the default variable inside the same package
}
