class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

    // for文を用いて、「私の名前は◯◯です」と出力してください
    for(int i = 0; i < names.length; i++){
      System.out.println("私の名前は" + names[i] +"です"); //変数iを用いて配列から取り出す時、取り出すものが1つでも配列名（複数形）で取り出す
    }

  }
}