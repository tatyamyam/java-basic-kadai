package kadai_024;

import java.util.Scanner;


public class Jyanken_Chapter24 {
	public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String myChoice;
        do {
            System.out.println("�����̂���񂯂�̎����͂��Ă�������");
            System.out.println("�O�[��rock��r���A�`���L��scissors��s���A�p�[��paper��p����͂��܂��傤");
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
        System.out.println("�����̎�� " + convertChoice(myChoice) + "�C�ΐ푊��̎�� " + convertChoice(opponentChoice));
        String result = determineWinner(myChoice, opponentChoice);
        System.out.println("����: " + result);
    }

    public static String convertChoice(String choice) {
        switch (choice) {
            case "r":
                return "�O�[";
            case "s":
                return "�`���L";
            case "p":
                return "�p�[";
            default:
                return "�s���Ȏ�";
        }
    }

    public static String determineWinner(String playerChoice, String opponentChoice) {
        if (playerChoice.equals(opponentChoice)) {
            return "���������ł�";
        } else if ((playerChoice.equals("r") && opponentChoice.equals("s"))
                || (playerChoice.equals("s") && opponentChoice.equals("p"))
                || (playerChoice.equals("p") && opponentChoice.equals("r"))) {
            return "�����̏����ł�";
        } else {
            return "�ΐ푊��̏����ł�";
        }
    }
}