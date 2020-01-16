package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.Pessoas;


public class Main {

	public static void main(String[] args) {
		
		List<Pessoas> pessoas = new ArrayList<Pessoas>();
		
		pessoas.add(new Pessoas("Joao" , 15));
		pessoas.add(new Pessoas("Leandro" , 21));
		pessoas.add(new Pessoas("Paulo" , 17));
		pessoas.add(new Pessoas("Jessica" , 18));
		
		Collections.sort(pessoas, Comparator.comparing(Pessoas::getIdade));
		
		for(Pessoas i : pessoas)
		{
			System.out.println(i.getNome() + "  " + i.getIdade());
		}
		
		
		System.out.println("Pessoa mais velha : " + pessoas.get(pessoas.size()-1).getNome() + "\n-----------------------------\n");
		
		List<Pessoas> maiores = new ArrayList<Pessoas>();
		
		for ( int i = 0; i < pessoas.size(); i++) 
		{
			Pessoas p = pessoas.get(i);
			if(p.getIdade() > 17)
			{
				maiores.add(p);
			}
		}
		
		
		System.out.println("Antes a lista tinha " + pessoas.size() + " pessoas, retirando os menores de idade temos " + maiores.size() + " pessoas.\n\n-----------------------------");
		
		
		for(Pessoas i : maiores)
		{
			System.out.println(i.getNome() + "  " + i.getIdade());
		}
		
		String nomebuscado = "Jessica";
		
		for(Pessoas i : maiores)
		{
			if(	i.getNome().equals(nomebuscado))
			{
				System.out.println("\nO nome:" + nomebuscado + " existe na lista.\n\n-----------------------------\n");
			}
		}
	}
}
