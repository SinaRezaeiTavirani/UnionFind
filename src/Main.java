


public class Main {

    public static void main(String[] args){
        QuickFindUF uf1 = new QuickFindUF(10);
        QuickUnionUF uf2 = new QuickUnionUF(10);
        System.out.println(uf2.connected(2,2));
        uf2.union(1,7);
        uf2.union(2, 8);
        uf2.union(1,8);
        System.out.println(uf2.connected(8,7));
    }
}