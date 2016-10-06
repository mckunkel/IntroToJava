package ch15.labs;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class TestOrder {
	public static void main(String[] args) {

		Order order = new Order(27, "Charlie");

		// text
		try (FileWriter fw = new FileWriter("test.txt"); PrintWriter pw = new PrintWriter(fw);) {

			pw.println(order.getId());
			pw.printf(order.getName());

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		// Binary
		try (FileOutputStream fout = new FileOutputStream("order.dat");
				DataOutputStream dout = new DataOutputStream(fout);) {

			dout.writeInt(order.getId());
			dout.writeUTF(order.getName());

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		try (FileOutputStream fout = new FileOutputStream("order.ser");
				ObjectOutputStream out = new ObjectOutputStream(fout);) {

			out.writeObject(order);
			out.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}
}
