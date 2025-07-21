import javax.swing.*;
import java.awt.event.*;

public class EnergiaApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Energia");
        frame.setSize(300, 200);

        JTextField corrente = new JTextField("Corrente (A)");
        JTextField tensao = new JTextField("Tensão (V)");
        JTextField tempo = new JTextField("Tempo (h)");
        JButton calcular = new JButton("Calcular");
        JLabel resultado = new JLabel("Energia: ");

        corrente.setBounds(50, 20, 200, 20);
        tensao.setBounds(50, 50, 200, 20);
        tempo.setBounds(50, 80, 200, 20);
        calcular.setBounds(100, 110, 100, 30);
        resultado.setBounds(50, 150, 200, 20);

        calcular.addActionListener(e -> {
            try {
                double i = Double.parseDouble(corrente.getText());
                double v = Double.parseDouble(tensao.getText());
                double t = Double.parseDouble(tempo.getText());
                double energia = i * v * t / 1000;
                resultado.setText("Energia: " + energia + " kWh");
            } catch (Exception ex) {
                resultado.setText("Erro nos valores.");
            }
        });

        frame.setLayout(null);
        frame.add(corrente); frame.add(tensao); frame.add(tempo);
        frame.add(calcular); frame.add(resultado);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
