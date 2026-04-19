package entidades;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servidor {

    private Modelo modelo = new Modelo();

    public void operar(int puerto) throws Exception {

        DatagramSocket socket = new DatagramSocket(puerto);
        System.out.println("Servidor corriendo en puerto: " + puerto);

        while (true) {
            try {
                byte[] bufferE = new byte[1024];
                DatagramPacket entrada = new DatagramPacket(bufferE, bufferE.length);
                socket.receive(entrada);

                String recibido = new String(entrada.getData(), 0, entrada.getLength());
                String[] partes = recibido.trim().split(",");

                double n1 = Double.parseDouble(partes[0]);
                double n2 = Double.parseDouble(partes[1]);
                String op = partes[2];

                double respuesta = 0;

                if (op.equals("+")) {
                    respuesta = modelo.sumar(n1, n2);
                } else if (op.equals("-")) {
                    respuesta = modelo.restar(n1, n2);
                } else if (op.equals("*")) {
                    respuesta = modelo.multiplicar(n1, n2);
                } else if (op.equals("/")) {
                    respuesta = modelo.dividir(n1, n2);
                }

                byte[] bufferS = String.valueOf(respuesta).getBytes();

                DatagramPacket salida = new DatagramPacket(
                        bufferS,
                        bufferS.length,
                        entrada.getAddress(),
                        entrada.getPort()
                );

                socket.send(salida);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}