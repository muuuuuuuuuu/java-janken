package janken;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
	    description();
	    sca();
     }


	 public static void jp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("名前を入力してください！\n1人目");
		String name = sc.nextLine();
		System.out.println("名前を入力してください！\n2人目");
		String name2 = sc.nextLine();
		System.out.println("それでは始めちゃってください！\nさーいしょっからっ！！！");

		System.out.println("1人目入力");
		int a = sc.nextInt();
		System.out.println("2人目入力");
		int b = sc.nextInt();

		if((a > 3) && (b > 3)) {
			System.out.println("あっ！！！1,2,3以外のボタンで一緒の数字を押しましたね？\n強制終了じゃー！！");
		} else if ((a == 1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) {
			System.out.println(name + "の勝ち!!!");
		} else if ((b == 1 && a == 2) || (b == 2 && a == 3) || (b == 3 && a == 1)) {
			System.out.println(name2 + "の勝ち!!!");
		} else if (a == b) {
			System.out.println("あいこ！！");
		} else {
			System.out.println("あっ！！！どっちか1人\n1,2,3以外のボタンを押しましたね？\n強制終了！！！！！");
		}
     }

     public static void sca() {
	   Scanner sc = new Scanner(System.in);
	   int i = sc.nextInt();
	   if(i == 1) {
		  jp();
	   } else {
		  description2();
	   }
     }


     public static void description() {
	    System.out.println("今からじゃんけんをしましょうか！\nやり方をちょっと説明しますね！");
	    System.out.println("パソコンのキーボードの1と2と3を押してじゃんけんをします！");
	    System.out.println("1がグー！\n2がチョキ！\n3がパーになります");
	    System.out.println("理解出来ました？\n理解出来たら 1 を押してください");
	    System.out.println("理解出来なかったら 2 を押してください\n分からなかったら何回でも同じ事説明しますよ！！");
     }

     public static void description2() {
       System.out.println("やれやれd(￣ ￣)");
	   description();
	   sca();
     }

}

