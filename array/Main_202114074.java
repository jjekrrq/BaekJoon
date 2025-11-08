package baekjoon.array;



import java.util.Scanner;

public class Main_202114074 {
    public static void main(String[] args) {
        System.out.println("hw6_1:이승창");

        // 공백 이진검색트리 생성
        BinarySearchTree tree = new BinarySearchTree();

        // 정수 개수(n)와 n개의 정수를 입력받아 이진검색트리에 삽입
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            tree.add(scanner.nextInt());
        }

        // 중위 순회 결과 출력
        tree.inorder(); // 중위순회하면 정렬이 되어 나온다.
        System.out.println();

        // 전위 순회 결과 출력
        tree.preorder();

        scanner.close();
    }
}

class BinarySearchTree {

    // 이진검색트리 노드 클래스
    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    // 루트 노드를 가리키는 인스턴스 변수
    private Node root = null;

    // 이진검색트리에 key 값을 삽입 - 반복문을 이용한 알고리즘
    public void add(int key) { // 입력받은 key값
        Node newNode = new Node(key); // key를 바탕으로 새로운 노드 생성

        if (root == null) { // 현재 루트가 설정되어 있지 않다면,
            root = newNode; // 루트를 새로운 노드로 설정.
            return;
        }

        Node current = root; // 현재 노드
        Node parent = null; // 부모 노드

        while (current != null) {
            if (key == current.key) {
                // 중복된 키면 삽입하지 않음
                return;
            }

            parent = current; // 현재 위치를 부모로 저장.
            if (key < current.key) { // 왼쪽으로. 즉, 루트의 key가 1이고 현재 키가 2면 오른쪽으로.
                current = current.left; // 현재를 현재의 왼쪽 노드로 변경
            } else { // 오른쪽으로
                current = current.right; // 현재를 현재의 오른쪽 노드로 변경
            }
        } // 반복문 탈출 : 현재가 null일 때. 즉, 현재에 아무 노드가 없을 때.

        if (key < parent.key) { // 현재가 null임으로 부모로 거슬러 올라가 key를 비교해서 부모키보다 작으면
            parent.left = newNode; // 부모의 왼쪽 자식 노드로 newNode를 삽입
        } else { //현재가 null임으로 부모로 거슬러 올라가 key를 비교해서 부모키보다 크면
            parent.right = newNode; // 부모의 오른쪽 자식 노드로 newNode를 삽입
        }
    }


    // 중위 순회
    public void inorder() {
        inorder(root);
    }

    // t를 루트로 하는 이진검색트리를 중위 순회하여 키값을 출력하는 재귀 메소드
    private void inorder(Node t) { // 중위순회는 부모 노드를 2번째로 순회
        if (t != null) {
            inorder(t.left);
            System.out.print(t.key + " ");
            inorder(t.right);
        }
    }

    // 전위 순회
    public void preorder() {
        preorder(root);
    }

    // t를 루트로 하는 이진검색트리를 전위 순회하여 키값을 출력하는 재귀 메소드
    private void preorder(Node t) { // 전위 순회는 부모 노드를 처음으로 순회
        if (t != null) {
            System.out.print(t.key + " ");
            preorder(t.left);
            preorder(t.right);
        }
    }


}