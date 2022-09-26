package crud;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;

	public class Agenciacrud {
	    public Agenciacrud(int id, String nome, String tel, String email) {
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
	        
	        Scanner s = new Scanner(System.in);
	        int opcao = 0;
	        int posicao = 0;
	        int id = 0;
	        String nome = "";
	        String tel = "";
	        String email = "";
	        
	        List<Agenciacrud> usuarios = new ArrayList<Agenciacrud>();
	        
	        do {
	            System.out.println("===  CRUD Agencia  ===");
	            System.out.println("1 - Cadastrar agencia ");
	            System.out.println("2 - Consultar agencia");
	            System.out.println("3 - Deletar agencia");
	            System.out.println("0 - Sair");
	            
	            opcao = s.nextInt();
	            
	            switch (opcao) {
	            case 1:
	                //CREATE
	                
	                
	                System.out.println("Cadastrar agencia ");
	                System.out.println("Digite o nome: ");
	                nome = s.next();
	                System.out.println("Digite o telefone: ");
	                tel = s.next();
	                System.out.println("Digite o email: ");
	                email = s.next();
	                
	                Agenciacrud u1 = new  Agenciacrud (id, nome, tel, email);
	                
	                usuarios.addAll(Arrays.asList(u1));
	                
	                System.out.println("*** Cadastrou ***\n\n");
	                
	                id++;
	                break;
	                
	            case 2:
	                //READ
	                for (int i = 0; i < usuarios.size(); i++) {
	                    System.out.println("id: "+ usuarios.get(i).getId() +"nome: " + usuarios.get(i).getNome());
	                }
	                System.out.println("*** consultou ***\n\n");
	                break;
	            case 3:
	                //DELETE
	                System.out.println("Passe a posição do usuario: ");
	                posicao = s.nextInt();
	                System.out.println("Usuario excluido: " + usuarios.get(posicao).getNome());
	                usuarios.remove(posicao);
	                
	                break;
	            default:
	                System.out.println(opcao !=0 ? "\n opção invalida, digite novamente" : "");
	                break;
	            }
	            
	        } while(opcao != 0);
	        
	        System.out.println("Fim programa");
	        
	    }

		private String getId() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getNome() {
			// TODO Auto-generated method stub
			return null;
		}

	}


