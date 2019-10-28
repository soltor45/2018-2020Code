public static void main (String[] args)
{
  public class StringsMethod1
  {
    String phrase = "i like chocolate!";
    System.out.pritnln("Length: " + phrase.length());


    String food = "pizza";
    System.out.println(food.substring(0,1));
    System.out.println(food.substring(1,2));
    System.out.println(food.substring(2,3));
    System.out.println(food.substring(3,4));
    System.out.println(food.substring(4,5));
    
    String s = "I like the java ";
    String s2 = s.substring(11);
    
    String n = "This is room #257";
    int pos = n.indexOf("#");
    System.out.println("Position: " + pos);
    
    
    }
}