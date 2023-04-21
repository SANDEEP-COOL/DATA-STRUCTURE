// Almost correct , but it's not giving the desired output
import java.util.*;

public class RatInMaze62 {

    public static boolean isSafe(int arr[][], int size, String visited[][], int newx, int newy){
        
        if( (newx>=0 && newx<size) && (newy>=0 && newy<size) && arr[newx][newy] == 1 && visited[newx][newy]=="notvisited" ) {
            return true;
        }
        return false;
    }

    public static void solve(int arr[][], int size, ArrayList<String> ans, String path, int srcx, int srcy, String visited[][]) {

        // DESTINATION - base case 
        if( (srcx == size-1) && (srcy == size-1) ){
            
            // store path into ans 
            ans.add(path);
            return;
        }

        // we already reached to arr[srcx][srcy] , mark it as visited
        visited[srcx][srcy]="visited";

        // choices - 4 : Down|Left|Right|Up 

        int newx=0 , newy=0;

        // Down 
        newx=srcx+1;
        newy=srcy;
        
        // check whether this is safe move ?
        if(isSafe(arr, size, visited, newx, newy)){

            // add this move to path 
            path=path+"Down ";

            // bakki ka kam recusrion kar lega 
            solve(arr, size, ans, path, newx, newy, visited);

            // jab function ke body se return hona to is move ko remove karte jana , every time 
            // path=path.substring(0, path.length()-1);
            path.replace("Down", "");  

        }

        // Left 
        newx=srcx;
        newy=srcy-1;
        
        // check whether this is safe move ?
        if(isSafe(arr, size, visited, newx, newy)){

            // add this move to path 
            path=path+"Left ";

            // bakki ka kam recusrion kar lega 
            solve(arr, size, ans, path, newx, newy, visited);

            // jab function ke body se return hona to is move ko remove karte jana , every time 
            path.replace("left", "");  
        }

        // Right 
        newx=srcx;
        newy=srcy+1;
        
        // check whether this is safe move ?
        if(isSafe(arr, size, visited, newx, newy)){

            // add this move to path 
            path=path+"Right ";

            // bakki ka kam recusrion kar lega 
            solve(arr, size, ans, path, newx, newy, visited);

            // jab function ke body se return hona to is move ko remove karte jana , every time 
            // path=path.substring(0, path.length()-1);
            path.replace("Right", "");  

        }

        // Up 
        newx=srcx-1;
        newy=srcy;
        
        // check whether this is safe move ?
        if(isSafe(arr, size, visited, newx, newy)){

            // add this move to path 
            path=path+"Up ";

            // bakki ka kam recusrion kar lega 
            solve(arr, size, ans, path, newx, newy, visited);

            // jab function ke body se return hona to is move ko remove karte jana , every time 
            // path=path.substring(0, path.length()-1);
            path.replace("Up", "");  

        }

        visited[srcx][srcy] = "notvisited";

    }

    public static void main(String []args) {
        int size=4;
        int [][]arr=new int[size][size];

        // 2D array 
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                Scanner sc=new Scanner(System.in);
                arr[i][j]=sc.nextInt();
            }
        }

        // 2D array 
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // answer list 
        ArrayList<String> ans=new ArrayList<String>();

        String path="";

        // visited array 
        String visited[][]=new String[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                visited[i][j]="notvisited";
            }
        }

        // source
        int srcx=0;
        int srcy=0;

        solve(arr, size, ans, path, srcx, srcy, visited);
        
        System.out.println(ans);
    }
}
