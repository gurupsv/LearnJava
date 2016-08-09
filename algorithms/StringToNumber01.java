package algorithms;

public class StringToNumber01 {
	
	static String mystring="1ki29948koosp09.93";
	
	public static void main(String args[]){
		String newstring=mystring.replaceAll("[^0-9.]", "");
		System.out.println(newstring);
		System.out.println(Double.valueOf(newstring));
	}


}
