package priv.tangxin.algorithm.sort;

/**
 * @Desc
 * @Author tangxin
 * @Date 2021/5/27
 */
public class InsertionSort extends Sort {

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0 && SortHelper.less(a[j], a[j - 1]); j--) {
                SortHelper.exch(a, j, j - 1);
            }
        }
    }


    public static void main(String[] args) {
        Comparable[] a = SortHelper.generateRandomArray(20,0,100);
        SortHelper.show(a);
        sort(a);
        SortHelper.show(a);
    }

}
