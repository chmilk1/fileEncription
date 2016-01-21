package file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEncryptor {
	/*
	 * -----------HOW THIS ENCRIPTION WORKS-----------
	 *  All "Real" letters are preceded by a + Random letters will be
	 * added to the mix to confuse humans
	 */

	// Objects \\

	public static File openSecretFile() {
		return new File("files/codes");
	}

	public static String encrypt(String encryptMe) {
		// TODO Auto-generated method stub
		return null;
	}

	public static File saveFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String decrypt(String decryptMe) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void saveStuffInAFile(String string, File file) {
		// TODO Auto-generated method stub

	}

	public static String readFileContents(File secretFile) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String readOneLine(File file2) throws FileNotFoundException, IOException {
		String ln1 = null;
			ln1 = new BufferedReader(new FileReader(new File("files/codes"))).readLine();
		return ln1;
	}

}
