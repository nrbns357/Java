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
            System.out.println("Ŭ���̾�Ʈ ������ ����Ǿ����ϴ�. output Thread�� �����մϴ�");
         }
      
   }
}