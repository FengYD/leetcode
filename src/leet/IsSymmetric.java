package leet;

import model.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author fengyadong001
 * @date 2019/12/19 9:56 PM
 * @description
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        Deque<ArrayList<Integer>> deque = new LinkedList<>();
        mediumOrder(root, deque, 0);
        while (!deque.isEmpty()) {
            if (deque.size() == 1 && deque.getFirst().get(1).equals(0)){
                deque.removeFirst();
                break;
            }else if (deque.getFirst().get(0).equals(deque.getLast().get(0)) &&
                    deque.getFirst().get(1).equals(deque.getLast().get(1))) {
                deque.removeFirst();
                deque.removeLast();
            } else {
                break;
            }
        }
        return deque.isEmpty();
    }

    public void mediumOrder(TreeNode root, Deque<ArrayList<Integer>> deque, Integer level) {
        if (root == null) {
            return;
        } else {
            mediumOrder(root.left, deque, level + 1);
            deque.add(new ArrayList<>(Arrays.asList(root.val, level)));
            mediumOrder(root.right, deque, level + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        IsSymmetric a = new IsSymmetric();
        a.isSymmetric(root);
    }

}