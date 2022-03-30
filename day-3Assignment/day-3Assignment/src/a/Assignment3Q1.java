package a;

public class Assignment3Q1 {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
	
		try {
			FileReader fr=new FileReader("/home/raj/Desktop/photo/bar.mp4");
			FileWriter fw=new FileWriter("/home/raj/Desktop/photo/bar2.mp4");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
//		
		System.out.println("file is written");
	}
}


