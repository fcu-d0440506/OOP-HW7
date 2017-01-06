
public class Pokemon 
{
	private  int cp;
	public final String name;
	public final PokemonType pokemontype;
	
	public static void main(String[] args) {
	}
	
	public Pokemon(String n , PokemonType a , int c)
	{
		name = n;
		pokemontype = a;
		cp = c;
	}
	public PokemonType get_type()
	{
		return pokemontype;
	}
	public String get_name()
	{
		return name;
	}
	public void attack()
	{
		
	}
	public int get_cp()
	{
		return cp;
	}
	public void set_cp()
	{
		
	}
}
