public class WordProcessorTester
{

   public static void main(String[] args)
   {
      WordProcessor processor = new WordProcessor();
      processor.add("Mary");
      processor.add("had");
      processor.add("a");
      processor.add("a");
      processor.add("a");
      processor.add("a");
      processor.add("little");
      processor.add("lamb");
      System.out.println(processor.toString());
      System.out.println("Expected: [Mary, had, a, a, a, a, little, lamb]");

      processor.add("Its");
      processor.add("fleece");
      processor.add("was");
      processor.add("was");
      processor.add("white");
      processor.add("as");
      processor.add("snow");
      System.out.println(processor.toString());
      System.out.println("Expected: [Mary, had, a, a, a, a, little, lamb, Its, fleece, was, was, white, as, snow]");

      processor.removeAdjacentDuplicates();
      System.out.println(processor.toString());
      System.out.println("Expected: [Mary, had, a, little, lamb, Its, fleece, was, white, as, snow]");

      processor.add("very", 3);
      System.out.println(processor.toString());
      System.out.println("Expected: [Mary, had, a, very, little, lamb, Its, fleece, was, white, as, snow]");
   }

}
