package in.ashokit;

public class MangntDemo {

	public static void main(String[] args) {
	    int k=0;
		String encodeName=PasswordUitl.passwordeEncoded("Ajay");
		System.out.println("Endocoded name "+encodeName);
		String decodeName=PasswordUitl.passworddecoded(encodeName);
		System.out.println("Decoded Name "+decodeName);
	}

}
