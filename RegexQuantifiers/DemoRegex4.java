import java.util.regex.*;

public class DemoRegex4{

public static void main(String args[]){


Pattern p= Pattern.compile("a*");

Matcher m=p.matcher("abaabaaab");

while(m.find())
{

System.out.println(m.start()+"...."+m.group());

}

}
}