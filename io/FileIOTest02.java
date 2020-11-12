package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOTest02 {

	public static void main(String[] args) throws IOException {
		
		Scanner in=new Scanner(System.in);
		System.out.print("문자입력: ");
		String c=in.nextLine();
		
		File file=new File("data.txt");
		FileWriter fw=new FileWriter(file);
		//파일 연결
		
		fw.write(c);
		
		fw.close();//연결해제
		
		
		
	}

}
