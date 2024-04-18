import java.util.*;

public class slip4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hashtable<String, String> ht=new Hashtable<String,String>();
       ht.put("pune", "1111");
       ht.put("Mumbai","2222");
       ht.put("Gujrat","3322");
       
       ht.remove("Mumbai");
       
       if(ht.containsKey("pune")) {
    	   System.out.println("City Found STD Code id="+ht.get("pune"));
       }
       
	}

}
