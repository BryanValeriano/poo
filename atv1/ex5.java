
public class ex5 {

    public static void popula(int[] v) {
        for(int i = 0; i < v.length; i++) v[i] = (int)(Math.random() * 100);
    }

    public static void print(int[] v) {
        for(int i = 0; i < v.length; i++) System.out.print(v[i] + " ");
        System.out.println();
    }

    public static void swap(int[] v, int x, int y) {
        int z = v[x];
        v[x] = v[y];
        v[y] = z;
    }

    public static void sort(int[] v) { 
        for(int i = 0; i < v.length; i++) {
            int mini = v[i];
            int pos = i;
            for(int j = i+1; j < v.length; j++)
                if(v[j] < mini) {
                    mini = v[j];
                    pos = j;
                }
            swap(v,i,pos);
        }
    }

    public static void main(String[] args) {
        int[] v;
        v = new int[20];
        popula(v);
        print(v);
        sort(v);
        print(v);
    }
}
