package ks.hs.dgsw.network.class22.filecopy;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileCopyServer {
	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(5000);
		Socket sc = ss.accept();

		InputStream is = sc.getInputStream();
		BufferedInputStream bir = new BufferedInputStream(is);
		DataInputStream dis = new DataInputStream(bir);

		String filename = dis.readUTF();
		FileOutputStream fos = new FileOutputStream("D:\\" + filename);
		int readsize = 0;
		byte[] bytes = new byte[1024];

		while ((readsize = dis.read(bytes)) != -1) {
			fos.write(bytes, 0, readsize);
		}
	}
}
