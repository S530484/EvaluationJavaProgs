package java_practise;

public class SuperClass {
	private int a=0;
	protected String prot_var="I am protected var";
	String def_var="I am default variable";
	public static String stat_str="Static string"; 
	
	public SuperClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getProt_var() {
		return prot_var;
	}

	public void setProt_var(String prot_var) {
		this.prot_var = prot_var;
	}

	public String getDef_var() {
		return def_var;
	}

	public void setDef_var(String def_var) {
		this.def_var = def_var;
	}

	public static String getStat_str() {
		return stat_str;
	}

	public static void setStat_str(String stat_str) {
		SuperClass.stat_str = stat_str;
	}
	
	public int var_value(int b)
	{
		return a*b;
	}
}
