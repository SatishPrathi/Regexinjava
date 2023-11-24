import java.util.regex.*;

public class DemoRegex1{

public static void main(String args[]){


Pattern p= Pattern.compile("\\s");

Matcher m=p.matcher("a7b k@9");

while(m.find())
{

System.out.println(m.start()+"...."+m.group());

}

}
}