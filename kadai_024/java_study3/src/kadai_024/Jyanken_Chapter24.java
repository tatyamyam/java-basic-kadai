package kadai_024;

import java.util.Scanner;


public class Jyanken_Chapter24 {
	public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String myChoice;
        do {
            System.out.println("自分のじゃんけんの手を入力してください");
            System.out.println("グーはrockのrを、チョキはscissorsのsを、パーはpaperのpを入力しましょう");
            myChoice = scanner.nextLine();
        } while (!myChoice.equals("r") && !myChoice.equals("s") && !myChoice.equals("p"));
        return myChoice;
    }

    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        int randomIndex = (int) Math.floor(Math.random() * 3);
        return choices[randomIndex];
    }

    public void playGame(String myChoice, String opponentChoice) {
        System.out.println("自分の手は " + convertChoice(myChoice) + "，対戦相手の手は " + convertChoice(opponentChoice));
        String result = determineWinner(myChoice, opponentChoice);
        System.out.println("結果: " + result);
    }

    public static String convertChoice(String choice) {
        switch (choice) {
            case "r":
                return "グー";
            case "s":
                return "チョキ";
            case "p":
                return "パー";
            default:
                return "不明な手";
        }
    }

    public static String determineWinner(String playerChoice, String opponentChoice) {
        if (playerChoice.equals(opponentChoice)) {
            return "引き分けです";
        } else if ((playerChoice.equals("r") && opponentChoice.equals("s"))
                || (playerChoice.equals("s") && opponentChoice.equals("p"))
                || (playerChoice.equals("p") && opponentChoice.equals("r"))) {
            return "自分の勝ちです";
        } else {
            return "対戦相手の勝ちです";
        }
    }
}