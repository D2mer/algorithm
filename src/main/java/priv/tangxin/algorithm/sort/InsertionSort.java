package priv.tangxin.algorithm.sort;

/**
 * @Desc
 * @Author tangxin
 * @Date 2021/5/27
 */
public class InsertionSort extends Sort {

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }


    public static void main(String[] args) {
        Comparable[] a = {0,12,32,7,65,6,9,11,2,18,23,25,42,44,45,52,1};
        sort(a);
        show(a);
    }

}
