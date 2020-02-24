package music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MusicSystem {
	static ArrayList<Songs> songList = new ArrayList<Songs>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Songs song1 = new Songs("歌曲1");
		Songs song2 = new Songs("歌曲2");
		Songs song3 = new Songs("歌曲3");
		Songs song4 = new Songs("歌曲4");
		Songs song5 = new Songs("歌曲5");

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
	 * 0添加歌曲
	 */
	public static void addMusic() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要添加的歌曲名：");
		String songString = scanner.nextLine();
		Songs songs = new Songs(songString);
		songList.add(songs);
		System.out.println("已将添加歌曲：" + songString);
		System.out.println("当前歌曲列表如下：");
		//outSongs();
		//menu();
	}
	
	
	/**
	 * 1将歌曲置顶
	 */
	public static void topSong() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要置顶的歌曲名：");
		String songString = scanner.nextLine();
		Songs songs = new Songs(songString);
		if(songList.indexOf(songs) != -1) {
			int index = songList.indexOf(songs);
			songList.add(0, songs);
			songList.remove(index+1);
		}else {
			System.out.println("不存在该歌曲！");
		}
		System.out.println("已置顶歌曲：" + songString);
		System.out.println("当前歌曲列表如下：");
		//outSongs();
		//menu();
	}
	
	
	/**
	 * 2前移一位
	 * 
	 */
	
	public static void forward() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要前移一位的歌曲名：");
		String songString = scanner.nextLine();
		Songs songs = new Songs(songString);
		if(songList.indexOf(songs) != -1) {
			int index = songList.indexOf(songs);
			songList.add(index-1, songs);
			songList.remove(index+1);
		}else {
			System.out.println("不存在该歌曲！");
			//menu();
			return ;
		}
		System.out.println("已置顶歌曲：" + songString);
		System.out.println("当前歌曲列表如下：");
		//outSongs();
		
		//menu();
	}
	
	/**
	 * 输出当前的歌曲
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
		System.out.println("0.添加歌曲");
		System.out.println("1.将歌曲置顶");
		System.out.println("2.将歌曲往前移动一位");
		System.out.println("3.退出");
		System.out.println("初始歌单如下：");
		
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
			System.out.println("---------拜拜---------");
			System.exit(0);
			break;
		}
	}
}
