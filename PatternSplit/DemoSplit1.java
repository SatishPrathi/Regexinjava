import java.util.regex.*;

public class DemoSplit1{

public static void main(String args[]){


Pattern p= Pattern.compile("\\s");
String[] s=p.split("satish kumar prathi");

for(String s1:s){

System.out.println(s1);
}
}
}