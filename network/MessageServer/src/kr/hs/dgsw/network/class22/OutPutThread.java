package kr.hs.dgsw.network.class22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OutPutThread extends Thread{
   private static List<OutPutThread> ClinentList = 
         Collections.synchronizedList(new ArrayList<OutPutThread>());
   Socket sc = null;
   
   OutputStream os = null;
   PrintWriter pw = null;
   
   public OutPutThread(Socket sc) {
      this.sc = sc;
      ClinentList.add(this);
      
      try {
         os = sc.getOutputStream();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      pw = new PrintWriter(os, true);
   }
   
   public void sendMessage(String msg) {
      pw.println(msg);
   }
   
   public void run() {
      InputStream is = null;
   
      try {
         is = sc.getInputStream();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      
      try {
         String msg = "";
         while(true) {
            msg = br.readLine();
            for(OutPutThread tmpOT : ClinentList) {
               if(msg != null && tmpOT != this) {
                  System.out.println(msg);
                  tmpOT.sendMessage(msg);
               }
               
            }
         }
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}