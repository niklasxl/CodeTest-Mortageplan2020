import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Costumer[] asd =input();

    }

    public static Costumer[] input() {


        ArrayList<String> lines= new ArrayList<String>();

        try {
            File file =new File("src/prospects.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;

            while((st=br.readLine())!= null){//loop thought all existing lines in file

//                System.out.println("st:"+st);
                if(st.length()>4) { //check if line length is of acceptable length to be plausible

                    lines.add(st);
                }
            }


        }catch (IOException e){

            System.out.println(e);

        }

        System.out.println(lines);


        return null;

    }
}

