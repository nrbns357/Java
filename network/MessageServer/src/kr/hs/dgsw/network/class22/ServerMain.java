package kr.hs.dgsw.network.class22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerMain {

   public static void main(String[] args) {
      ServerSocket ss = null;

      try {
         ss = new ServerSocket(812000);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      try {
         while(true){
            Socket sc = ss.accept();
            Thread ot = new OutPutThread(sc);
            ot.start();
            try {
               ot.join();
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            System.out.println("프로그램을 종료합니다.");
         }
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

}