package baekjoon.helloworld;

import java.util.Scanner;

public class Main_202114074 {
    static int n; // 정점의 수
    static int[][] matrix; // 인접행렬로 그래프 표현
    static int[] visited;  // 정점 방문 상태: 0 = 미방문, 1 = 방문 중, 2 = 방문 완료
    static int[] arr;      // DFS 후 topological sort 결과를 담을 스택 역할의 배열
    static int index;      // arr 배열의 인덱스를 위한 변수
    static boolean isDAG = true; // 사이클 존재 여부 확인 변수 (기본값은 true)

    public static void main(String[] args) {
        System.out.println("hw10_3:이승창");
        Scanner scanner = new Scanner(System.in);

        // 정점 수 n을 입력
        n = scanner.nextInt();
        arr = new int[n]; // 정렬 결과를 담을 배열 생성

        // 인접행렬을 생성하고 입력받은 값으로 초기화
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt(); // 간선이 있으면 1, 없으면 0
            }
        }

        // 그래프 전체를 DFS 방식으로 탐색하며 사이클 존재 여부를 확인
        graphTraversal();

        // 사이클 존재 여부에 따라 DAG인지 아닌지 출력
        if (isDAG) {
            System.out.println("DAG입니다.");
        } else {
            System.out.println("사이클이 존재하므로 DAG가 아닙니다.");
        }
    }

    // 그래프 전체를 깊이우선탐색
    static void graphTraversal() {
        visited = new int[n]; // 방문 상태 배열 초기화 (0으로 자동 초기화)
        index = 0; // 결과 배열의 인덱스도 0으로 초기화

        // 방문하지 않은 정점부터 시작해서 DFS 수행
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
    }

    // DFS 함수: 정점 i를 시작으로 깊이우선탐색 수행
    static void dfs(int i) {
        visited[i] = 1; // 정점 i 방문 중 상태로 설정

        // 인접한 정점들을 확인
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 1) { // 간선이 존재하면
                if (visited[j] == 0) {
                    // 아직 방문하지 않은 정점이면 재귀 DFS 호출
                    dfs(j);
                } else if (visited[j] == 1) {
                    // 이미 방문 중인 정점을 다시 방문하면 사이클 발생
                    isDAG = false; // DAG가 아님
                }
            }
        }

        // 모든 인접 정점 확인 후 방문 완료 상태로 설정
        visited[i] = 2;
        arr[index++] = i; // 후위 순회 결과를 저장 (topological sort 용도)
    }
}
