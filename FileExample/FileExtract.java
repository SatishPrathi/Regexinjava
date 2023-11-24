import java.io.File;
import java.util.regex.*;

public class FileExtract{

public static void main(String args[])throws Exception 
{

int count =0;

Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$.]*[.]java");

File f=new File("C:\\D12");

String[] s=f.list();

for (String s1:s){

Matcher m= p.matcher(s1);

if(m.find() && m.group().equals(s1)){

count++;

System.out.println(s1);

}
}

System.out.println("the total numbers of files:"+count);

}
}