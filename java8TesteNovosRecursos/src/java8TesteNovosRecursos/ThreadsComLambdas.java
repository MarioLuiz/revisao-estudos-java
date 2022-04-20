package java8TesteNovosRecursos;

public class ThreadsComLambdas {
	public static void main(String[] args) {
		
		//Modo Antigo
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable antes");
		    }

		}).start();
		
		// Com Lambdas
		new Thread(() -> System.out.println("Executando um Runnable agora")).start();
		
	}
}
