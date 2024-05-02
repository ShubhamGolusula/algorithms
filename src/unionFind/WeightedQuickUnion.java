package unionFind;

public class WeightedQuickUnion {
    private int[] id;
    private int[] sz;

    WeightedQuickUnion(int n){
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 0;
        }
    }

    private boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    private int root(int i){
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    private void union(int p, int q){
        int i = root(p);
        int j = root(q);
        if (sz[i] > sz[j]){
            id[j] = i; sz[i] += sz[j];
        } else {
            id[i] = j; sz[j] += sz[i];
        }
    }


}
