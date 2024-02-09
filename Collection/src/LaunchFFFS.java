import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFFFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//			list.add(44);
//		}
		
//		Iterator itr=list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
		//concurrentmodificationexception should not add while iterator
		//for will excetute but iterator gives exception
		//to fetch the data in collection use iterator not for loop
		//is also called as fail fast 
//			list.add(44);
//			
//			
//		}
		System.out.println("Fail safe");
		CopyOnWriteArrayList list3=new CopyOnWriteArrayList();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		
		Iterator itr=list3.iterator();
		while(itr.hasNext())
		{
			list3.add(44);
			System.out.println(itr.next());	
//		it will	fail safe
			//it will not allow concurrent modification with out any exception and executes the prog
			//for that we have to use the sub pkg of util and CopyOnWriteArrayList
//			list3.add(44);
		}
		//System.out.println(list3);
		
		
		

	}

}
