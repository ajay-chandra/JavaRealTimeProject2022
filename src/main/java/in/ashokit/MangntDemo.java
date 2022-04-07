package in.ashokit;

public class MangntDemo {

	public static void main(String[] args) {
	 
		String encodeName=PasswordUitl.passwordeEncoded("Ajay");
		System.out.println("Endocoded name "+encodeName);
		String decodeName=PasswordUitl.passworddecoded(encodeName);
		System.out.println("Decoded Name "+decodeName);
	}

}
