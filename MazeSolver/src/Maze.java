
public class Maze {
	private static int[][] set = {{}};
	
	private static int[][] mazeSolution = {{}};
	
	public int[][] getMaze() {
		int[][] x = Maze.set;
		return x;
	}
	
	public static void setMaze(int[][] m) {
		set = m;
	}
	
	public static void setMazeSoved(int[][] m) {
		mazeSolution = m;
	}
	
	public static void printMaze(int[][] m) {
		print(Maze.set);
	}
	
	public static void printSolution(int[][] m) {
		print(Maze.mazeSolution);
	}
	
	private static void print(int[][] m) {
		
		for(int i = 0; i < (m[0].length + 2); i++) System.out.print("# ");
		System.out.println();
		
		for(int i = 0; i < m.length; i++) {
			
			System.out.print("# ");
			for(int k = 0; k < m[i].length; k++) {
				
				String x = Integer.toString(m[i][k]);
				
				switch (x) {
				default:
					System.out.print(Color.RED + "? " + Color.RESET);
					break;
				case "0": // wall
					System.out.print("# ");
					break;
				case "1": // unused path
					System.out.print("  ");
					break;
				case "-1": // path
					System.out.print(". ");
					break;	
				case "2": //end
					System.out.print("X ");
					break;
				case "-2": //start
					System.out.print("O ");
					break;
				case "3": // backtracked path
					System.out.print("  ");
					break;
				}
			}
			System.out.println("#");
		}
		
		for(int i = 0; i < (m[0].length + 2); i++) System.out.print("# ");
		System.out.println();
		
	}
}
