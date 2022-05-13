package kr.hs.dgsw.network.class22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {
   public static void main(String[] args) {
      try {
         Socket sc = new Socket("10.80.161.24", 1004);
         Scanner scan = new Scanner(System.in);

         OutputStream os = sc.getOutputStream();
         PrintWriter pw = new PrintWriter(os, true);

         InputStream is = sc.getInputStream();

         BufferedReader br = new BufferedReader(new InputStreamReader(is));
         Thread it = new InputThread(pw);
         Thread ot = new OutPutThread(br);
         
         it.start();
         ot.start();
      } catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}