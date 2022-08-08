
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		String [] alphabet = {"A", "B","C", "D", "E", "F", "G", "H"};
		System.out.println(alphabet[0]);
		System.out.println(alphabet[1]);
		System.out.println(alphabet[2]);
		System.out.println(alphabet[3]);
		System.out.println(alphabet[4]);
		System.out.println(alphabet[5]);
		System.out.println(alphabet[6]);
		System.out.println(alphabet[7]);
		//The output from Index 8 will be out of bound and will lead to ArrayIndexOutOfBoundsException
		System.out.println(alphabet[8]);

	}

}
