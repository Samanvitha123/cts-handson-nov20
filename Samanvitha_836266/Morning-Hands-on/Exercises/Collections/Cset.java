package collections;

import java.util.HashSet;
import java.util.Set;

public class Cset {

	public static void main(String[] args) {
		Set<Setuser> set=new HashSet<Setuser>();
		set.add(new Setuser(100,"Samu","samu112"));
		set.add(new Setuser(100,"Samu","samu112"));
		set.add(new Setuser(100,"Man","samu112"));
		set.add(new Setuser(100,"Manu","samu112"));
		set.add(new Setuser(100,"Manu","samu112"));

		System.out.println("size of set is "+set.size());
	}

}
