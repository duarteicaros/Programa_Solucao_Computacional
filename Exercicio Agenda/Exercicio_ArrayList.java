/*Implementar uma agenda de pessoas com nome e fone, ambos do tipo String. 
 * A agenda deve funcionar com um menu de op��es num�ricas 
 * (0 - Sair, 1- Incluir nome e fone, 2- Alterar fone, 3- Consultar fone, 
 * 4- Excluir, 5- Listar agenda). As funcionalidades s�o:
1 - Incluir onde se inclui nome e fone
2 - Alterar onde voc� passa o nome e depois o novo fone
3 - Consulta onde voc� passa o nome e a agenda retorna o fone
4 - Excluir onde voc� passa o nome e a pessoa � retirada da agenda 
5 - Listar onde toda os nomes e fones ser�o apresentados      
Obs.: Baseie-se no c�digo apresentado pelo Prof. Bossini na aula te�rica.*/


package Aula_26102020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_ArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String menu = "Selecione uma op��o:"
				+ "\n0- Sair "
				+ "\n1- Incluir nome e fone"
				+ "\n2- Alterar fone"
				+ "\n3- Consultar fone"
				+ "\n4- Excluir"
				+ "\n5- Listar agenda";
		
		List <Pessoa> agenda = new ArrayList <> ();
		
		int op;
		
		
	
		/*
		lista.add(null);
		lista.remove(lista);
		lista.get(0);
		lista.size();
		lista.set(0, null);*/
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			
			switch(op) {
			case 0:
				JOptionPane.showMessageDialog(null, "At� logo");
                break;
			case 1:
				
				 String nome = JOptionPane.showInputDialog("Qual o nome da pessoa?");
				 Pessoa pessoa = new Pessoa(nome); 
				 agenda.add(pessoa);
				 String telefone = JOptionPane.showInputDialog("Qual o numero da pessoa?");
				 int i;
				 
				 for (i = 0; i < agenda.size(); i++){
                     if (agenda.get(i).getNome().equals(nome)){
                         agenda.get(i).setTelefone(telefone);
                         break;
                     }
                 }   
				 
				 
				break;
			case 2:
				String trocatelefone = JOptionPane.showInputDialog("Qual pessoa deseja alterar o n�mero?");
                String avaliacao = JOptionPane.showInputDialog("Qual o numero?");
                
                for (i = 0; i < agenda.size(); i++){
                    if (agenda.get(i).getNome().equals(trocatelefone)){
                        agenda.get(i).setTelefone(avaliacao);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, i < agenda.size() ? "" : "M�sica n�o existe na sua base");                                                   
				break;
			case 3:
				System.out.println("Deseja consultar os numeros");
				//System.out.println(lista.get(0, telefone));
				break;
			case 4:
				System.out.println("Deseja realmente excluir o numero?");
				//lista.remove(nome);
				//lista.remove(telefone);
				break;
			case 5:
				System.out.println("Lista de Contatos");
				lista.size();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida");
                break;
			}
		
	}while(op!= 0);
		
	}
}
