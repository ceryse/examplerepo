import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {
		int inputs, instructions, compNum, playagain;
		String[] choices = { "scissors", "paper", "rock" };
		String[] instruction = { "no", "yes" };
		instructions = JOptionPane.showOptionDialog(null,
				"Welcome to rock, paper, scissors!\nWould you like to know how to play?", "Instructions",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, instruction, instruction[0]);
		// yes=1, no=0
		if (instructions == 1) {
			JOptionPane.showMessageDialog(null,
					"We will both play either rock, paper, or scissors. \nRock beats scissors, scissors beats paper, and paper beats rock.");
		}
		do {
			inputs = 0;
			inputs = JOptionPane.showOptionDialog(null, "What would you like to play?", "Rock, Paper, or Scissors",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
			System.out.println(inputs);
			// rock=2, paper=1, scissors=0
			compNum = (int) (Math.random() * 3);
			if (compNum == 2) {
				JOptionPane.showMessageDialog(null, "I will play rock");
			} else if (compNum == 1) {
				JOptionPane.showMessageDialog(null, "I will play paper");
			} else {
				JOptionPane.showMessageDialog(null, "I will play scissors");
			}
			if (compNum == inputs) {
				JOptionPane.showMessageDialog(null, "It's a tie!");
			} else if ((compNum == 2 && inputs == 1) || (compNum == 0 && inputs == 2)
					|| (compNum == 1 && inputs == 0)) {
				JOptionPane.showMessageDialog(null, "You won!");
			} else if ((compNum == 1 && inputs == 2 || (compNum == 2 && inputs == 0))
					|| (compNum == 0 && inputs == 1)) {
				JOptionPane.showMessageDialog(null, "You lost!");
			}
			playagain = JOptionPane.showOptionDialog(null,
					"Welcome to rock, paper, scissors!\nWould you like to play again?", "Play again?",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, instruction, instruction[0]);
		} while (playagain == 1);
	}
}
