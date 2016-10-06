package examples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read2 {
	static char[] chars;

	public static void main(String[] args) {
		String fileName = "/Users/michaelkunkel/CoursesIWantToAttend.txt";
		readFileIntoArray(fileName);
		String fileName2 = "/Users/michaelkunkel/CoursesIWantToAttend_Javaedit.txt";
		writeArrayToFile(fileName2);
	}

	static void readFileIntoArray(String fn) {
		File f = new File(fn);
		long length = f.length();
		FileReader fr = null;

		try {
			fr = new FileReader(f);
			int intLength = (int) length;
			chars = new char[intLength];
			fr.read(chars);
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	}

	static void writeArrayToFile(String fn) {
		File f = new File(fn);
		FileWriter fw = null;

		try {
			fw = new FileWriter(f);
			fw.write(chars);
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	}
}