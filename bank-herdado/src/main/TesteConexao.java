package main;

import model.Conexao;

public class TesteConexao {
    public static void main(String[] args) {
    	
    	try(Conexao conexao = new Conexao()) {
    		conexao.leDados();
    	} catch (IllegalStateException e) {
    		 System.out.println("Deu erro na conexao");
		}
    	
    	//--------- Modo antigo 
//    	Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch(IllegalStateException ex) {
//            System.out.println("Deu erro na conexao");
//        } finally {
//        	System.out.println("Finally");
//            con.close();
//            if(con != null) {
//            	con.close();
//            }
//        }
    }
}
