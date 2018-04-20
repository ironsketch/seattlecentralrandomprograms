package pallett;

import java.awt.Color;
public class Palette {
		private Color[] colors;
		private String name;
		
		public static void main(String[] args){
			String name = "Simple";
			Color[] colors = {Color.BLUE,Color.GREEN, Color.RED};
			Palette p = new Palette(colors,name);
			
			String name2 = "Simple";
			Color[] colors2 = {Color.BLUE,Color.GREEN, Color.RED};
			Palette q = new Palette(colors2,name2);
			
			System.out.println("q.equals(p); is " + q.equals(p));
		}
		public Palette(Color[] c, String n) {
			colors = c;
			name = n;
		}
		public boolean equals(Object obj) {
			//if (obj != null && obj.getClass() == this.getClass()){
			if (obj instanceof Palette) {
				// Write your code here
				Palette p = (Palette) obj;
			
				if (!p.name.equals(this.name)){
					return false;
				}
				if (p.colors.length != this.colors.length){
					return false;
				}
				for (int i = 0; i < this.colors.length; i++){
					if(!this.colors[i].equals(p.colors[i])){
						return false;
					} 
				}
					return true;
			} else {
				return false;
		}
	}
}

