
import java.util.ArrayList;
import java.util.LinkedList;

public class MazeSolver {
	
	public static void main(String[] args) {
		
		ArrayList<Maze> mazes = new ArrayList<Maze>();
		
		Maze m = new Maze();
		m.maze = Mazes.maze1;
		m.start = new Position(1,10);
		m.path = new LinkedList<Position>();
		
		Maze n = new Maze();
		n.maze = Mazes.maze2;
		n.start = new Position(1,10);
		n.path = new LinkedList<Position>();
		
		mazes.add(m);
		mazes.add(n);
		
		int i = 0;
		while (i < mazes.size()) {
			Maze e = mazes.get(i);
			
			System.out.println("New Maze");
			Maze.printMaze(e);
		
			if (solveMaze(e)) {
				System.out.println("You won!");
				Maze.printSolution(e.maze);
				System.out.println();
			} else {
				System.out.println("No Path\n");
			}
			
			i++;
		}
		

		
	}
	
	
	private static boolean solveMaze(Maze m) {
		Position p = m.start;
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
			if(isValid(y+1, x, m)) {
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
			if(isValid(y, x-1, m)) {
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
			if(isValid(y-1, x, m)) {
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
			if(isValid(y, x+1, m)) {
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
	
	private static boolean isValid(int y, int x, Maze m) {
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
