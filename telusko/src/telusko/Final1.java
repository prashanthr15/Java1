package telusko;

// final class Alpha{
////  final class cant be inherited
//
//    public void disp(){
//        System.out.println("alpha");
//    }
// }
// class Beta extends Alpha{
//    // The type Beta cannot subclass the final class Alpha
// }

 class Alpha{
//  final method will be inherited
//	 
	 public final float pi=3.14f;
	 

    final void disp(){
//    	The final field Alpha.pi cannot be assigned
//    	pi = 2.4f;
    	//final cant b changed
        System.out.println("alpha");
    }
 }
 class Beta extends Alpha{
    // The type Beta cannot subclass the final class Alpha
//	 public void disp(){
//	//cant over ride
//	        System.out.println("beta" + pi );
//	    }
 
 }
 
 
public class Final1 {
    
    public static void main(String[] args) {

        Beta b = new Beta();
        b.disp();
    }
}
