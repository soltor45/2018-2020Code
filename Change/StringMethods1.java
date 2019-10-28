public class StringMethods1
{
    public static void main(String[] args)
    {
        // The length method gives the number of characters
        // It includes spaces and punctuation
        
        String phrase = "I like chocolate!";        
        System.out.println("Length: " + phrase.length());
        
        String food = "pizza";
        System.out.println(food.substring(0,1));
        System.out.println(food.substring(1,2));       
        System.out.println(food.substring(2,3));        
        System.out.println(food.substring(3,4));        
        System.out.println(food.substring(4,5));       
        
        // remove character(s) in known position
        
        String s = "I like the Java";
        
        // substring out "I like"
        String s1 = s.substring(0,6);
        System.out.println(s1);
        
        // substring out "Java"
        String s2 = s.substring(11);    // one parameter means take to end
        System.out.println(s2);
        
        // put them back together (don't forget a space)
        
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        
        // remove character in unknown position
        
        s = "This is room #257";
       
        // Find the position of #        
        int pos = s.indexOf("#");   // finds first occurrence        
        System.out.println("Position: " + pos);
        
        if(pos == -1)
            System.out.println("character not found");
        else
        {
            s = s.substring(0,pos) + s.substring(pos + 1);
            System.out.println(s);
        }
    }
}




