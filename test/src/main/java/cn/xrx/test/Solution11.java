package cn.xrx.test;


import java.util.HashSet;
import java.util.Set;

class ListNode11 {
    int val;
    ListNode11 next = null;

    ListNode11(int val) {
        this.val = val;
    }
}
/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/17 22:35
 */
public class Solution11 {

    public ListNode11 EntryNodeOfLoop(ListNode11 pHead) {
        Set<ListNode11> set = new HashSet<>();
        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            }
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }
}
