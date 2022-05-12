package kr.hs.dgsw.java.dept2.d0511;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {
	public void studyFileData() throws Exception {
		File file = new File("D:/sample/sample.txt");
		/* 파일 이름 알기 */
		String name = file.getName();
		System.out.println("파일 이름 알기");
		System.out.println(name);
		System.out.println();

		/* 파일 경로 알기 */
		File file2 = new File("./abc.txt");
		String path = file2.getPath();
		String absolutPath = file2.getAbsolutePath();
		String canonicalPath = file2.getCanonicalPath();
		System.out.println("파일 경로 알기");
		System.out.println("getPath" + path);
		System.out.println("getAbsolutePath()" + absolutPath);
		System.out.println("canonicalPath()" + canonicalPath);
		System.out.println();

		/* 파일의 존재 여부 */
		boolean exist = file.exists();
		System.out.println("파일 존재 여부");
		System.out.println(name + " " + exist);
		System.out.println(file2.getName() + " " + file2.exists());
		System.out.println();

		/* 파일의 크기 */
		long size = file.length();
		System.out.println("파일 크기");
		System.out.println(name + " " + size);
		System.out.println(file2.getName() + " " + file2.length());
		System.out.println();
		
		/*파일의 수정 시간*/
		long time = file.lastModified();
		System.out.println("수정된시간");
		System.out.println(name + " " + formatDate(convertTiDate(time)));
		System.out.println(file2.getName() + " " + file2.lastModified());
		System.out.println();
		
		
		
	}
	
	public void studyManage() throws Exception{
		/*파일 만들기*/
		File file = new File("D:/sample/hello.txt");
		boolean created = file.createNewFile();
		System.out.println("파일 만들기");
		System.out.println(file.getName() + " " + created);
		System.out.println();
		
		/*파일 삭제*/
		boolean deleted = file.delete();
		System.out.println("파일 삭제하기");
		System.out.println(file.getName() + " " + deleted);
		System.out.println();
		
		/*디렉토리 만들기*/
		File dir = new File("D:/sample/subDir1");
		created = dir.mkdir();
		System.out.println("디렉토리 만들기");
		System.out.println(dir.getName() + " " + created);
		System.out.println();
		
		/*디렉토리 삭제*/
		deleted = dir.delete();
		System.out.println("디렉토리 삭제");
		System.out.println(dir.getName() + " " + deleted);
		System.out.println();
		
		/*디렉토리 만들기 2*/
		File dir2 = new File("D:/sample/child/images");
		created = dir2.mkdirs();
		System.out.println("디렉토리 만들기2");
		System.out.println(dir2.getName() + " " + created);
		System.out.println();
		
		/*파일과 디렉토리 구분하기*/
		File some1 = new File("C:/90_ETC/javaStudy/sample.txt");
		File some2 = new File("C:/90_ETC/javaStudy/child");
		File some3 = new File("C:/90_ETC/javaStudy/void");
		
		System.out.println("파일과 디렉토리 구분하기");
		System.out.println(some1.getName() + "  " + some1.isFile() + "  " + some1.isDirectory());
		System.out.println(some2.getName() + "  " + some2.isFile() + "  " + some2.isDirectory());
		System.out.println(some3.getName() + "  " + some3.isFile() + "  " + some3.isDirectory());
	
		/*파일 이름 변경*/
		File sample = new File("D:/sample/sample.txt");
		File newName = new File("D:/sample/한글.txt");
		sample.renameTo(newName);
	}
	
	public void studyList() {
		File dir = new File("C:/");
		String[] children = dir.list();
		for(String name : children) {
			System.out.println(name);
		}
		System.out.println("===================================");
		
		File[] childrenFiles = dir.listFiles();
		for(File file:childrenFiles) {
			System.out.println(file.getAbsolutePath());
		}
	}
	
	public void showFileData(File file) throws Exception{
		String lastTime = formatDate(convertTiDate(file.lastModified()));
		long scale = file.length();
		String filename = file.getName();
		
		System.out.println(lastTime+" "+scale+" "+filename);
	}
	
	public Date convertTiDate(long unixTime) {
		return new Date(unixTime);
	}
	
	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}

	public static void main(String[] args) throws Exception {
		FileStudy fileStudy = new FileStudy();
		File file = new File("D:/sample/sample.txt");
//		fileStudy.studyFileData();
		fileStudy.studyManage();
//		fileStudy.showFileData(file);
//		fileStudy.studyList();
	}
}
