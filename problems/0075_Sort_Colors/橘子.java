package sorting.medium.quicksort;

/**
 * ����һ��������ɫ����ɫ����ɫ��һ�� n ��Ԫ�ص����飬ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�

 �����У�����ʹ������ 0�� 1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ��
    LeetCode 075 ��ɫ����
 ע��:
 ����ʹ�ô�����е����������������⡣
 * */

public class SortedColor {
    public  void swap(int nums[], int i, int j){
        int tmp = nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public  void sortColors(int[] nums) {
        if(nums == null || nums.length==0)
            return;

        int notred=0;
        int notblue=nums.length-1;

        while (notred<nums.length&&nums[notred]==0)
            notred++;

        while (notblue>=0&&nums[notblue]==2)
            notblue--;

        int i=notred;
        while (i<=notblue){
            if (nums[i]==0) {
                swap(nums,i,notred);
                notred++;
                i++;
            }else if (nums[i]==2) {
                swap(nums,i,notblue);
                notblue--;
            }else
                i++;
        }
    }
}


