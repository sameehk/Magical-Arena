public class Main {
    public static void main(String[] args) {
        // Create two Player objects with different attribute
        Player playerA = new Player("PlayerA",50,5,10);
        Player playerB = new Player("PlayerB",100,10,5);

        // Display initial status of both players
        System.out.println("Initial Status:");
        playerA.displayStatus();
        playerB.displayStatus();

        // Determine the initial attacker and defender based on health
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;
     
         // Run the battle until one of the players is defeated
        while (playerA.isAlive() && playerB.isAlive()){
            // Attacker attacks defender
            attacker.attackPlayer(defender);

            // Swap roles for the next round
            Player temp = attacker;
            attacker =defender;
            defender = temp;

            // Display status after each attack
            System.out.println("\nStatus after attack:");
            playerA.displayStatus();
            playerB.displayStatus();


        }

        // Determine and display the winner
        if (playerA.isAlive()) {
            System.out.println("\nPlayer A wins!");

        } else {
            System.out.println("\nPlayer B wins!");

        }


    }
    
}
