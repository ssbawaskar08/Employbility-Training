//DP for adjacency matrix
import java.util.Scanner;
public class Q25 {
    public static void floydWarshall(int [] [] arr,int size){
        int [] [] dist = new int [size][size];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                dist[i][j]=arr[i][j];
            }
        }
        for(int k =0;k<size;k++){
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr.length;j++){
                    if(dist[i][k]+dist[k][j]<dist[i][j])
                   dist[i][j]=dist[i][k]+dist[k][j];
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                System.out.print(dist[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int INF = -1;
        int arr [] [] = {
            {0,5,INF,10},
            {INF,0,3,INF},
            {INF,INF,0,1},
            {INF,INF,INF,0}
        };
        floydWarshall(arr, arr.length);

        // for(int i = 0;i<arr.length;i++){
        //     for(int j = 0;j<arr.length;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
    }
}
