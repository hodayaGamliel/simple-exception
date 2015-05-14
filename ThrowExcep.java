  public class ThrowExcep
{
        public static void main(String[] args) throws Exception
        {
                        throwExcep();
        }

        public static void throwExcep() throws Exception
        {
		
                try
                {
                        throw new Exception();
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
        }
}
