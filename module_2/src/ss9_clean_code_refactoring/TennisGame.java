package ss9_clean_code_refactoring;

public class TennisGame {
    private final static String LOVE = "Love";
    private final static String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private final static String FORTY = "Forty";
    private final static String ALL = "-All";

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerPoint, int secondPlayerPoint) {
        if (ruleWin(firstPlayerPoint, secondPlayerPoint)) {
            return (isScoringMethod(firstPlayerPoint) + ALL);
        } else if (isFourPoint(firstPlayerPoint, secondPlayerPoint)) {
            return (getGameResult(firstPlayerPoint, secondPlayerPoint));
        } else {
            return builderScore(firstPlayerPoint, secondPlayerPoint);
        }
    }

    public static boolean ruleWin(int firstPlayerPoint, int secondPlayerPoint) {
        return firstPlayerPoint == secondPlayerPoint;
    }

    public static String isScoringMethod(int score) {
        switch (score) {
            case 0:
                return LOVE ;
            case 1:
                return FIFTEEN ;
            case 2:
                return THIRTY ;
            case 3:
                return FORTY ;
            default:
                return "Deuce";
        }
    }

    public static boolean isFourPoint(int firstPlayerPoint, int secondPlayerPoint) {
        return firstPlayerPoint >= 4 || secondPlayerPoint >= 4;
    }

    public static String getGameResult(int firstPlayerPoint, int secondPlayerPoint) {
        int minusResult = firstPlayerPoint - secondPlayerPoint;
        if (minusResult == 1) {
            return "Advantage first player";
        } else if (minusResult == -1) {
            return "Advantage second player";
        } else if (minusResult >= 2) {
            return "Win for first player";
        } else {
            return "Win for second player";
        }
    }

    public static String builderScore(int firstPlayerPoint, int secondPlayerPoint) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                appendScore(result, firstPlayerPoint);
            } else {
                result.append("-");
                appendScore(result, secondPlayerPoint);
            }
        }
        return result.toString();
    }

    private static void appendScore(StringBuilder result, int score) {
        isScoringMethod(score);
        switch (score) {
            case 0:
                result.append(LOVE);
                break;
            case 1:
                result.append(FIFTEEN);
                break;
            case 2:
                result.append(THIRTY);
                break;
            case 3:
                result.append(FORTY);
                break;
        }
    }
}

