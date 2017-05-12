public class Zad2 {

	public static void main(String[] args) {
		
		try{
			System.out.println(args[0].substring(Integer.parseInt(args[1]),Integer.parseInt(args[2])+1));
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bound " + e);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Wrong args " + e);
		}catch(NumberFormatException e){
			System.out.println("Wrong sequence! " + e);
		}
	
	}
}