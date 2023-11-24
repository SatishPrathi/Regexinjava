import java.util.regex.*;

public class DemoRegex5{

public static void main(String args[]){


Pattern p= Pattern.compile("\\w");

Matcher m=p.matcher("a7b k@9");

while(m.find())
{

System.out.println(m.start()+"...."+m.group());

}

}
}