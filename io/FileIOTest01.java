package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest01 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("img_1.jpg");
		FileInputStream fis=new FileInputStream(file);
		//input스트림 연결
		//fis=null;
		
		//마냑에 파일리 존재하지 않으면 파일을 자동으로 만든다.
		File des=new File("img_1_copy.jpg");
		FileOutputStream fos=new FileOutputStream(des);
		
		//output스트림 연결
		int data;
		byte[] buffer = new byte[1024];
		long s=System.nanoTime();// 시간확인
		
		/*
		while((data=fis.read()) != -1) {
			//읽어들인 데이터가 -1(파일의 끝)이 아니면
			fos.write(data);
		}
		*/
		
		while((data=fis.read(buffer)) != -1) {
			//읽어들인 데이터가 -1(파일의 끝)이 아니면
			fos.write(buffer);
		}
		
		
		
		long e=System.nanoTime();
		System.out.println((double)(e-s)/1000000000+" 초");
		
		
		fis.close();//input스트림 해제
		fos.close();//output스트림 해제
		System.out.println("복사완료");
		
		
	}

}
