package priv.tangxin.algorithm.sort;

import java.util.Arrays;

/**
 * @Desc 归并排序
 * @Author tangxin
 * @Date 2021/5/27
 */
public class MergeSort {

    public static void sort(Comparable[] a) {
        sort(a,0,a.length-1);
    }


    public static void sort(Comparable[] a,int from,int to) {
        System.out.println("sort------- "+from+" ------- "+to+" -----start-- ");
        if(to <= from) {
            System.out.println("-------to <= from------- ");
            return;
        }
        int mid = from + (to - from)/2;
        System.out.println("-------sort left------- ");
        sort(a, from,mid);
        System.out.println("-------sort right------- ");
        sort(a,mid+1, to);
        merge(a, from,mid, to);
        SortHelper.show(a);
        System.out.println("sort------- "+from+" ------- "+to+" -----end-- ");
    }

    public static void merge(Comparable[] a,int l,int mid,int r) {
        System.out.println("merge--- "+l+" --- "+mid+" ---- "+r+" ------- ");
        Comparable[] aux = Arrays.copyOfRange(a, l, r+1);
        //从 l,mid  到mid+1,r
        int i = l, j = mid+1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                a[k] = aux[j];
                j++;
            } else if (j > r) {
                a[k] = aux[i];
                i++;
            } else if (SortHelper.less(aux[j], aux[i])) {
                a[k] = aux[j];
                j++;
            } else {
                a[k] = aux[i];
                i++;
            }
        }
    }




    public static void main(String[] args) {
        Comparable[] a = SortHelper.generateRandomArray(20,1,100);
        SortHelper.show(a);
        sort(a);
        SortHelper.show(a);
    }

}
