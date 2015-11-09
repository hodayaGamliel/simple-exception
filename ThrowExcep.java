  public class ThrowExcep
{
        public static void main(String[] args) throws Exception
        {
        		Thread.sleep(500000);
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
