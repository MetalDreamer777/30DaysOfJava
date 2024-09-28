
import java.util.LinkedList;

public class MazeSolver {
	
	static Maze m = new Maze();
	
	public static void main(String[] args) {
		
		m.maze = Mazes.maze1;
		m.start = new Position(1,10);
		m.path = new LinkedList<Position>();
		
		Maze.printMaze(m.maze);
		
		if (solveMaze(m.start)) {
			System.out.println("You won!");
			Maze.printSolution(m.maze);
		} else {
			System.out.println("No Path");
		}
		
	}
	
	
	private static boolean solveMaze(Position p) {
		m.path.push(p);
		
		Boolean run = true;
		while(run == true) {
			int x = m.path.peek().x;
			int y = m.path.peek().y;
			
			if (m.maze[y][x] == 2) {
				System.out.println("Found end at start.");
				run = false;
				continue;
			}
			
			m.maze[y][x] = -1;

			//down
			if(isValid(y+1, x)) {
				if(m.maze[y+1][x]==2) {
					System.out.println(Color.GREEN + "Moved Down" + Color.RESET + "\n");
					run = false;
					continue;
				}else if(m.maze[y+1][x]==1) {
					System.out.println(Color.GREEN + "Moved Down" + Color.RESET);
					m.path.push(new Position(y+1, x));
					continue;
				}
			}

			//left
			if(isValid(y, x-1)) {
				if(m.maze[y][x-1]==2) {
					System.out.println(Color.CYAN + "Moved Left" + Color.RESET + "\n");
					run = false;
					continue;
				}else if(m.maze[y][x-1]==1) {
					System.out.println(Color.CYAN + "Moved Left" + Color.RESET);
					m.path.push(new Position(y, x-1));
					continue;
				}
			}

			//up
			if(isValid(y-1, x)) {
				if(m.maze[y-1][x]==2) {
					System.out.println(Color.YELLOW + "Moved Up" + Color.RESET + "\n");
					run = false;
					continue;
				}else if(m.maze[y-1][x]==1) {
					System.out.println(Color.YELLOW + "Moved Up" + Color.RESET);
					m.path.push(new Position(y-1, x));
					continue;
				}
			}	

			//right
			if(isValid(y, x+1)) {
				if(m.maze[y][x+1]==2) {
					System.out.println(Color.PURPLE + "Moved Right" + Color.RESET + "\n");
					run = false;
					continue;
				}else if(m.maze[y][x+1]==1) {
					System.out.println(Color.PURPLE + "Moved Right" + Color.RESET);
					m.path.push(new Position(y, x+1));
					continue;
				}
			}
			
			//backtrack
			System.out.println(Color.RED + "Moved Back" + Color.RESET);
			m.maze[y][x] = -2;
			m.path.pop();
			if(m.path.size() == 0) {
				run = false;
				return false;
			}
		}
		
		if (m.maze[m.start.y][m.start.x] == -1) {
			m.maze[m.start.y][m.start.x] = 3;
		}
		Maze.setMazeSolution(m.maze);
		return true;
	}
	
	private static boolean isValid(int y, int x) {
		if(y < 0 || y >= m.maze.length) {
/*
			System.out.println("Out Of Bounds y = " + y + " | 0 - " + (maze.length - 1) + " |");
//*/
			return false;
		} else if(x < 0 || x >= m.maze[y].length) {
/*
			System.out.println("Out Of Bounds x = " + x + " | 0 - " + (maze[y].length - 1) + " |");
//*/
			return false;
		}
/*
		System.out.println("In Bounds");
//*/
		return true;
	}
		
}
