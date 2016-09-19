package com.git.practice.maven;

public class Pokemon {
	
	int pikachuPrice = 6;
	int squirtlePrice = 5;
	int charmanderPrice = 5;

	public static void main(String[] args) {
		
		Pokemon pokemon = new Pokemon();

		System.out.println(pokemon.purchasePokemon(1,0,0));
		
	}
	
	public float purchasePokemon(int pikachu, int squirtle, int charmander){
		float price = pikachu*pikachuPrice + squirtle*squirtlePrice + charmander*charmanderPrice;
		while(pikachu > 0 &&  squirtle > 0 && charmander > 0){
			price = price - discountFor3Pokemons();
			pikachu--;
			squirtle--;
			charmander--;
		}
		
		while(pikachu > 0 &&  squirtle > 0 ){
			price = price - discountFor2PokemonsPikachuAndSquirtle();
			pikachu--;
			squirtle--;
			
		}
		
		while(pikachu > 0 &&  squirtle > 0 ){
			price = price - discountFor2PokemonsPikachuAndCharmander();
			pikachu--;
			charmander--;
			
		}
		
		while(pikachu > 0 &&  squirtle > 0 ){
			price = price - discountFor2PokemonsSquirtleAndCharmander();
			squirtle--;
			charmander--;
			
		}
		
		return price;
	}
	
	public float discountFor2PokemonsPikachuAndSquirtle(){
		return (float) 1.10;
		
	}
	public float discountFor2PokemonsPikachuAndCharmander(){
		return (float) 1.10;
		
	}
	public float discountFor2PokemonsSquirtleAndCharmander(){
		return (float) 1.0;
		
	}
	public float discountFor3Pokemons(){
		return (float) 3.20;
	}

}
