import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

void main() {
    JFrame janela = new JFrame();
    janela.setTitle("Meu primeiro Programa!");
    janela.setSize(500, 500);
    janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JLabel labelNome = new JLabel("Nome:");
    labelNome.setBounds(20, 20, 50, 20);
    janela.getContentPane().add(labelNome);

    JTextField campoTextoNome = new JTextField();
    campoTextoNome.setBounds(20, 40, 200, 20);
    janela.getContentPane().add(campoTextoNome);

    JButton botaoEnviar = new JButton("Enviar");
    botaoEnviar.setBounds(20, 60, 100, 20);
    janela.getContentPane().add(botaoEnviar);
    botaoEnviar.addActionListener(event -> {
        String nomeDigitado = campoTextoNome.getText();
        JOptionPane.showMessageDialog(janela, "Bem Vindo! " + nomeDigitado);

    });

    janela.setLayout(null);
    janela.setVisible(true);
}