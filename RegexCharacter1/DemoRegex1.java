import java.util.regex.*;

public class DemoRegex1{

public static void main(String args[]){


Pattern p= Pattern.compile("[^a-zA-Z0-9]");

Matcher m=p.matcher("a7b@z#9");

while(m.find())
{

System.out.println(m.start()+"...."+m.group());

}

}
}