package Task_5_2;

public class Task_5_2 {
    public static void main(String[] args)
    {
        System.out.println("Can the rook move there? " + canMove("Rook", "A8", "H8")); //true
        System.out.println("Can the bishop move there? " + canMove("Bishop", "A7", "G1")); //true
        System.out.println("Can the queen move there? " + canMove("Queen", "C4", "D6")); //false
    }

    private static boolean canMove(String piece, String position, String move)
    {
        //if valid position and destination
        if (position.length() == 2 && move.length() == 2 &&
                position.charAt(0) >= 65 && position.charAt(0) <= 90 && move.charAt(0) >= 65 && move.charAt(0) <= 90 &&
                position.charAt(1) >= 49 && position.charAt(1) <= 56 && move.charAt(1) >= 49 && move.charAt(1) <= 56 &&
                !position.equals(move))
            //determining if our piece can move to its destination
            //toLowerCase because equals() cannot take uppercase characters
            if (piece.toLowerCase().equals("pawn"))
                //Pawn can travel one or two squares forward and eat enemies diagonally forward
                return position.charAt(1) >= 50 && position.charAt(1) <= 55 &&
                        Math.abs(position.charAt(0) - move.charAt(0)) <= 1 && Math.abs(position.charAt(1) - move.charAt(1)) == 1 ||
                        Math.abs(position.charAt(1) - move.charAt(1)) == 2 && position.charAt(0) - move.charAt(0) == 0 &&
                                (position.charAt(1) == 50 || position.charAt(1) == 55);
            else if (piece.toLowerCase().equals("horse"))
                //Horse can only travel in a L-shaped pattern
                return Math.abs((int) position.charAt(0) - (int) move.charAt(0)) == 1 && Math.abs(position.charAt(1) - move.charAt(1)) == 2 ||
                        Math.abs((int) position.charAt(0) - (int) move.charAt(0)) == 2 && Math.abs(position.charAt(1) - move.charAt(1)) == 1;
            else if (piece.toLowerCase().equals("bishop"))
                //Bishops can only travel diagonally
                return Math.abs((int) position.charAt(0) - (int) move.charAt(0)) == Math.abs(position.charAt(1) - move.charAt(1));
            else if (piece.toLowerCase().equals("rook"))
                //Rooks can only travel up-down or left-right in a straight line
                return position.charAt(0) == move.charAt(0) || position.charAt(1) == move.charAt(1);
            else if (piece.toLowerCase().equals("queen"))
                //Queen can travel up-down or left-right in a straight line and diagonally
                return position.charAt(0) == move.charAt(0) || position.charAt(1) == move.charAt(1) ||
                        Math.abs((int) position.charAt(0) - (int) move.charAt(0)) == Math.abs(position.charAt(1) - move.charAt(1));
            else if (piece.toLowerCase().equals("king"))
                //King can travel one square in all directions
                return Math.abs((int) position.charAt(0) - (int) move.charAt(0)) <= 1 && Math.abs(position.charAt(1) - move.charAt(1)) <= 1;
            else return false;
        else return false;
    }
}
