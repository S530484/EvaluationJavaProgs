package defualt_demo;

import java_practise.SuperClass;

public class SecondSubClass extends SuperClass{
		public String get_protect()
		{
			return prot_var;
		}
		
//		public String get_def()
//		{
//			return def_var;
//		}
		
		// You cannot do the above bcz def_var is a default variable
		
		public String modify_static()
		{
			stat_str="Modified the static from second subclass";
			return stat_str;
		}
		
		
}
