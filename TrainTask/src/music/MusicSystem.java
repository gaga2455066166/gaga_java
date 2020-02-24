package music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MusicSystem {
	static ArrayList<Songs> songList = new ArrayList<Songs>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Songs song1 = new Songs("����1");
		Songs song2 = new Songs("����2");
		Songs song3 = new Songs("����3");
		Songs song4 = new Songs("����4");
		Songs song5 = new Songs("����5");

		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		songList.add(song4);
		songList.add(song5);
		while(true) {
			menu();
		}
		
		
		
	}
	
	/**
	 * 0��Ӹ���
	 */
	public static void addMusic() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ӵĸ�������");
		String songString = scanner.nextLine();
		Songs songs = new Songs(songString);
		songList.add(songs);
		System.out.println("�ѽ���Ӹ�����" + songString);
		System.out.println("��ǰ�����б����£�");
		//outSongs();
		//menu();
	}
	
	
	/**
	 * 1�������ö�
	 */
	public static void topSong() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ�ö��ĸ�������");
		String songString = scanner.nextLine();
		Songs songs = new Songs(songString);
		if(songList.indexOf(songs) != -1) {
			int index = songList.indexOf(songs);
			songList.add(0, songs);
			songList.remove(index+1);
		}else {
			System.out.println("�����ڸø�����");
		}
		System.out.println("���ö�������" + songString);
		System.out.println("��ǰ�����б����£�");
		//outSongs();
		//menu();
	}
	
	
	/**
	 * 2ǰ��һλ
	 * 
	 */
	
	public static void forward() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫǰ��һλ�ĸ�������");
		String songString = scanner.nextLine();
		Songs songs = new Songs(songString);
		if(songList.indexOf(songs) != -1) {
			int index = songList.indexOf(songs);
			songList.add(index-1, songs);
			songList.remove(index+1);
		}else {
			System.out.println("�����ڸø�����");
			//menu();
			return ;
		}
		System.out.println("���ö�������" + songString);
		System.out.println("��ǰ�����б����£�");
		//outSongs();
		
		//menu();
	}
	
	/**
	 * �����ǰ�ĸ���
	 */
	public static void outSongs() {
		Iterator<Songs> it = songList.iterator();
		while (it.hasNext()) {
			Songs song = it.next();
			System.out.println(song);
		}
	}
	
	
	/**
	 * 
	 */
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------welcome---------");
		System.out.println("0.��Ӹ���");
		System.out.println("1.�������ö�");
		System.out.println("2.��������ǰ�ƶ�һλ");
		System.out.println("3.�˳�");
		System.out.println("��ʼ�赥���£�");
		
		outSongs();
		
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 0:
			addMusic();
			break;
		case 1:
			topSong();
			break;
		case 2:
			forward();
			break;
		case 3:
			System.out.println("---------�ݰ�---------");
			System.exit(0);
			break;
		}
	}
}
