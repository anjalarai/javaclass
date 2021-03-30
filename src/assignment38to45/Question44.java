package assignment38to45;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Question44 {

    private static List<String> list = new ArrayList<String>(3);
    String name[]=new String[10];
    String address[]=new String[10];
    Scanner sc=new Scanner(System.in);
    int i,j,k;
    String s;

    Question44(){
    }

    public void acceptinp() throws IOException
    {
        try
        {
            for(i=0; i<=3; i++)
            {
                System.out.print("Enter“+i+” Name :”);
                name[i]=sc.next();
                System.out.print("Enter “+i+” Address:”);
                address[i]=sc.next();
            }
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
        }

        for( k=0; k<=3; k++)
        {

            System.out.println("Enter “+k+” Name :”+name[k]);
            System.out.println("Enter “+k+” Address:”+address[k]);
            s=name[k]+ “, “+address[k];
            list.add(s);
        }

    }

    public void writeList()throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt”));

        for (int j = 0; j <=3; j++) {
            out.println(list.get(j));
        }
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Question44 wf=new Question44();
        wf.acceptinp();
        wf.writeList();
    }
}