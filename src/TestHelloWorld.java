import org.junit.Test;
import static org.junit.Assert.*;



public
class TestHelloWorld
{
	@Test
	public void testHelloWorldForEnglish()
	{
		Translator translator = Translator.make("en");

		assertEquals( "Hello World", HelloWorld.helloWorld(translator) );	}

	@Test
	public void testHelloWorldForMandarin()
	{
		Translator translator = Translator.make("ch");

		assertEquals( "Ni hao ?", HelloWorld.helloWorld(translator) );	}

	@Test
	public void testHelloWorldForFrench()
	{
		Translator translator = Translator.make("fr");

		assertEquals( "? ?", HelloWorld.helloWorld(translator) );	}
}
