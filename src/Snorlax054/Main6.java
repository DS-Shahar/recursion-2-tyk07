package Snorlax054;

public class Main6 {
	public static int sum(int[] arr, int i) //14
	{
		if(i == 0)
		{
			return arr[i];
		}
		return arr[i] + sum(arr, i-1);
	}
	public static int p(int[] arr, int i) //15
	{
		if(i < 0 || i > arr.length)
		{
			return 0;
		}
		if(arr[i] <= 0)
		{
			return p(arr, i-1);
		}
		return 1 + p(arr, i-1);
	}
	public static int find(int[] arr, int i, int n) //16
	{
		if(i < 0)
		{
			return -1;
		}
		if(arr[i] == n)
		{
			return i;
		}
		return find(arr, i-1, n);
	}
	public static boolean higher(int[] arr, int i) //17
	{
		if(i < 0 || i + 1 > arr.length - 1)
		{
			return true;
		}
		if(arr[i] >= arr[i+1])
		{
			return false;
		}
		return higher(arr, i-1);
	}
	public static boolean prime(int[] arr, int i) //18
	{
		if(i < 0 || i + 1 > arr.length)
		{
			return true;
		}
		if(helper(arr[i], arr[i]-1) == false)
		{
			return false;
		}
		return prime(arr, i-1);
	}
	public static boolean helper(int n, int i) //18
	{
		if(i == 1)
		{
			return true;
		}
		else if(i < 1 || i >= n)
		{
			i = n-1;
		}
		if(n % i == 0)
		{
			return false;
		}
		return helper(n, i-1);
	}
	public static int counter(int n, int[][] arr, int row) //19
	{
		if(row < 0 || row > arr.length-1)
		{
			return 0;
		}
		for(int i = 0;i < arr[0].length; i++)
		{
			if(arr[row][i] == n)
			{
				return 1 + counter(n, arr, row-1);
			}
		}
		return counter(n, arr, row-1);
	}
	public static boolean palindrome(char[] arr, int i, int j) //20
	{
		if(i >= j && arr[i] == arr[j])
		{
			return true;
		}
		if(arr[i] != arr[j])
		{
			return false;
		}
		return palindrome(arr, i+1, j-1);
	}
	public static void main(String[] args) {
		int[] a = {2, -5, 4, 6, -7, 3};
		char[] b = {'g', 'f', 'h'};
		int[][] c = {{1,2,3}, {4,3,2}};
		System.out.println(sum(a, 4));
		System.out.println(p(a, 5));
		System.out.println(find(a, 3, 3));
		System.out.println(higher(a, 4));
		System.out.println(prime(a, 0));
		System.out.println(counter(3, c, c.length-1));
		System.out.println(palindrome(b, 0, 2));
	}
}