import javax.swing.*;

public class ControleFinanceiro {
}


void main() {
    JFrame janela = new JFrame();
    janela.setTitle("Controle de Financeiro");
    janela.setSize(500, 500);
    janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JLabel labelNome = new JLabel("Digite seu Nome:");
    labelNome.setBounds(20, 20, 100, 20);
    janela.getContentPane().add(labelNome);

    JTextField campoTextoNome = new JTextField();
    campoTextoNome.setBounds(20, 40, 200, 20);
    janela.getContentPane().add(campoTextoNome);

    JButton botaoEnviar = new JButton();
    botaoEnviar.setText("Enviar");
    botaoEnviar.setBounds(20, 60, 100, 20);
    janela.getContentPane().add(botaoEnviar);
    botaoEnviar.addActionListener(event -> {
        String nomeDigitado = campoTextoNome.getText();
        JOptionPane.showMessageDialog(janela, "Seja Bem Vindo!  " + nomeDigitado);

    });

    janela.setLayout(null);
    janela.setVisible(true);
}

