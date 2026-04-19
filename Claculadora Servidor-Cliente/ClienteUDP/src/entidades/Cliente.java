package entidades;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {

    public String enviar(String IP, int puerto, double n1, double n2, String op) throws Exception {

        DatagramSocket socket = new DatagramSocket();
        InetAddress direccion = InetAddress.getByName(IP);

        String datos = n1 + "," + n2 + "," + op;
        byte[] bufferS = datos.getBytes();

        DatagramPacket salida = new DatagramPacket(bufferS, bufferS.length, direccion, puerto);
        socket.send(salida);

        byte[] bufferE = new byte[1024];
        DatagramPacket entrada = new DatagramPacket(bufferE, bufferE.length);
        socket.receive(entrada);

        String respuesta = new String(entrada.getData(), 0, entrada.getLength());

        socket.close();

        return respuesta;
    }
}