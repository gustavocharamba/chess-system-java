package application;

import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(scan);
				
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(scan);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			} catch (ChessException error) {
				
				System.out.println(error.getMessage());
				scan.nextLine();
			}
		}	
	}
}
