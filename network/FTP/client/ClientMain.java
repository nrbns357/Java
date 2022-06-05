package kr.hs.dgsw.network.test01.n2212.client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class ClientMain {

    private static Scanner scanner;
    private static Socket sk;

    static OutputStream os = null;
   static DataOutputStream dos = null;

   static InputStream is = null;
    static DataInputStream dis = null;

    public static void main(String[] args) {



        try {
            ClientMain cm = new ClientMain();
            scanner = new Scanner(System.in);
            sk = new Socket("localhost", 5000);
            System.out.println("** 서버에 접속하였습니다. **");

            os = sk.getOutputStream();
            dos = new DataOutputStream(os);

            is = sk.getInputStream();
            dis = new DataInputStream(is);

            Boolean isLogin;
            while (true) {
               isLogin = dis.readBoolean();
               if(!isLogin) {
                   System.out.printf("ID:");
                   String id = scanner.nextLine();
                   System.out.printf("Pass:");
                   String pw = scanner.nextLine();
//                   String idpw = id + pw;
                   dos.writeUTF(id);
                   dos.writeUTF(pw);
                   String slm = dis.readUTF();
                   System.out.println(slm);
               }
               else{
                  break;
               }
            }
            while (true){
                String command = scanner.nextLine();
                String Ccomand = command.substring(0,command.indexOf(" "));
//                       System.out.println(Ccomand);
                switch (Ccomand) {
                    case ("/업로드"):
                        uploadCommand(command);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void uploadCommand(String command) throws IOException {
//        System.out.println(command);
        String filepath = command.substring(5, command.lastIndexOf("/"));
        String filenameList = command.substring(command.lastIndexOf("/")+1);
        System.out.println("경로"+filepath);
        System.out.println("파일"+filenameList);
//        String fullfilePath = filepath+"/"+filenameList;
        File fl = new File(filepath+"/"+filenameList);
        FileInputStream fis = new FileInputStream(fl);

        int readsize = 0;
        byte[] bytes = new byte[1024];


        dos.writeUTF(fl.getName());

        while((readsize=fis.read(bytes))!=-1) {
            dos.write(bytes,0,readsize);
        }
    }
}