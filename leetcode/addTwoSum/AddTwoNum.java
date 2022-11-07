package com.example.test.leetCode;

import java.util.ArrayList;

/**
 * @Author: zhangpeng
 * @Description: 两数之和参见力括 leetcode中文站
 * @Date: 2022/11/7
 */
public class AddTwoNum {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            //除法
            carry = sum / 10;
            //取余
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    public static void main(String[] args) {
        AddTwoNum addTwoNum = new AddTwoNum();
        int[] array1 = {1,2,3};
        int[] array2 = {1};
        ListNode l1 = ListNode.makeNode(array1);
        ListNode l2 = ListNode.makeNode(array2);
        ListNode l3 = addTwoNum.addTwoNumbers(l1,l2);
        ArrayList list = ListNode.traverse(l3);
        System.out.println(list.toString());

    }
}
