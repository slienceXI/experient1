package experiment1_2;

public class Programex extends Program{
	//桩模块
	@Override
	public boolean flag(int temp1, int temp2) {
		if(temp1 == temp2) {
			System.out.println("temp1 == temp2, it is a Integer");
			return true;
		}
		else {
			System.out.println("temp1 != temp2, not a Integer");
			return false;
		}
	}
}

