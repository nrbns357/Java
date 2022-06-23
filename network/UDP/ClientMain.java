package kr.hs.dgsw.network.class22.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class ClientMain {
	public static void main(String[] args) throws IOException {
		InetAddress inetaddr = InetAddress.getByName("255.255.255.255");

		DatagramSocket ds = new DatagramSocket();
		for (int i = 1; i <= 100000; i++) {
			String j = "바보";
			DatagramPacket sendPacket = new DatagramPacket(j.getBytes(), j.getBytes().length, inetaddr, 9999);
			ds.send(sendPacket);
		}
		System.out.println("전송 끝");
	}
}
