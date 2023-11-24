import java.util.regex.*;

public class DemoRegex4{

public static void main(String args[]){


Pattern p= Pattern.compile("\\D");

Matcher m=p.matcher("a7b k@9");

while(m.find())
{

System.out.println(m.start()+"...."+m.group());

}

}
}