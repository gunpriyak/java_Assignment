package a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PrintWordsWithTheFrequencyUsingMap {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Map<String, Integer> words=new TreeMap<>();
		
		try(BufferedReader br= new BufferedReader(new FileReader(new File("Story.txt")))){
			String line = null;
			while((line=br.readLine())!=null) {
				String tokens[]=line.split(" ");
				for(String token: tokens) {
				if(words.containsKey(token)) {
					Integer freq=words.get(token);
					words.put(token,  ++freq);
				}
				else {
					words.put(token,new Integer(1));
				}
			}
		}
	}catch(FileNotFoundException e) {
		System.out.println("File is not found");
	}
		
		catch(IOException ex) {
			System.out.println("some io exception");
		} catch(Exception ex) {
			System.out.println("some another problem occured");
		}
		Set<Entry<String, Integer>> entrySet = words.entrySet();
		for(Entry <String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}

}
}
