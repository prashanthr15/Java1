import java.util.ArrayList;

public class LaunchAccesing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList list=new ArrayList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(54);
		
		//System.out.println(list);
		
		/*
		 * list.get(0); list.get(1); list.get(2);
		 */
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("****************");
		
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("****************");
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}

	}

}
