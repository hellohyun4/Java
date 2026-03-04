import java.util.*;
import java.io.*;

public class main {
	static int[] arr;
	static int Max, sum;
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
       	int M = Integer.parseInt(st.nextToken());
       	int[] arr = new int[N];
       	
       	st = new StringTokenizer(br.readLine());
    	
       	for (int i=0;i<N;i++) {
       		arr[i]=Integer.parseInt(st.nextToken());
       	}
       	sum =0;
       	Max = Integer.MIN_VALUE;
       	
       	for(int i=0;i<N-2;i++) {
       		for(int j=i+1;j<N+1;j++) {
       			for(int k=j+1;k<N;k++) {
       				int sum=arr[i]+arr[j]+arr[k];
       				if(sum<=M&&sum>Max) Max = sum;
       			}
       		}
       	}
       	System.out.println(Max);
    }
    
}