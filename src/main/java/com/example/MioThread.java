package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class MioThread extends Thread{
Socket s;
    public MioThread(Socket s){
        this.s = s;
    }

    public void run(){
        ServerSocket ss = new ServerSocket(6363);
        Socket mySocket = ss.accept();
        System.out.println("Qualcuno si è collegato");
        switch (oppzione) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:
            
                break;
            default:
                break;
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
        DataOutputStream out = new DataOutputStream(mySocket.getOutputStream());
        String stringRecive = in.readLine();
        System.out.println("La string ricevuta: " + stringRecive);
        String stringUppercase = stringRecive.toUpperCase();
        out.writeBytes(stringUppercase + "\n");
        mySocket.close();
        s1.close();
    }
}
