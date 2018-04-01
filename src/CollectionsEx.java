
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 
public class CollectionsEx {
   public static void main(String[] args) {
      List lst = new ArrayList();  
      lst.add("abhishek");            
      lst.add("balu");
      lst.add("chinmay");
      System.out.println(lst);     
 
      
      Iterator iter = lst.iterator();
      while (iter.hasNext()) {     
         String str = (String)iter.next();
         System.out.println(str);
      }
   }
}