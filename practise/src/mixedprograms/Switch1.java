package mixedprograms;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Monday";
		switch (day) {
// from java 12 we can use -> instead of : and break
		case "Monday","Tuesday","Wednesday","Thursday"->
			System.out.println("8am");
			
//		case "Tuesday":
//			System.out.println("8am");
//			break;
//		case "Wednesday":
//			System.out.println("8am");
//			break;
//		case "Thursday":
//			System.out.println("8am");
//			break;
		case "Friday"->
			System.out.println("7am");
			
		case "Saturday","Sunday"->
			System.out.println("6am");
		
//		case "Sunday":
//			System.out.println("6am");
//			break;
		default->
			System.out.println("select the valid day");
		}
	}

}
