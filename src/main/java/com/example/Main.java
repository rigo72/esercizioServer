package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket ss1 = new ServerSocket(6363);
        do{
            Socket s1 = ss1.accept();
            MioThread t = new MioThread(s1);
            t.start();
        }while(true);
        /*
        ServerSocket ss = new ServerSocket(6363);
        Socket mySocket = ss.accept();
        System.out.println("Qualcuno si è collegato");
        BufferedReader in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
        DataOutputStream out = new DataOutputStream(mySocket.getOutputStream());
        String stringRecive = in.readLine();
        System.out.println("La string ricevuta: " + stringRecive);
        String stringUppercase = stringRecive.toUpperCase();
        out.writeBytes(stringUppercase + "\n");
        mySocket.close();
        ss.close();
        */
    }
}