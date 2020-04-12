package ex20io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class E03FilterDataStream {

	public static void main(String[] args) {

		String src = "src/ex20io/FilterdataStream.txt";
		
		try {
			OutputStream outStream = new FileOutputStream(src);
			DataOutputStream dataOutputStream =
					new DataOutputStream(outStream);
			
			dataOutputStream.writeInt(123);
			dataOutputStream.writeInt(123456);
			dataOutputStream.writeDouble(12.12);
			dataOutputStream.writeDouble(23.45);
			dataOutputStream.writeUTF(src);
			
			DataInputStream inStream = 
					new DataInputStream(new FileInputStream(src));
			
			int num1 = inStream.readInt();
			int num2 = inStream.readInt();
			double dNum1 = inStream.readDouble();
			double dNum2 = inStream.readDouble();
			String s = inStream.readUTF(inStream);

			System.out.println(inStream.toString());
			
			
			/*
			while(true) {
				inStream.toString();
			}
			*/
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(dNum1);
			System.out.println(dNum2);
			System.out.println(s);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


























