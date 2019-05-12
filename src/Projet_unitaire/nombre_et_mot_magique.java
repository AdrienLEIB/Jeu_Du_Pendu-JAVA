package Projet_unitaire;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class nombre_et_mot_magique {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("Bonjour, voulez vous jouer au 'nombre magique'(1), au 'mot magique'(2) ou 'mot magique que doit trouver l'ordi?'(3) ");

		String reponse = scan.nextLine();
		System.out.print("avec coup limité (oui ou non) ?");
		String reponse2 = scan.nextLine();
		
		// 1 and oui
		if ( reponse.equals("1") && reponse2.equals("oui")) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Bienvenue dans le jeu du nombre magique, vous avez 10 erreurs possibles");
			int count=10;
			Random rand = new Random();
			int nombreAleatoire = rand.nextInt(100) + 1;
			int super_compteur = 0;
			int nombreSaisir = 0; 

			while (nombreSaisir != nombreAleatoire && count>0) {
				System.out.println("Un nombre vient d'etre généré entre 0 et 100 , devinez-le !");
				nombreSaisir = scan.nextInt();
				super_compteur++;
				if (nombreSaisir > nombreAleatoire) {
					System.out.println("Nombre proposé est trop grand");
					count--;
					System.out.println("il reste " + count + " tentatives ");
				} else if (nombreSaisir < nombreAleatoire) {
					System.out.println("Nombre proposé est trop petit");
					count--;
					System.out.println("il reste " + count + " tentatives ");
				} else if (nombreSaisir == nombreAleatoire) {
					System.out.println("Bravo vous gagnés "+ super_compteur +" tentative(s)");
				}else if (count==0) {
					System.out.println("Vous avez perdu");
				}

			}
		}
		
		// 1 and non
		else if ( reponse.equals("1") && reponse2.equals("non")) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Bienvenue dans le jeu du nombre magique, vous avez coup illimité");
			Random rand = new Random();	
			int nombreAleatoire = rand.nextInt(100) + 1;
			int nombreSaisir = 0;
			int super_compteur=0;
			System.out.println("Un nombre vient d'etre g�n�r� entre 0 et 100 , devinez-le !");
			while (nombreSaisir != nombreAleatoire) {

				nombreSaisir = scan.nextInt();
				super_compteur++;

				if (nombreSaisir > nombreAleatoire) {
					System.out.println("Nombre propos� est trop grand");
				} else if (nombreSaisir < nombreAleatoire) {
					System.out.println("Nombre propos� est trop petit");
				} else if (nombreSaisir == nombreAleatoire) {
					System.out.println("Bravo vous avez gagnés en "+ super_compteur+ " tentatives");
				}

			}
			
		}
		
		// 2 and oui
		else if (reponse.equals("2") && reponse2.equals("oui")) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Bienvenue dans le jeu du mot magique, vous avez 10 erreurs possible");
			//variable
			int super_compteur=0;
			ArrayList<String> liste_des_mots_magiques = new ArrayList<>();
			ArrayList<Character> mot_magique = new ArrayList<>();
			ArrayList<Character> mot_cache = new ArrayList<>();
			ArrayList<Character> mot_magique_Save = new ArrayList<>();
