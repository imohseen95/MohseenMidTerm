package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		String textFile = "/Users/rejuanaahmed/MidtermNovember2021/src/data/self-driving-car";
		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		//String path = "src/data/self-driving-car.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(textFile);
		}catch (Exception ex1){
			System.out.println("file is not found on given path");
		}
		try {
			br = new BufferedReader(fr);
		}catch (Exception ex2){
			System.out.println("File is not readable");
		}
		String text = "";

		while ((text =br.readLine())!= null) {
			System.out.println(text);


		}

	}
}