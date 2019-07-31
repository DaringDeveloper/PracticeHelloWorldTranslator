public
abstract class Translator implements Vocabulary
{
	public static Translator make(String language)
	{
		switch(language)
		{
		case "en": return new EnglishTranslator();
		case "ch": return new MandarinTranslator();
		case "fr":   return new FrenchTranslator();
		default: return null;
		}
	}
}

class EnglishTranslator extends Translator
{
	public String hello()  { return "Hello"; }
	public String world()  { return "World"; }
}

class MandarinTranslator extends Translator
{
	public String hello()  { return "Ni hao"; }
	public String world()  { return "?"; }
}

class FrenchTranslator extends Translator
{
	public String hello()  { return "?"; }
	public String world()  { return "?"; }
}

