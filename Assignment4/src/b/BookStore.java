package b;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class BookStore {
	private String ownerName;
	private ArrayList<Book> books;
	public BookStore(String ownerName) {
		this.ownerName = ownerName;
		this.books=new ArrayList<Book>();
		init();
	}
	public void printBookStore() {
		System.out.println("--------------");
		System.out.println("owner name: "+ ownerName);
		System.out.println("----------------");
		for(Book book: books) {
			System.out.println(book);
		}
	}
	public boolean hasBook(Book b){
		boolean isFound=false;
		for(Book book: books) {
			if(book.compareTo(b)==0) {
				isFound=true;
				break;
			}
		}
		return isFound;
	}
	public void sort() {
		
	}
	private void init() {
		String line=null;
		Book temp=null;
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			while((line=br.readLine())!=null) {
				String tokens[]=line.split(":");
				temp=new Book(Integer.parseInt(tokens[0]), tokens[1], tokens[2]);
				books.add(temp);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}

		