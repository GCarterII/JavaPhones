
public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("s9", 100, "AT&T", "BBRRRRRING");
		IPhone x = new IPhone("X", 100, "Verizon", "Ding Dong");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		x.displayInfo();
		System.out.println(x.ring());
		System.out.println(x.unlock());

	}

}
