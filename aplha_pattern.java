class aplhaPattern{
	public void Pattern(int rows){
		char chr = 'A';
		for(int row = 1; row <= rows; row++){
			int spaces = rows - row;
			for(int space = 1; space <= spaces; space++){
				System.out.print("  ");
			}
			for(int chr1 =  1; chr1 <= row; chr1++){
				System.out.print(chr+" ");
				chr++;
			}
			chr--;
			for(int chr2 = 2; chr2 <= row; chr2++){
				--chr;
				System.out.print(chr+" ");
			}
			System.out.print("\n");
		}
	}
	public void Pattern2(int rows){
		char chr = 'A';
		for(int row = rows; row >= 1; row--){
			int spaces = rows - row;
			for(int space = 1; space <= spaces; space++){
				System.out.print("  ");
			}
			for(int chr1 =  1; chr1 <= row; chr1++){
				System.out.print(chr+" ");
				chr++;
			}
			chr--;
			for(int chr2 = 2; chr2 <= row; chr2++){
				--chr;
				System.out.print(chr+" ");
			}
			System.out.print("\n");
		}
	}
	public void Pattern3(int rows){
		char chr = 'A';
		for(int row = 1; row <= rows; row++){
			int spaces = rows - row;
			for(int space = 1; space <= spaces; space++){
				System.out.print("  ");
			}
			for(int chr1 =  1; chr1 <= row; chr1++){
				System.out.print(chr+" ");
				chr++;
			}
			chr--;
			for(int chr2 = 2; chr2 <= row; chr2++){
				--chr;
				System.out.print(chr+" ");
			}
			System.out.print("\n");
		}
		for(int row = rows; row >= 1; row--){
			int spaces = rows - row;
			for(int space = 1; space <= spaces; space++){
				System.out.print("  ");
			}
			for(int chr1 =  1; chr1 <= row; chr1++){
				System.out.print(chr+" ");
				chr++;
			}
			chr--;
			for(int chr2 = 2; chr2 <= row; chr2++){
				--chr;
				System.out.print(chr+" ");
			}
			System.out.print("\n");
		}
	}
}


public class aplha_pattern{
	public static void main(String [] args){
		aplhaPattern obj = new aplhaPattern();
		System.out.println("\nPattern 1...\n");
		obj.Pattern(5);
		System.out.println("\nPattern 2...\n");
		obj.Pattern2(5);
		System.out.println("\nPattern 3...\n");
		obj.Pattern3(5);
	}
}
