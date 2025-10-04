package Singleton;

public class Singleton {
	
	//同じ型のインスタンスがprivateなクラス変数として定義されている
	private static Singleton singleton = new Singleton();
	
	//外部からの生成ができないようにコンストラクタをprivateにする
	private Singleton() {
		//インスタンス精製時の初期処理
		System.out.println("インスタンスを生成しました。");
	}
	
	//同じインスタンスを返すためのgetterメソッド
	public static Singleton getInstance() {
		return singleton;
	}
}
