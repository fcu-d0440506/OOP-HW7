
public class Main 
{
	public static void main(String[] args) 
	{
		Psyduck psyduck = new Psyduck("My First Psyduck", PokemonType.water, 100);
	    psyduck.attack();
	    Charmander charmander = new Charmander("My First Charmander", PokemonType.fire, 456);
	    charmander.attack();
	    Bulbasaur bulbasaur = new Bulbasaur("My First Bulbasaur", PokemonType.grass, 589);
	    bulbasaur.attack();

	}
}
