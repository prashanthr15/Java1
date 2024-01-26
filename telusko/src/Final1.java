
 final class Alpha{
//  final class cant be inherited

    public void disp(){
        System.out.println("alpha");
    }
 }
 class Beta extends Alpha{
    // The type Beta cannot subclass the final class Alpha
 }
public class Final1 {
    
    public static void main(String[] args) {

        Beta b = new Beta();
    }
}
