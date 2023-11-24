import java.util.regex.*;

public class DemoSplit2{

public static void main(String args[]){


Pattern p= Pattern.compile("\\.");
String[] s=p.split("www.satishkumarprathi.com");

for(String s1:s){

System.out.println(s1);
}
}
}