import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

	// Criação da janela (frame) para a página de boas-vindas
	JFrame frame = new JFrame();// Janela principal
	JLabel welcomeLabel = new JLabel("Olá");// Rótulo para exibir a saudação
	
	// Construtor da página de boas-vindas
	WelcomePage() {
		
		// Define a posição, tamanho e fonte do rótulo de boas-vindas
		welcomeLabel.setBounds(0,0,200,35);// Define posição (x, y) e tamanho (largura, altura)
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));// Define a fonte do rótulo
		
		frame.add(welcomeLabel);// Adiciona o rótulo de boas-vindas à janela
		// Configurações para a janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Define ação ao fechar (sair do programa)
		frame.setSize(420, 420);// Define o tamanho da janela (largura, altura)
		frame.setLayout(null);// Usa layout manual para posicionar componentes
		frame.setVisible(true);// Torna a janela visível (exibe a janela na tela)
	}
	
}
