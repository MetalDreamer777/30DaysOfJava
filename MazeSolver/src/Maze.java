import java.util.LinkedList;

public class Maze {
	public int[][] maze = {{0}};
	public Position start = new Position(0,0);
	public LinkedList<Position> path = new LinkedList<Position>();
	
	private static int[][] mazeSolution = {{0}};
	
	public int[][] getMaze() {
		return maze;
	}
	
	public void setMaze(int[][] m) {
		maze = m;
		if (isStart(m)) {
			start = getStart(m);
		}
	}
	
	public void setStart(int y, int x) {
		if (isStart(maze)) {
			Position s = getStart(maze);
			maze[s.y][s.x] = 1;
		}
		start = new Position(y,x);
		maze[start.y][start.x] = 3;
	}
	
	public static boolean isStart(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int k = 0; k < m[i].length; k++) {
				if (m[i][k] == 3) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static Position getStart(int[][] m) {
		Position start = new Position(0, 0);
		for(int i = 0; i < m.length; i++) {
			for(int k = 0; k < m[i].length; k++) {
				if (m[i][k] == 3) {
					start.y = i;					
					start.x = k;
					return start;
				}
			}
		}
		return start;
	}
	
	
	
	public static void setMazeSolution(int[][] m) {
		mazeSolution = m;
	}
	
	public static int[][] getMazeSolution(int[][] m) {
		return mazeSolution;
	}
	
	public static void printMaze(Maze m) {
		print(m.maze);
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
				case "1": // path
					System.out.print("  ");
					break;
				case "-1": // solution path
					System.out.print(". ");
					break;
				case "-2": // backtracked path
					System.out.print("  ");
					break;	
				case "2": //end
					System.out.print("X ");
					break;
				case "3": //start
					System.out.print("O ");
					break;
				}
			}
			System.out.println("#");
		}
		
		for(int i = 0; i < (m[0].length + 2); i++) System.out.print("# ");
		System.out.println();
		
	}
}

