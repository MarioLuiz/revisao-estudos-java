package java8TesteNovosRecursos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate olimpiadasParis = LocalDate.of(2024, 07, 26);
		
		int anos = olimpiadasParis.getYear() - hoje.getYear();
		
		System.out.println("Faltam " + anos + " anos para Olimpiadas de Paris de " + olimpiadasParis.getYear());
		
		Period periodoDias = Period.between(hoje, olimpiadasParis);
		System.out.println("Faltam " + periodoDias.getDays() + " dias no total");
		
		LocalDate proximasOlimpiadas = olimpiadasParis.plusYears(4);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = formatador.format(proximasOlimpiadas);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);
	}

}
