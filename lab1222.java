import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;
public class lab1222
{
public static void main(String[] args)throws IOException
{
File f= new File("d:\\ratn,abhi\\rrrrr.txt");
FileInputStream input1 =new FileInput1Stream(f);
StringBuffer Buffer = new StringBuffer();
Scanner s= new Scanner(input1);
while(s.hasNext())
{
Buffer.append("\n"+s.nextLine());
}
System.out.println("Contents of the file is:"+f+ Buffer);
File f2=new File("d:\\ratn,abhi\\output.txt");
FileWriter w=new FileWriter(f2);
String out="hi__ Hello__How are you";
w.write(out);
System.out.println("Writeing is success\n"+out);
}
}
