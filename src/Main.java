
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero.setRandomMony();
		System.out.println(Hero.money);
		Hero h1 = new Hero();
		System.out.println(h1.money);
		
		
		//剣
		Sword s =new Sword();
		s.name = "炎の剣";
		s.damage =10;
		
		//勇者をインスタンス
		Hero h = new Hero("ミナト");  //hero.javaでHero(String name){してるからここに名前入れるとコンストラクタに入れなくても良い
		System.out.println("勇者" + h.name + "を生みだしました");
		//勇者をインスタンス
		Hero h2 = new Hero("あさか");
		//h2.name ="あさか";
		h2.hp =100;
		Hero h3 =new Hero();
		System.out.println("勇者" + h3.name + "を生みだしました");
		//フィールドに初期値をセット
		//h.name = "ミナト";
		h.sword =s;
		Hero.money = 100;
		System.out.println(Hero.money);//静的フィールドアクセス
		System.out.println(h.money);//静的フィールドアクセス
		h.money = 300;
		System.out.println(h2.money + "h2");//静的フィールドアクセス
		System.out.println(h.name + "の現在hp" + h.hp);//newされた時自動で代入
		System.out.println(h.name + "の現在の武器は" + h.sword.name);
		
		
		
		
		Wizard w =new Wizard();
		w.name = "すが";
		w.hp=50;
		w.heal(h);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h2.name + "の現在のHP" + h2.hp);
		
		
		//おばけきのこ1をインスタンス
		Matango m1 =new Matango();
		//フィールドに初期値をセット
		m1.hp=50;
		m1.suffix='A';
		//おばけきのこ2をインスタンス
		Matango m2 =new Matango();
		//フィールドに初期値をセット
		m2.hp=50;
		m2.suffix='B';
		
		
		
		//勇者のメソッドを呼び出して
		h.sit(5);
		m1.run();
		m2.run();
		h.slip();
		h.sit(25);
		h.run();
		
		
		//勇者をインスタンス
		
		//フィールドに初期値をセット
		
		
		
		//勇者2をインスタンス
		
		//フィールドに初期値をセット
		
		
		//勇者2をインスタンス
		
		//フィールドに初期値をセット
		

		
		
		
		
		
		
		
		//おばけキノコ１のメソッドを呼び出して
		
		//おばけキノコ１のメソッドを呼び出して
		
		//勇者のメソッドを呼び出して
		
		//Clericのメソッドを呼び出して
		
		
	}

}
