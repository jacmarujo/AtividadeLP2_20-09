import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

//import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Dao {

	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

	public void listaPronta() {
		lista.add(new Aluno("JAC", 20, "112", "M", 7500));
		lista.add(new Aluno("JOANA", 25, "113", "F", 7501));
		lista.add(new Professor("JOSE", 40, "114", "M", 101010));
		lista.add(new Professor("MARIA", 35, "115", "F", 202020));
	}

	public void salvar(Pessoa p) {
		lista.add(p);
		JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
		JOptionPane.showMessageDialog(null, "Tamanho da lista: " + lista.size());
	}

	void Exibir() {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Aluno) {
			}
			if (lista.get(i) instanceof Professor) {
			}
		}
		JOptionPane.showMessageDialog(null, lista + "\n");
	}

	public void remover(String cpf) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCpf().equals(cpf)) {
				lista.remove(i);
				JOptionPane.showMessageDialog(null, "Aluno Excluído com Sucesso!");
			}
		}
	}
	
	public void salvarNoBd(Pessoa pessoa) {
		
			try {
				DriverManager.getConnection("jdbc:mysql://localhost/lp2", "root", "root123");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
}