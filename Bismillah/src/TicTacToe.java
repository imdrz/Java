import java.util.Scanner;

class TicTacToe {
    private boolean[] board = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    private Scanner scanner;

    public TicTacToe(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        String token = "X";
        boolean playAgain = true;
        while (playAgain == true) {
            boardReset();
            renderBoard();
            System.out.println(token + " has first move.");
            while (hasWinner() == false) {
                System.out.println("Enter the coordinate position to put your token (X,Y): ");
                String line = scanner.nextLine();
                String[] inputs = line.split(",");
                int slot = ((Integer.valueOf(inputs[1])-1)*3)+(Integer.valueOf(inputs[0]));
                if (addToken(slot, token)) {
                    if (token == "X") {
                        token = "O";
                    } else {
                        token = "X";
                    }
                } else {
                    System.out.println("That spot is already taken or the slot number is too large.");
                }
                renderBoard();
            }
            System.out.println("Do you want to play again? (Y/N)");
            String line = scanner.nextLine();
            if (line.startsWith("Y") || line.startsWith("y")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        }
    }

    public void renderBoard() {
        System.out.println("# 1 2 3");
        System.out.print("1 ");
        for (int x = 0; x < 18; x+=2) {
            if (x == 6) {
                System.out.print("\n2 ");
            } else if (x == 12) {
                System.out.print("\n3 ");
            }
            if (this.board[x] == false && this.board[x+1] == false) {
                System.out.print("- ");
            } else if (this.board[x] == false && this.board[x+1] == true) {
                System.out.print("X ");
            } else {
                System.out.print("O ");
            }
        }
        System.out.println();
    }
    public boolean addToken(int slot, String token) {
        if (slot > 9) {
            return false;
        } else {
            slot = slot - 1;
            if (getToken(slot) == "Empty") {
                if (token == "X") {
                    boolean first = false;
                    boolean second = true;
                    this.board[slot*2] = first;
                    this.board[slot*2+1] = second;
                } else if (token == "O") {
                    boolean first = true;
                    boolean second = false;
                    this.board[slot*2] = first;
                    this.board[slot*2+1] = second;
                }
                return true;
            } else {
                return false;
            }
        }
        
    }
    public boolean hasWinner() {
        if (checkWinner("X")) {
            System.out.println("X Wins.");
            return true;
        } else if (checkWinner("O")) {
            System.out.println("O Wins.");
            return true;
        } else if (getToken(0) != "Empty" && getToken(1) != "Empty" && getToken(2) != "Empty" && getToken(3) != "Empty" && getToken(4) != "Empty" && getToken(5) != "Empty" && getToken(6) != "Empty" && getToken(7) != "Empty" && getToken(8) != "Empty") {
            System.out.println("Tie.");
            return true;
        } else {
            return false;
        }
    }
    public String getToken(int slot) {
        if (this.board[slot*2] == false && this.board[slot*2+1] == false) {
            return "Empty";
        } else if (this.board[slot*2] == false && this.board[slot*2+1] == true) {
            return "X";
        } else {
            return "O";
        }
    }
    public boolean checkWinner(String token) {
        if (getToken(0) == token && getToken(1) == token && getToken(2) == token) {
            return true;
        } else if (getToken(3) == token && getToken(4) == token && getToken(5) == token) {
            return true;
        } else if (getToken(6) == token && getToken(7) == token && getToken(8) == token) {
            return true;
        } else if (getToken(0) == token && getToken(3) == token && getToken(6) == token) {
            return true;
        } else if (getToken(1) == token && getToken(4) == token && getToken(7) == token) {
            return true;
        } else if (getToken(2) == token && getToken(5) == token && getToken(8) == token) {
            return true;
        } else if (getToken(0) == token && getToken(4) == token && getToken(8) == token) {
            return true;
        } else if (getToken(2) == token && getToken(4) == token && getToken(6) == token) {
            return true;
        } else {
            return false;
        }
    }
    public void boardReset() {
        this.board = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }
}
