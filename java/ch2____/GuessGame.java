package ch2____;

public class GuessGame {

    Player [] players;

    public void startGame() {

        int targetNumber = (int) (Math.random() * 10);
        int joinTotal = 5;
        joinPlayers(joinTotal);

        while(true) {
            for(int i = 0 ; i < joinTotal ; ++i) {
                if (targetNumber == players[i].guess()) {
                    showWinner(i + 1);
                    return;
                }
            }
            showAgain();
        }
    }

    private void joinPlayers(int number) {

        players = new Player[number];
        for(int i = 0 ; i < number ; ++i) {
            players[i] = new Player();
        }
    }

    private void showWinner(int playerNo) {

        String tags = "";
        tags += "\nWe have winner!";
        tags += "\nWinner is " + playerNo + " player.";
        tags += "\nGame over!!";
        System.out.println(tags);
    }

    private void showAgain() {
        
        String tags = "";
        tags = "\nPlayers will have to try again.";
        System.out.println(tags);
    }
}
