package priv.tangxin.algorithm.sort;

/**
 * @Desc
 * @Author tangxin
 * @Date 2021/5/27
 */
public  class SelectionSort extends Sort {


    /**
     * @desc 选出最小的与第一个交换
     * @param a
     * @return java.lang.Comparable[]
     * @throws
     * @author tangxin
     * @since 2021/5/27
     */
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                min = SortHelper.less(a[j], a[min]) ? j : min;
            }
            SortHelper.exch(a, min, i);
        }
    }

    public static void main(String[] args) {
        Comparable[] a = SortHelper.generateRandomArray(20,0,100);
        SortHelper.show(a);
        sort(a);
        SortHelper.show(a);
    }
}
