import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

class FileIOExample{

    public static  void main(String[] args)throws IOException{
	FileReader inFileReader = new FileReader("infile.dat");
	Scanner inFile = new Scanner(inFileReader);



	PrintWriter outFile = new PrintWriter(new FileWriter("outfile.dat"));

	while (inFile.hasNextLine()){
	    outFile.println(inFile.nextLine());

	}
	inFile.close();
	outFile.close();
    }

}
