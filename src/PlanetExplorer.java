import java.util.ArrayList;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class PlanetExplorer {
	private int gridX;
	private int gridY;
	private char strana = 'N';
	private char smer = 'f';
	
	private ArrayList<String> pre = new ArrayList<String>();
	private int kordinataX=0;
	private int kordinataY=0;
	String[] prepreke;
	public PlanetExplorer(int x, int y){
		/*	x and y represent the size of the grid.
		 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
		 *  
			Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
			PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 */
			gridX=x;
			gridY=y;
			
			
			
		}
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
	 */
		gridX=x;
		gridY=y;
		prepreke = obstacles.split("(|\\,|\\)");
		
		
		
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		char[] komande = command.toCharArray();
		for(int i=0;i<komande.length;i++){
			if(komande[i]=='f'){
			switch(strana){
			case 'N':
				if(kordinataY==gridY){
					kordinataY=0;
				}else{
				kordinataY++;
				}
				return getCoordinates();
			case 'S':
				kordinataY--;
				return getCoordinates();
			case 'E':
				kordinataX++;
				return getCoordinates();
			case 'W':
				kordinataX--;
				return getCoordinates();
				
			}
			}
			if(komande[i]=='b'){
				switch(strana){
				case 'N':
					kordinataY--;
					return getCoordinates();
				case 'S':
					kordinataY++;
					return getCoordinates();
				case 'E':
					kordinataX--;
					return getCoordinates();
				case 'W':
					kordinataX++;
					return getCoordinates();
					
				}
			}
		}
		return "";
		
		
		
	}
	public String getCoordinates(){
		return "("+kordinataX+", "+kordinataY+", "+ strana +")";
	}

	public int getGridX() {
		return gridX;
	}

	public void setGridX(int gridX) {
		this.gridX = gridX;
	}

	public int getGridY() {
		return gridY;
	}

	public void setGridY(int gridY) {
		this.gridY = gridY;
	}

	

	public ArrayList<String> getPre() {
		return pre;
	}

	public void setPre(ArrayList<String> pre) {
		this.pre = pre;
	}

	public int getKordinataX() {
		return kordinataX;
	}

	public void setKordinataX(int kordinataX) {
		this.kordinataX = kordinataX;
	}

	public int getKordinataY() {
		return kordinataY;
	}

	public void setKordinataY(int kordinataY) {
		this.kordinataY = kordinataY;
	}

	public String[] getPrepreke() {
		return prepreke;
	}

	public void setPrepreke(String[] prepreke) {
		this.prepreke = prepreke;
	}

	
}