//			Scanner scan = new Scanner(System.in);
			char lettre =' ';
			int count = 10;
			
			liste_des_mots_magiques.add("adrien");
			liste_des_mots_magiques.add("mickael");
			liste_des_mots_magiques.add("coucou");
			liste_des_mots_magiques.add("france");
			liste_des_mots_magiques.add("boulanger");
			
			char Caractere = ' ';
			
			Random rand = new Random();
			int aleatoire = rand.nextInt(3);
			String mot = liste_des_mots_magiques.get(aleatoire) ;
			

			for (int i=0;i<mot.length();i++) {
				Caractere = mot.charAt(i);
				mot_magique.add(Caractere);
			}
			
			for (int i=0;i<mot.length();i++) {
				Caractere = mot.charAt(i);
				mot_magique_Save.add(Caractere);
			}
			
			int tiret = 0;
			
			while (tiret<mot.length()) {
				mot_cache.add('-');
				tiret = tiret +1;
			}
			

			while (!mot_cache.equals(mot_magique) && count > 0) {
				System.out.println("Voici le mot cach�, � vous de le trouver" + mot_cache);
				lettre = scan.next().charAt(0);
				lettre = Character.toLowerCase(lettre);
				int decompte = 0;
				for (int c=0; c<mot.length(); c++) {
					if(lettre==mot_magique_Save.get(c)) {
						System.out.println(lettre+ " se trouve dans le mot magique");
						mot_cache.set(c, lettre);
						
						mot_magique_Save.set(c, '-');

					}
					else if (lettre!=mot_magique_Save.get(c)){
						decompte++;
					}
				}super_compteur++;
				if (decompte==mot.length()) {
					count--;
					System.out.println("la lettre n'est pas dans le mot");
					System.out.println("il vous reste " + count );
				} 
				if (count==0) {
					System.out.println("Désolé !! Vous n'avez plus de chances");
				}
				else if (mot_cache.equals(mot_magique)) {
					System.out.println("Bravo ! Vous avez r�ussis � retrouver le mot cach� : " +mot_cache +" en "+ super_compteur + " tentative(s)");
				}
				 
			}
		}
		
		// 2 and non
		else if ( reponse.equals("2") && reponse2.equals("non")) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Bienvenue dans le jeu du mot magique, vous avez coup illimité");
			//variable
			int super_compteur=0;
			ArrayList<String> liste_des_mots_magiques = new ArrayList<>();
			ArrayList<Character> mot_magique = new ArrayList<>();
			ArrayList<Character> mot_cache = new ArrayList<>();
			ArrayList<Character> mot_magique_Save = new ArrayList<>();
			char lettre =' ';
			
			liste_des_mots_magiques.add("adrien");
			liste_des_mots_magiques.add("mickael");
			liste_des_mots_magiques.add("coucou");
			liste_des_mots_magiques.add("france");
			liste_des_mots_magiques.add("boulanger");
			
			char Caractere = ' ';
			
			Random rand = new Random();
			int aleatoire = rand.nextInt(3);
			String mot = liste_des_mots_magiques.get(aleatoire) ;
			

			for (int i=0;i<mot.length();i++) {
				Caractere = mot.charAt(i);
				mot_magique.add(Caractere);
			}
			
			for (int i=0;i<mot.length();i++) {
				Caractere = mot.charAt(i);
				mot_magique_Save.add(Caractere);
			}
			
			int tiret = 0;
			
			while (tiret<mot.length()) {
				mot_cache.add('-');
				tiret = tiret +1;
			}
			

			while (!mot_cache.equals(mot_magique)) {
				System.out.println("Voici le mot caché, à vous de le trouver" + mot_cache);
				lettre = scan.next().charAt(0);
				int decompte = 0;
				for (int c=0; c<mot.length(); c++) {
					if(lettre==mot_magique_Save.get(c)) {
						System.out.println(lettre+ " se trouve dans le mot magique");
						mot_cache.set(c, lettre);
						
						mot_magique_Save.set(c, '-');

					}
					else if (lettre!=mot_magique_Save.get(c)){
						decompte++;
					}
				}super_compteur++;
				if (decompte==mot.length()) {
					System.out.println( lettre + " n'est pas dans le mot");;
				}
			}
			System.out.println("Vous avez réussis à retrouver le mot caché : " +mot_cache);
		}
		
		// 3 and oui
		else if (reponse.equals("3") && reponse2.equals("oui")) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Bienvenue dans le jeu du mot magique que doit trouver l'ordi, 10 erreurs possible");
			//variable
			int super_compteur = 0;
			ArrayList<Character> alphabet = new ArrayList<>();
			ArrayList<Character> mot_magique = new ArrayList<>();
			ArrayList<Character> mot_cache = new ArrayList<>();
			ArrayList<Character> mot_magique_Save = new ArrayList<>();
//			Scanner scan = new Scanner(System.in);
			char lettre = ' ';
			int count = 40;
			Random rand = new Random();
			// alphabet 26 lettres
			alphabet.add('a');
			alphabet.add('b');
			alphabet.add('c');
			alphabet.add('d');
			alphabet.add('e');
			alphabet.add('f');
			alphabet.add('g');
			alphabet.add('h');
			alphabet.add('i');
			alphabet.add('j');
			alphabet.add('k');
			alphabet.add('l');
			alphabet.add('m');
			alphabet.add('n');
			alphabet.add('o');
			alphabet.add('p');
			alphabet.add('q');
			alphabet.add('r');
			alphabet.add('s');
			alphabet.add('t');
			alphabet.add('u');
			alphabet.add('v');
			alphabet.add('w');
			alphabet.add('x');
			alphabet.add('y');
			alphabet.add('z');
			// 14 caractères spécifiques 
			alphabet.add('-');
