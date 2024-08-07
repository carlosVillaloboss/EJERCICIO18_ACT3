package ejercicio18_cap3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz {

    private JFrame frame;
    private JTextField txtCodigoEmp;
    private JTextField txtNombres;
    private JTextField txtHorasmes;
    private JTextField txtValorhora;
    private JTextField txtRetencion;
    private JTextArea txtOutput;

    public interfaz() {
        // Crear la ventana principal
        frame = new JFrame("Empleado - Información y Cálculo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2, 10, 10));

        // Crear componentes
        JLabel lblCodigoEmp = new JLabel("Código del empleado:");
        JLabel lblNombres = new JLabel("Nombres:");
        JLabel lblHorasmes = new JLabel("Horas trabajadas al mes:");
        JLabel lblValorhora = new JLabel("Valor por hora:");
        JLabel lblRetencion = new JLabel("Porcentaje de retención:");

        txtCodigoEmp = new JTextField();
        txtNombres = new JTextField();
        txtHorasmes = new JTextField();
        txtValorhora = new JTextField();
        txtRetencion = new JTextField();

        JButton btnCalcular = new JButton("Calcular y Mostrar");
        txtOutput = new JTextArea();
        txtOutput.setEditable(false);

        // Agregar componentes al panel
        frame.add(lblCodigoEmp);
        frame.add(txtCodigoEmp);
        frame.add(lblNombres);
        frame.add(txtNombres);
        frame.add(lblHorasmes);
        frame.add(txtHorasmes);
        frame.add(lblValorhora);
        frame.add(txtValorhora);
        frame.add(lblRetencion);
        frame.add(txtRetencion);
        frame.add(new JLabel()); // Espacio vacío
        frame.add(btnCalcular);
        frame.add(new JLabel()); // Espacio vacío
        frame.add(new JScrollPane(txtOutput));

        // Configurar acción del botón
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularYMostrar();
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }

    private void calcularYMostrar() {
        try {
            // Leer datos de los campos de texto
            int codigoEmp = Integer.parseInt(txtCodigoEmp.getText());
            String nombres = txtNombres.getText();
            double horasmes = Double.parseDouble(txtHorasmes.getText());
            double valorhora = Double.parseDouble(txtValorhora.getText());
            int retencion = Integer.parseInt(txtRetencion.getText());

            // Crear un objeto Empleado
            Empleado empleado = new Empleado(codigoEmp, nombres, horasmes, valorhora, retencion);

            // Mostrar resultados
            txtOutput.setText(empleado.MostrarDatos());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese datos válidos.",
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new interfaz());
    }
}

