package cn.xrx.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 *  求二叉树的层序遍历
 * @author xrx
 * @date create on 2021/6/20 22:25
 */
class TreeNodexrx {
    public TreeNodexrx(int val) {
        this.val = val;
    }

    int val =  0;
    TreeNodexrx left = null;
    TreeNodexrx right = null;


}
public class BFS {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNodexrx root) {
        //边界条件判断
        if (root == null)
            return new ArrayList<>();
        //队列
        Queue<TreeNodexrx> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        //根节点入队
        queue.add(root);
        //如果队列不为空就继续循环
        while (!queue.isEmpty()) {
            //BFS打印，levelNum表示的是每层的结点数
            int levelNum = queue.size();
            //subList存储的是每层的结点值
            ArrayList<Integer> subList = new ArrayList<>();
            for (int i = 0; i < levelNum; i++) {
                //出队
                TreeNodexrx node = queue.poll();
                subList.add(node.val);
                //左右子节点如果不为空就加入到队列中
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            //把每层的结点值存储在res中，
            res.add(subList);
        }
        return res;
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        TreeNodexrx tr = new TreeNodexrx(1);
        tr.left = new TreeNodexrx(2);
        tr.right = new TreeNodexrx(3);
        tr.left.left = new TreeNodexrx(4);
        tr.right.right = new TreeNodexrx(5);
        ArrayList<ArrayList<Integer>> arrayLists = bfs.levelOrder(tr);
        for (ArrayList<Integer> arrayList : arrayLists) {
            for (Integer integer : arrayList) {
                System.out.print(integer);
            }
            System.out.println();
        }

    }
}
