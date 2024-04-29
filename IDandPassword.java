import java.util.HashMap;

public class IDandPassword {

	 // Cria um HashMap para armazenar informações de login (nome de usuário e senha)
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPassword() {
		 // Adiciona algumas entradas ao HashMap, associando um nome de usuário a uma senha
		logininfo.put("Vinicius", "123");
		logininfo.put("Flamengo", "arrascaeta");
		logininfo.put("Pizza", "Pepperoni");
	}
	
	// Método protegido para obter o HashMap com as informações de login
	protected HashMap getLoginInfo() {
		return logininfo;
	}
	
}
