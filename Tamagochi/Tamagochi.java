package Tamagochi;

import java.util.Scanner;

public class Tamagochi  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal pet = null;
		
		System.out.println("--------------TAMAGOCHI----------------");
		System.out.println("escolha um animal");
		System.out.println("1 - cachorro");
		System.out.println("2 - gato");
		System.out.println("3 - papagaio");
		System.out.println("---------------------------------------");
		int opcao = sc.nextInt();
		
		System.out.println("de um nome ao animal");
		String nome = sc.next();
		
		
		if (opcao == 1) {
			 pet = new Cachorro(nome);
		}
		
			
			 if (opcao == 2) {
					pet = new Gato(nome);
				}
				
				if (opcao == 3) {
					pet = new Papagaio(nome);
				}
		
		
		int escolha = 0;
		
		
		while (escolha < 6) {
			System.out.println("Escolha oque voce quer fazer");
			System.out.println("1 - brincar");
			System.out.println("2 - comer");
			System.out.println("3 - dormir");
			System.out.println("4 - limpar");
			System.out.println("5 - mostrar situação ");
			System.out.println("6 - sair do jogo");
			escolha = sc.nextInt();
			
			if (escolha == 1) {
				pet.brincar();
			}
			
			if (escolha == 2) {
				pet.comer();
			}
			
			if (escolha == 3) {
				pet.dormir();
			}
			 if (escolha == 4) {
				 pet.limpar();
			 }
			 
			 if (escolha == 5) {
				 pet.mostrasituação();
			 }
			 
			if (escolha == 6) {
				System.out.println("jogo encerrado");
			}
			if(pet.gethigiene() == 0) {
				pet.setsaude(pet.getsaude() - 10);
				System.out.println(pet.getnome() + "está doente por falta de higiene");
			}

			if(pet.getsaude() == 0) {
				System.out.println(pet.getnome() + "morreu");
			}
				}
			
		}
		



}
