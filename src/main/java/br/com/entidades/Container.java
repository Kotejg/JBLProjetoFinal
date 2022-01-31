package br.com.entidades;

import java.util.ArrayList;
import java.util.List;


public class Container {
	private static List<User> lista = new ArrayList<User>();; 
	private static int id = 1;
	
	
	public Container() {}
		
		
	
	public Container(User user) {
		 
		adicionarUser(user);
	} 
		
	public void adicionarUser(User user) {
		user.setId(id);
		lista.add(user);
		id++;
		
	} 
	
	public List<User> listarLista() {
		return lista;
	}	
	
	public User consultar(int indice) {
		return lista.get(indice);
	} 
	public void removerUser(int id) {
			lista.remove(id);	
	} 
	
	public void alterarUser(int id, String nome, String email, String telefone, String pais ) {
		User user = consultar(id -1);
		user.setNome(nome);
		user.setId(id);
		user.setEmail(email);
		user.setTelefone(telefone);
		user.setPais(pais);
	}
	
}
