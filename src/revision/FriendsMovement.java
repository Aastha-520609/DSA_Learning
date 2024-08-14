package revision;
import java.util.*;
public class FriendsMovement {
	public static int calculatedSteps(int D) {
		int ramPosition = 0;
		int shyamPosition = D;
		int ramSteps = 0;
		int shyamSteps = 0;
		int shyamMoves = 1;
		
		while(ramPosition < shyamPosition) {
			ramPosition++;
			ramSteps++;
			
			if(shyamPosition - shyamMoves >= ramPosition) {
				shyamPosition -= shyamMoves;
				shyamMoves++;
			}
			
			shyamSteps++;
		}
		
		return ramSteps + shyamSteps;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int D = sc.nextInt();
			System.out.println(calculatedSteps(D));
		}
	}
}
