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
                min = less(a[j], a[min]) ? j : min;
            }
            exch(a, min, i);
        }
    }

    public static void main(String[] args) {
        Comparable[] a = {0,12,32,7,65,6,9,11,2,18,23,25,42,44,45,52,1};
        sort(a);
        show(a);
    }
}
