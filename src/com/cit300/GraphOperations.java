package com.cit300;

import java.util.*;

public class GraphOperations {
    private Map<String, List<String>> adjList;

    public GraphOperations() {
        adjList = new LinkedHashMap<>();
    }

    public void addVertex(String vertex) {
        if (adjList.containsKey(vertex)) {
            System.out.println("Vertex already exists!");
            return;
        }
        adjList.put(vertex, new ArrayList<>());
        System.out.println("Vertex added: " + vertex);
    }

    public void addEdge(String src, String dest) {
        if (!adjList.containsKey(src) || !adjList.containsKey(dest)) {
            System.out.println("One or both vertices not found! Add vertices first.");
            return;
        }
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
        System.out.println("Edge added: " + src + " <-> " + dest);
    }

    public void displayGraph() {
        if (adjList.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }
        System.out.println("Graph Adjacency List:");
        for (String v : adjList.keySet()) {
            System.out.println("  " + v + " -> " + adjList.get(v));
        }
    }

    public void bfs() {
        if (adjList.isEmpty()) { System.out.println("Graph is empty!"); return; }
        System.out.print("Enter start vertex for BFS: ");
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine().trim();
        if (!adjList.containsKey(start)) { System.out.println("Vertex not found!"); return; }

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        List<String> order = new ArrayList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            String v = queue.poll();
            order.add(v);
            for (String neighbor : adjList.get(v)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println("BFS Traversal: " + order);
    }

    public void dfs() {
        if (adjList.isEmpty()) { System.out.println("Graph is empty!"); return; }
        System.out.print("Enter start vertex for DFS: ");
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine().trim();
        if (!adjList.containsKey(start)) { System.out.println("Vertex not found!"); return; }

        Set<String> visited = new HashSet<>();
        List<String> order = new ArrayList<>();
        dfsRecursive(start, visited, order);
        System.out.println("DFS Traversal: " + order);
    }

    private void dfsRecursive(String v, Set<String> visited, List<String> order) {
        visited.add(v);
        order.add(v);
        for (String neighbor : adjList.get(v)) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited, order);
            }
        }
    }
}