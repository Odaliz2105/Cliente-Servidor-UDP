package ventana;

import entidades.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControladorCalculadora {

    @FXML
    private TextField txtN1;

    @FXML
    private TextField txtN2;

    @FXML
    private Label lblResultado;

    private Cliente cliente = new Cliente();

    private final String IP = "127.0.0.1"; // usar localhost
    private final int PUERTO = 5000;

    @FXML
    public void sumar() {
        operar("+");
    }

    @FXML
    public void restar() {
        operar("-");
    }

    @FXML
    public void multiplicar() {
        operar("*");
    }

    @FXML
    public void dividir() {
        operar("/");
    }

    private void operar(String op) {
        try {
            double n1 = Double.parseDouble(txtN1.getText());
            double n2 = Double.parseDouble(txtN2.getText());

            String respuesta = cliente.enviar(IP, PUERTO, n1, n2, op);

            lblResultado.setText(respuesta);

        } catch (Exception e) {
            lblResultado.setText("Error");
        }
    }
}