package unionFind;

public class QuickUnion {
    private int id[];

    QuickUnion(int n){
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    private boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    private void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
