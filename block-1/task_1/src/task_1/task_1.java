package task_1;

public class task_1 {

	public static void main(String[] args) {
		System.out.println(remainder(1,3)+"\n");
		System.out.println(remainder(3,4)+"\n");
		System.out.println(remainder(-9,45)+"\n");
		System.out.println(remainder(5,5)+"\n");
	}
	
	private static int remainder(int x, int y)
	{
		int ans=x%y;
		return ans;
	}

}