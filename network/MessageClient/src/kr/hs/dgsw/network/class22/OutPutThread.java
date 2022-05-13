package kr.hs.dgsw.network.class22;

import java.io.BufferedReader;
import java.io.IOException;

public class OutPutThread extends Thread{
   BufferedReader br = null;
   
   public OutPutThread(BufferedReader br) {
      this.br = br;
   }
   
   public void run() {
      
         try {
            while(true) {
               System.out.println(br.readLine());
            }
         } catch (IOException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("클라이언트 접속이 종료되었습니다. output Thread를 종료합니다");
         }
      
   }
}