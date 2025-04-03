import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer; 

public class Main {    
    static int N;    
    static int M;    
    
    public static void main(String[] args) throws Exception {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));         
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");                
        
        N = Integer.parseInt(st.nextToken());        
        M = Integer.parseInt(st.nextToken());                
        
        st = new StringTokenizer(br.readLine(), " ");                
        
        int[] arr = new int[N];                
        for (int i = 0; i < arr.length; i++) {            
            arr[i] = Integer.parseInt(st.nextToken());        
        }                
        
        System.out.println(addLargeNumberSearch(arr));                
        br.close();    
    }        
    
    public static int addLargeNumberSearch(int[] arr) {        
        int result = 0;                
        for (int i = 0; i < arr.length; i++) {            
            for (int j = i + 1; j < arr.length; j++) {                
                for (int k = j + 1; k < arr.length; k++) {                    
                    int num = arr[i] + arr[j] + arr[k];                                        
                    if (num < M) {                        
                        result = Math.max(result, num);                    
                    } 
                    else if (num == M) {                        
                        return M;                    
                    }                
                }           
            }        
        }                
        return result;    
    }
}
