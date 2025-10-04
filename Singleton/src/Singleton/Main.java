package Singleton;

public class Main {

	public static void main(String[] args) {
		
		//getInstanceメソッドでインスタンス取得
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		//インスタンスを生成しようとするとコンパイルエラーとなる(コンストラクター Singleton() は不可視です)
		//Singleton s3 = new Singleton();
		
		//インスタンスを比較し、同一であるかどうかチェック
		if (s1 == s2) {
			System.out.println("インスタンスは同じです。");
		} else {
			System.out.println("インスタンス箱となります。");
		}
	}
	/*実行結果
	  インスタンスを生成しました。
	  インスタンスは同じです。*/

}
