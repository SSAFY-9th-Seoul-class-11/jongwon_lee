import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		
		StringTokenizer st=new StringTokenizer(in.readLine()," ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int[] dp=new int[n];
		dp[0]=arr[0];
		for(int i=1;i<n;i++) {
			dp[i]=Math.max(arr[i],dp[i-1]+arr[i]);
		}
		
		PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
		for(int i=0;i<n;i++) {
			pq.add(dp[i]);
		}
		System.out.println(pq.poll());
	}	
}