package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
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
    }
}