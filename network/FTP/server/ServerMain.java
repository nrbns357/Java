package kr.hs.dgsw.network.test01.n2212.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain extends Thread{


    public static void main(String[] args) {
//        String cidpw = "admin1234";
        String id = "admin";
        String pw = "1234";
        String filefolder = "D:/networkTest01";
        OutputStream os = null;
        DataOutputStream dos = null;

        InputStream is = null;
        DataInputStream dis = null;

        boolean isLogin = false;

        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket sk = ss.accept();

            os = sk.getOutputStream();
            dos = new DataOutputStream(os);

            is = sk.getInputStream();
            dis = new DataInputStream(is);
            while (true) {

                dos.writeBoolean(isLogin);

                String clmi = dis.readUTF();
                String clmp = dis.readUTF();
//                System.out.println(clm);

                if (clmi.equals(id) &&clmp.equals(pw) ) {
                    dos.writeUTF("** FTP 서버에 접속하였습니다. **");
                    isLogin = true;
                    dos.writeBoolean(isLogin);
                    break;

                } else {
                    dos.writeUTF("** ID 또는 PASS가 틀렸습니다.! **");
                }
            }
            while (true){
                String filename = dis.readUTF();
                System.out.println(filename);
                FileOutputStream fos = new FileOutputStream(filefolder+"/"+ filename);
                int readsize = 0;
                byte[] bytes = new byte[1024];

                while ((readsize = dis.read(bytes)) != -1) {
                    fos.write(bytes, 0, readsize);
                }
            }
        } catch (Exception e) {

        }


    }
}
