import java.io.*;
public class WordCounter {
    public static void main(String[] args){
        String inputFile = "inputt.txt";
        String outputFile= "wwordcount.txt";

        try{
            BufferedWriter writer= new BufferedWriter(new FileWriter(inputFile));
            writer.write("Hello");
            writer.newLine();
            writer.write("hai");
            writer.close();

            int count = 0;
            String line;

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            if ((line = reader.readLine())!=null){
                line = line.trim();

                if (!line.isEmpty()){
                String[] words = line.split("\s+");
                count+=words.length;
            }
        }
            reader.close();
            BufferedWriter writer1 = new BufferedWriter(new FileWriter(outputFile));
            writer1.write("Total words");
            wri
    }
}