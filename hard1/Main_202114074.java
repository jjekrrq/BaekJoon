package baekjoon.hard1;

import java.util.*;

public class Main_202114074 {

    // 간선을 표현하는 클래스
    static class Edge implements Comparable<Edge> { // Comparable을 구현해줘야 Edge들 사이에서 정렬이 가능함
        int u, v, weight;

        // 생성자: 정점 u, v와 간선의 가중치를 저장
        public Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }

        // 가중치를 기준으로 오름차순 정렬
        // compareTo메소드를 재정의해줘야 Collections.sort()메소드를 실행하는데에 있어서 오류가 없다.
        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }

        // 간선을 문자열로 출력
        @Override
        public String toString() {
            return "(" + u + "," + v + "," + weight + ")";
        }
    }

    // 상호배타집합(Union-Find)용 배열
    static int[] parent; // 각 노드의 부모를 저장
    static int[] rank;   // 트리의 깊이를 나타내는 랭크

    public static void main(String[] args) {
        System.out.println("hw10_1:이승창");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 정점의 개수 입력
        int[][] adjMatrix = new int[n][n]; // 인접 행렬
        ArrayList<Edge> edgeList = new ArrayList<>(); // 간선 리스트

        // 인접 행렬 입력
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                adjMatrix[i][j] = scanner.nextInt();

        // 간선 목록 생성 (중복을 피하기 위해 j는 i+1부터 시작)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (adjMatrix[i][j] != 0) {
                    edgeList.add(new Edge(i, j, adjMatrix[i][j]));
                }
            }
        }

        // 그래프 간선 목록 출력
        for (Edge e : edgeList) {
            System.out.print(e + " ");
        }
        System.out.println();

        // 최소신장트리 구성
        kruskal(edgeList, n);
    }

    // 크루스칼 알고리즘 구현
    public static void kruskal(List<Edge> edges, int n) {
        Collections.sort(edges); // 간선 리스트를 가중치 오름차순으로 정렬
        // 이때 edges는 List임으로 이 리스트에서 객체를 꺼내 비교하는 것이 맞다. 하지만 edges를 넘겨주는데 어떻게 비교할 수 있을까
        // 답은 Edge클래스에 Comparable을 implement하여 객체간 비교를 자동으로 하는 것이 핵심이다.
        // 이때 Edge에 CompareTo메소드를 override하여야 한다.

        // 상호배타집합 초기화
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i; // 처음에는 자기 자신이 부모
            rank[i] = 0;   // 초기 랭크는 0
        }

        ArrayList<Edge> mst = new ArrayList<>(); // MST 간선 저장 리스트

        // 간선을 하나씩 확인하여 MST 구성
        for (Edge edge : edges) {
            int uRoot = findSet(edge.u); // 정점 u의 루트 찾기
            int vRoot = findSet(edge.v); // 정점 v의 루트 찾기

            // 두 정점이 서로 다른 집합에 속해 있으면 사이클이 아님
            if (uRoot != vRoot) {// 다른집합일 때.
                mst.add(edge);       // MST에 이 간선을 추가
                union(uRoot, vRoot); // 두 집합을 합침
            }
        }

        // 최소신장트리 간선 목록 출력
        for (Edge e : mst) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    // Find-Set 함수 (경로 압축 적용)
    public static int findSet(int x) {
        if (parent[x] != x) {
            parent[x] = findSet(parent[x]); // 재귀적으로 부모를 찾아 올라가며 압축
        }
        return parent[x];
    }

    // Union 함수 (랭크 기반)
    public static void union(int x, int y) {
        int xRoot = findSet(x);
        int yRoot = findSet(y);

        if (xRoot == yRoot) return; // 이미 같은 집합이면 return

        // 더 깊은 랭크를 기준으로 병합
        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else {
            parent[yRoot] = xRoot;
            if (rank[xRoot] == rank[yRoot]) {
                rank[xRoot]++; // 랭크가 같으면 하나 증가
            }
        }
    }
}