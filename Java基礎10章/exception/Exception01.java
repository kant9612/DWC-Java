package exception;

public class Exception01 {
    public static void main(String[] args) {
        System.out.println("100 ÷ 0 は？");
        int result = 100 / 0;
        System.out.println("計算結果" + result);
        System.out.println("プログラム終了");
    }
}

// TODO: packageを理解し、ファイルの配置等構造を見直す