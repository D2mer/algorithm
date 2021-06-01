package priv.tangxin.algorithm.sort;

/**
 * @Desc
 * @Author tangxin
 * @Date 2021/5/27
 */
public class ShellSort {

    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int h = length / 2; h > 0; h = h / 2) {
            for (int i = h; i < length; i++) {
                for (int j = i;j>=h && SortHelper.less(a[j],a[j-h]);j = j-h){
                    SortHelper.exch(a,j,j-h);
                }
            }
            SortHelper.show(a);
        }
    }

    public static void main(String[] args) {
        Comparable[] a = SortHelper.generateRandomArray(20,0,100);
        SortHelper.show(a);
        sort(a);
        SortHelper.show(a);
    }

}
