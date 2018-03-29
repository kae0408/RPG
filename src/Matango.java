
public class Matango {
	//フィールドの宣言
	int hp;
	int level = 10;
	char suffix;
	//宣言と一緒に値の導入をすると、そのフィールドの初期値が設定できる
	
	void run() {
		System.out.println("おばけきのこ" + this.suffix + "は逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終的HPは" + this.hp + "でした");
	}
	

	
}
