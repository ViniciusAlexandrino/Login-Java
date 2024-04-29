import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginPage implements ActionListener {

    // Declaração dos componentes gráficos para a página de login
    JFrame frame = new JFrame(); // Janela principal do JFrame
    JButton loginButton = new JButton("Login"); // Botão para fazer login
    JButton resetButton = new JButton("Reset"); // Botão para redefinir os campos
    JTextField userIDField = new JTextField(); // Campo de texto para o nome de usuário
    JPasswordField userPasswordField = new JPasswordField(); // Campo de senha
    JLabel userIDLabel = new JLabel("Login: "); // Rótulo para o campo do nome de usuário
    JLabel userPasswordLabel = new JLabel("Senha: "); // Rótulo para o campo de senha
    JLabel messageLabel = new JLabel(); // Rótulo para exibir mensagens (sucesso ou erro)
    HashMap<String, String> logininfo = new HashMap<String, String>(); // HashMap para informações de login

    // Construtor da página de login, aceitando um HashMap com informações de login
    public LoginPage(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal; // Armazena as informações de login recebidas
        
        // Define a posição e tamanho dos rótulos
        userIDLabel.setBounds(50, 100, 75, 25); // Rótulo para o nome de usuário
        userPasswordLabel.setBounds(50, 150, 75, 25); // Rótulo para a senha
        
        // Configura o rótulo para mensagens
        messageLabel.setBounds(125, 250, 250, 35); // Define a posição e tamanho do rótulo
        messageLabel.setFont(new Font(null, Font.ITALIC, 25)); // Define a fonte
        
        // Define a posição e tamanho dos campos de entrada
        userIDField.setBounds(125, 100, 200, 25); // Campo para o nome de usuário
        userPasswordField.setBounds(125, 150, 200, 25); // Campo para a senha
        
        // Define a posição, tamanho e adiciona o ActionListener para o botão de login
        loginButton.setBounds(125, 200, 100, 25); // Botão para fazer login
        loginButton.addActionListener(this); // Adiciona o listener para ações
        
        // Define a posição, tamanho e adiciona o ActionListener para o botão de redefinição
        resetButton.setBounds(225, 200, 100, 25); // Botão para redefinir campos
        resetButton.addActionListener(this); // Adiciona o listener para ações
        
        // Adiciona todos os componentes à janela
        frame.add(userIDLabel); // Adiciona o rótulo do nome de usuário
        frame.add(userPasswordLabel); // Adiciona o rótulo da senha
        frame.add(messageLabel); // Adiciona o rótulo para mensagens
        frame.add(userIDField); // Adiciona o campo de texto do nome de usuário
        frame.add(userPasswordField); // Adiciona o campo de senha
        frame.add(loginButton); // Adiciona o botão de login
        frame.add(resetButton); // Adiciona o botão de redefinição
        
        // Configurações adicionais para a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o fechamento padrão
        frame.setSize(420, 420); // Define o tamanho da janela
        frame.setLayout(null); // Usa layout manual para posicionar componentes
        frame.setVisible(true); // Torna a janela visível
    }

    // Método para lidar com eventos de ação (como clicar nos botões)
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) { // Se o botão de redefinição for pressionado
            // Limpa os campos do nome de usuário e senha
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if (e.getSource() == loginButton) { // Se o botão de login for pressionado
            // Obtém o nome de usuário e a senha dos campos
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            // Verifica se o nome de usuário está no HashMap
            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) { // Se a senha for correta
                    messageLabel.setForeground(Color.GREEN); // Cor para verde (sucesso)
                    messageLabel.setText("Login bem-sucedido"); // Mensagem de sucesso
                    frame.dispose(); // Fecha a janela de login
                    WelcomePage welcomePage = new WelcomePage(); // Abre a página de boas-vindas
                } else { // Se a senha estiver incorreta
                    messageLabel.setForeground(Color.RED); // Cor para vermelho (erro)
                    messageLabel.setText("Senha incorreta"); // Mensagem de erro
                }
            } else { // Se o nome de usuário não for encontrado
                messageLabel.setForeground(Color.RED); // Cor para vermelho (erro)
                messageLabel.setText("Username incorreto"); // Mensagem de erro
            }
        }
    } 

} 
