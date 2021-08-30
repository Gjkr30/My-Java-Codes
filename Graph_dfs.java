import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_dfs {
      LinkedList<Integer> arr[];
    
    @SuppressWarnings("unchecked") Graph_dfs(int n){
        arr = new LinkedList[n];
        for (int i=0; i<n;i++)
            arr[i] = new LinkedList();
    }
    void addEdge(int u,int v)
    {
        arr[u].add(v);
    }
    void Bfs(int start,int v)
    {
        boolean visted[] = new boolean[v];
        visted[start]=true;
        Queue<Integer> qq = new LinkedList<Integer>();
        qq.add(start);
        while(!qq.isEmpty())
        {
            int s = qq.poll();
            System.out.println(s);
            Iterator<Integer> i = arr[s].listIterator();
            while(i.hasNext())
            {
                int k = i.next();
                if(visted[k])
                    continue;
                else{
                    qq.add(k);
                    visted[k]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph_dfs gg = new Graph_dfs(4);
        gg.addEdge(0, 2);
        gg.addEdge(0, 1);
        gg.addEdge(1, 2);
        gg.addEdge(2, 1);
        gg.addEdge(2, 2);
        gg.addEdge(2, 3);
        System.out.println("BFS traversal");
        gg.Bfs(0, 4);

    }
}
