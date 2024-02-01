
public class String3 {
/*
 * when stored in heap area 
 * when there is new keyword or reference or built in methods ex.concat()
 */
	public static void main (String args[]) {
		
		String s1= "Java";
		
		String s2= "Ja";
		String s3= "va";
		//two literals concat so memory will be in string constant pool
		//refernce s5= obj ja +obj va
		String s5 = "Ja"+"va";
		//two reference concat so memeory will be in heap 
		//s4 refernece =s2 reference = reference s3
		String s4= s2+s3;
		//checks reference are same
		System.out.println(s1==s4);//false
		//checks only data is same
		System.out.println(s1.equals(s4));//true
		System.out.println(s1==s5);//true
	}
}
