  public class ThrowExcep
{
        public static void main(String[] args) throws Exception
        {
                        throwExcep();
                        throwExcep();
                      	Thread.sleep(1000 * 60 * 10);
                        throwExcep();
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
