package priv.tangxin.algorithm.sort;

/**
 * @Desc
 * @Author tangxin
 * @Date 2021/5/27
 */
public class ShellSort extends Sort{

    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int h = length / 2; h > 0; h = h / 2) {
            for (int i = h; i < length; i++) {
                for (int j = i;;j = j-h){

                }
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] a = {0,12,32,7,65,6,9,11,2,18,23,25,42,44,45,52,1};
        sort(a);
        show(a);
    }

}