//			alphabet.add('ä');
//			alphabet.add('â');
//			alphabet.add('é');
//			alphabet.add('è');
//			alphabet.add('ë');
//			alphabet.add('ê');
//			alphabet.add('ï');
//			alphabet.add('î');
//			alphabet.add('ö');
//			alphabet.add('ô');
//			alphabet.add('ù');
//			alphabet.add('ü');
//			alphabet.add('û');
//			
			
			char Caractere = ' ';
			System.out.println("Quelle est le mot magique que vous voulez que je trouve?En minuscule");
			String mot_utilisateur = scan.next();
			

			
			
			for (int i=0;i<mot_utilisateur.length();i++) {
				Caractere = mot_utilisateur.charAt(i);
				mot_magique.add(Caractere);
			}
			
			for (int i=0;i<mot_utilisateur.length();i++) {
				Caractere = mot_utilisateur.charAt(i);
				mot_magique_Save.add(Caractere);
			}
			
			int tiret = 0;
			
			while (tiret<mot_utilisateur.length()) {
				mot_cache.add('?');
				tiret = tiret +1;
			}
			

			while (!mot_cache.equals(mot_magique) && count>0) {
				System.out.println("Je cherche...");
				int aleatoire = rand.nextInt(27);
				lettre = alphabet.get(aleatoire);
				int decompte = 0;
				for (int c=0; c<mot_utilisateur.length(); c++) {
					if(lettre==mot_magique_Save.get(c)) {
						System.out.println(lettre+ " se trouve dans le mot magique");
						mot_cache.set(c, lettre);
						
						mot_magique_Save.set(c, '?');
						
					}else if (lettre!=mot_magique_Save.get(c)){
						decompte++;
					}
				}super_compteur++;
				if (decompte==mot_utilisateur.length()) {
						count--;
						System.out.println(lettre+" lettre n'est pas dans le mot");
						System.out.println("il me reste " + count );
				} 
				if (count==0) {
						System.out.println("GAME OVER, j'ai perdu");
				}
				else if (mot_cache.equals(mot_magique)) {
						System.out.println("J'ai trouvé votre mot magique ! : " +mot_cache + " en " + super_compteur +" tentative(s)");
				}
			}
		}
		
		// 3 and non
		else if (reponse.equals("3") && reponse2.equals("non")) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Bienvenue dans le jeu du mot magique que doit trouver l'ordi");
			
			//variable
			int super_compteur=0;
			ArrayList<Character> alphabet = new ArrayList<>();
			ArrayList<Character> mot_magique = new ArrayList<>();
			ArrayList<Character> mot_cache = new ArrayList<>();
			ArrayList<Character> mot_magique_Save = new ArrayList<>();
//			Scanner scan3 = new Scanner(System.in);
			char lettre = ' ';
			Random rand = new Random();
			// alphabet 26 lettres
			alphabet.add('a');
			alphabet.add('b');
			alphabet.add('c');
			alphabet.add('d');
			alphabet.add('e');
			alphabet.add('f');
			alphabet.add('g');
			alphabet.add('h');
			alphabet.add('i');
			alphabet.add('j');
			alphabet.add('k');
			alphabet.add('l');
			alphabet.add('m');
			alphabet.add('n');
			alphabet.add('o');
			alphabet.add('p');
			alphabet.add('q');
			alphabet.add('r');
			alphabet.add('s');
			alphabet.add('t');
			alphabet.add('u');
			alphabet.add('v');
			alphabet.add('w');
			alphabet.add('x');
			alphabet.add('y');
			alphabet.add('z');
			// 14 caractères spécifiques 
			alphabet.add('-');
//			alphabet.add('ä');
//			alphabet.add('â');
//			alphabet.add('é');
//			alphabet.add('è');
//			alphabet.add('ë');
//			alphabet.add('ê');
//			alphabet.add('ï');
//			alphabet.add('î');
//			alphabet.add('ö');
//			alphabet.add('ô');
//			alphabet.add('ù');
//			alphabet.add('ü');
//			alphabet.add('û');
			
			
			char Caractere = ' ';
			System.out.println("Quelle est le mot magique que vous voulez que je trouve?En minuscule");
			String mot_utilisateur = scan.next();
			

			
			
			for (int i=0;i<mot_utilisateur.length();i++) {
				Caractere = mot_utilisateur.charAt(i);
				mot_magique.add(Caractere);
			}
			
			for (int i=0;i<mot_utilisateur.length();i++) {
				Caractere = mot_utilisateur.charAt(i);
				mot_magique_Save.add(Caractere);
			}
			
			int tiret = 0;
			
			while (tiret<mot_utilisateur.length()) {
				mot_cache.add('?');
				tiret = tiret +1;
			}
			

			while (!mot_cache.equals(mot_magique)) {
				System.out.println("Je cherche...");
				int aleatoire = rand.nextInt(27);
				
				lettre = alphabet.get(aleatoire);
				for (int c=0; c<mot_utilisateur.length(); c++) {
					if(lettre==mot_magique_Save.get(c)) {
						System.out.println(lettre+ " se trouve dans le mot magique");
						mot_cache.set(c, lettre);
						
						mot_magique_Save.set(c, '?');

					}
					
				}super_compteur++;
			}
			System.out.println("J'ai trouvé votre mot magique ! : " +mot_cache+ " en "+ super_compteur + " tentative(s)");
		}
		else {
			System.out.println("Ce jeu n'existe pas");
	}
		

	
}}

