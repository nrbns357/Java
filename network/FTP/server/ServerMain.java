package kr.hs.dgsw.network.test01.n2212.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class ServerMain extends Thread {

    static String id = "admin";
    static String pw = "1234";
    static String filefolder = "D:/networkTest01";
    private OutputStream os = null;
    private DataOutputStream dos = null;

    private InputStream is = null;
    private DataInputStream dis = null;
    static ServerSocket ss;
    private Socket sk;

    private int readsize = 0;
    private byte[] bytes = new byte[1024];

    private String isLogin = "false";

    public static void main(String[] args) {
        try {
            ss = new ServerSocket(5000);
            while(true) {
                new ServerMain(ss.accept());
            }
        } catch (Exception e) {
        }
    }

    public ServerMain(Socket socket) {
        this.sk = socket;
        this.start();
    }

    @Override
    public void run() {
        try {
            os = sk.getOutputStream();
            dos = new DataOutputStream(os);

            is = sk.getInputStream();
            dis = new DataInputStream(is);
            Login();

            while (true) {
                String uploadInfo = dis.readUTF();
                String[] uploadInfoList = uploadInfo.split(" ");
                String command = uploadInfoList[1];
                switch (command) {
                    case ("/업로드"):
                        upload();
                        break;

                    case ("/파일목록"):
                        doShowFileList();
                        break;

                    case ("/다운로드"):
//
                        doDownLoad();
                        break;
                }
            }
        } catch (Exception e) {
        } finally {
            System.out.println(sk.getInetAddress() + "님이 나갔습니다.");
        }
    }

    private void doDownLoad() throws IOException {
        String[] serverFileName = dis.readUTF().split(" ");

        File fl = new File(filefolder + "/" + serverFileName[1]);
        if (fl.exists()) {
            FileInputStream fis = new FileInputStream(fl);
            dos.writeUTF("[Type]다운로드파일정보: true " + fl.getName());
            readsize = 0;
            bytes = new byte[1024];

            while ((readsize = fis.read(bytes)) != -1) {
                dos.write(bytes, 0, readsize);
                if (readsize != 1024) {
                    break;
                }
            }
        } else {
            dos.writeUTF("[Type]다운로드파일정보: false " + fl.getName());
        }
    }

    private void doShowFileList() throws IOException {
        System.out.println("파일목록");
        File dir = new File(filefolder);
        File[] childrenFiles = dir.listFiles();
        dos.writeUTF("[Type]파일목록개수: " + childrenFiles.length);
        for (File file : childrenFiles) {
            dos.writeUTF("[Type}파일리스트: **" + file.getName() + " " + lengthGMK(file.length()) + "**");
        }
    }

    private void upload() throws IOException {
        String filenameReq = dis.readUTF();
        String[] filename = filenameReq.split(" ");

        File fl = new File(filefolder + "/" + filename[1]);
        if (fl.exists()) {
            FileOutputStream fos = new FileOutputStream(filefolder + "/" + filename[1]);
            dos.writeUTF("[Type]중복: true");
            String changeFile = dis.readUTF();
            String[] changeFileInfo = changeFile.split(" ");
            if (changeFileInfo[1].toLowerCase(Locale.ROOT).equals("yes")) {
                dos.writeUTF("[Type]업로드: 확인");
                while (true) {
                    readsize = dis.read(bytes);
                    fos.write(bytes, 0, readsize);
                    if (readsize != 1024) {
                        break;
                    }
                }
            } else {
                dos.writeUTF("[Type]업로드: 취소");
            }
        } else {
            dos.writeUTF("[Type]중복: false");
            FileOutputStream fos = new FileOutputStream(filefolder + "/" + filename[1]);
            while (true) {
                readsize = dis.read(bytes);
                fos.write(bytes, 0, readsize);
                if (readsize != 1024) {
                    break;
                }
            }
        }
    }

    private void Login() throws IOException {

        while (true) {
            dos.writeUTF("[Type]로그인: " + isLogin);

            String loginInfo = dis.readUTF();
            String[] loginInfoList = loginInfo.split(" ");
            String rid = loginInfoList[1];
            String rpw = loginInfoList[2];
            if (id.equals(rid) && pw.equals(rpw)) {
                dos.writeUTF("** FTP 서버에 접속하였습니다. **");
                isLogin = "true";
                dos.writeUTF("[Type]로그인: " + isLogin);
                break;

            } else {
                dos.writeUTF("** ID 또는 PASS가 틀렸습니다.! **");
            }

        }

    }


    public String lengthGMK(double size) {
        String GMK = "";

        if (size < 1000) {
            GMK = size + "";
        } else if (size >= Math.pow(2, 30)) {

            GMK = roundGMK(size, 30) + "G";
        } else if (size >= Math.pow(2, 20)) {
            GMK = roundGMK(size, 20) + "M";
        } else if (size >= Math.pow(2, 10)) {
            GMK = roundGMK(size, 10) + "kb";
        }

        return GMK;
    }

    private double roundGMK(double size, int x) {
        return Math.round(size / Math.pow(2, x) * 100) / 100.0;
    }
}