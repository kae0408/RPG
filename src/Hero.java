
public class Hero {
	//フィールドの宣言
	String name ;
	int hp;
	Sword sword;
	static int money;//static は静的フィールド
	
	//操作の定義
	static void setRandomMony() {
		Hero.money = (int) (Math.random() * 100);
	}
	
	
	//void 引き数なしの時に使う
	void attack() {}
	void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終的HPは" + this.hp + "でした");
	}
	void sit (int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec +"秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println("５のダメージ");
	}
	void sleep() {
		this.hp =100;
		System.out.println(this.name + "は眠って回復した。");
	}
	
	//newされた直後に自動実行される
	Hero(String name){
		this.hp = 100;
		this.name =name;
	}
	
	Hero(){
		this.hp = 100;
		this.name = "ダミー";
	}
	
	
	
}
