package kr.hs.dgsw.network.test01.n2212.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

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

            clientLogin();


            while (true) {
                String command = scanner.nextLine();
                String[] onlyCommand = command.split(" ");

                switch (onlyCommand[0].replace("\n","")) {
                    case ("/업로드"):
                        uploadCommand(command, onlyCommand[0]);
                        break;
                    case ("/다운로드"):
                        doDownload(command, onlyCommand[0]);
                        break;
                    case ("/파일목록"):
                        showFileList(onlyCommand[0]);
                        break;
                    case ("/exit"):
                        System.exit(0);
                        break;
                    default:
                        System.out.println("존재하지 않는 명령어 입니다");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void clientLogin() throws IOException {
        while (true) {
            String isLoginInfo = dis.readUTF();
            String[] isLoginInfoList = isLoginInfo.split(" ");
            if (isLoginInfoList[1].equals("false")) {
                System.out.printf("ID:");
                String id = scanner.nextLine();
                if(id.length() == 0) id = "?";
                System.out.printf("Pass:");
                String pw = scanner.nextLine();
                if(pw.length() == 0) pw = "?";
                dos.writeUTF("[Type]로그인: " + id + " " + pw);
                System.out.println(dis.readUTF());
            } else {
                break;
            }
        }
    }

    public static void uploadCommand(String command, String onlyCommand) throws IOException {
        dos.writeUTF("[Type]명령어구분: " + onlyCommand);
        String filepath = command.substring(5, command.lastIndexOf("/"));
        String filenameList = command.substring(command.lastIndexOf("/") + 1);
        String[] fileList = filenameList.split(" ");

        File fl = new File(filepath + "/" + fileList[0]);
        if (fl.exists()) {
            FileInputStream fis = new FileInputStream(fl);

            int readsize = 0;
            byte[] bytes = new byte[1024];
            if (fileList.length == 2) {
                dos.writeUTF("[Type]업로드: " + fileList[1]);
            } else {
                dos.writeUTF("[Type]업로드: " + fileList[0]);
            }
            String same = dis.readUTF();
            String[] sameInfo = same.split(" ");
            if (sameInfo[1].equals("true")) {
                System.out.print("파일이 이미 있습니다. 덮어쓰기 하실건가요??(Yes: 덮어쓰기 / No: 업로드 취소):");
                String isChange = scanner.nextLine();
                dos.writeUTF("[Type]파일교체여부: " + isChange);

                String cancel = dis.readUTF();
                String[] cancelInfo = cancel.split(" ");
                if (cancelInfo[1].equals("취소")) {
                    System.out.println("업로드가 취소되었습니다");
                }else{
                    while ((readsize = fis.read(bytes)) != -1) {
                        dos.write(bytes, 0, readsize);
                        if (readsize != 1024) {
                            break;
                        }
                    }
                    System.out.println("업로드가 완료되었습니다");
                }
            }else{
                while ((readsize = fis.read(bytes)) != -1) {
                    dos.write(bytes, 0, readsize);
                    if (readsize != 1024) {
                        break;
                    }
                }
                System.out.println("업로드가 완료되었습니다");
            }

        } else {
            System.out.println("파일이 존재하지 않습니다");
        }

    }

    public static void showFileList(String onlyCommand) throws IOException {
        dos.writeUTF("[Type]명령어구분: " + onlyCommand);
        String fileNum = dis.readUTF();
        String[] FileListReqInfo = fileNum.split(" ");
        for (int i = 0; i < Integer.parseInt(FileListReqInfo[1]); i++) {
            String FileList = dis.readUTF();
            String[] FileListInfo = FileList.split(" ");
            System.out.println(FileListInfo[1] + " " + FileListInfo[2]);
        }
    }

    public static void doDownload(String command, String onlyCommand) throws IOException {
        String Download = "D:/download/";
        String filename = command.substring(6);
        dos.writeUTF("[Type]명령어구분: " + onlyCommand);
        dos.writeUTF("[Type]다운로드: "+filename);
        String DownFileInfo = dis.readUTF();
        String[] DownFile = DownFileInfo.split(" ");

        FileOutputStream fos = new FileOutputStream(Download + DownFile[2]);

        if (DownFile[1].equals("true")) {
            int readsize = 0;
            byte[] bytes = new byte[1024];

            while ((readsize = dis.read(bytes)) != -1) {
                fos.write(bytes, 0, readsize);
                if (readsize != 1024) {
                    break;
                }

            }
            System.out.println("**" + DownFile[2] + "을 " + Download + "로 다운로드 하였습니다 **");
        } else {
            System.out.println(DownFile[2] + "파일이 존재하지 않습니다");
        }
    }
}