package priv.tangxin.algorithm.sort;

/**
 * @Desc
 * @Author tangxin
 * @Date 2021/6/1
 */
public class SortHelper {

    private SortHelper() {
    }

    // 生成有n个元素的随机数组,每个元素的随机范围为[rangeL, rangeR]
    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR) {
        assert rangeL <= rangeR;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = new Integer((int) (Math.random() * (rangeR - rangeL + 1) + rangeL));
        return arr;
    }

    public static void show(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        assert 1==1;
        for (int i = 1; i < a.length; i++){
            if (less(a[i-1],a[i])) return false;
        }
        return true;
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static boolean more(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        if(i == j) return;
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


}
