import java.io.*;
import scripy.lexer.*;
import scripy.parser.*;
import scripy.node.*;


public class SemanticsAnalysis
{

  public static void main(String[] args)
  {

	try
    {

		Parser parser = new Parser(new Lexer(new PushbackReader(new FileReader(args[0].toString()), 1024)));

		Symbol symtable =  new Symbol();

		Start ast = parser.parse();

		Helper1 first = new Helper1(symtable);
		ast.apply(first);

		Helper2 second = new Helper2(first.getTable(),first.getErrors());
		ast.apply(second);

	}

    catch (Exception e)
    {
		e.printStackTrace();
    }

  }

}
