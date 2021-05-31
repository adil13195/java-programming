package day38_methods;
/**
 * import all static methods. so that you can just call by method name, without classname
 */
import static day38_methods.StringUtils.*;          //在不同的package引用的话额可以在这里加这一行。
public class StringUtilTest {                       //或者可以写package name .class name
    public static void main(String[] args) {
        String userName ="";
        if (StringUtils.isNullOrEmpty(userName)){
            System.out.println("Fall :Username cannot be null or empty");
            System.out.println("isPalindrome(civic) = " + StringUtils.isPalindrome("civic"));
            System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
            System.out.println("isPalindrome(Cybertek) = " + StringUtils.isPalindrome("Cybertek"));

            String word ="java";
            String revWord =StringUtils.reverse(word);
            System.out.println("revWord = " + revWord);
            System.out.println(StringUtils.reverse(word));


        }


    }


}
