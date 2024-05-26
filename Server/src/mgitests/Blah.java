package mgitests;

public class Blah {

	
	
	public static void main(String[] args) {
		
		int px = 3222;
		int py = 3222;
		
		for (int tx = px-1; tx <= px+1; tx++) {
			for (int ty = py-1; ty <= py+1; ty++) {
				if (px == tx && py == ty)
					continue;
				
				System.out.println(tx + "," + ty);
				// ffs my head is not working one sec
				
				int angle = (int)Math.round(Math.toDegrees(Math.atan2(px-tx, py-ty))/22.5d)&0x7;
				
				System.out.println(angle);
				
				
			}
		}
		
		
		
	}
	
}
