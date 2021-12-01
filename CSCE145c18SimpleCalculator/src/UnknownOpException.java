/*
 * Written by Georphoe
 */
public class UnknownOpException extends Exception
{
	public UnknownOpException()
	{
		super("Tried to use an unknown operator");
	}
	public UnknownOpException(String msg)
	{
		super(msg);
	}

}
