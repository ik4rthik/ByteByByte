#include <stdio.h>
#include <stdlib.h>

struct Node {
    int dest;
    struct Node* next;
};

struct AdjList {
    struct Node* head;
};

struct Node* createNode(int dest) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->dest = dest;
    newNode->next = NULL;
    return newNode;
}

void addEdge(struct AdjList adj[], int s, int t) {
    struct Node* newNode = createNode(t);
    newNode->next = adj[s].head;
    adj[s].head = newNode;

    newNode = createNode(s);
    newNode->next = adj[t].head;
    adj[t].head = newNode;
}

void DFSRec(struct AdjList adj[], int visited[], int s) {
    visited[s] = 1;
    printf("%d ", s);

    struct Node* current = adj[s].head;
    while (current != NULL) {
        int dest = current->dest;
        if (!visited[dest]) {
            DFSRec(adj, visited, dest);
        }
        current = current->next;
    }
}

void DFS(struct AdjList adj[], int V) {
    int visited[V];

    for (int i = 0; i < V; i++) {
        visited[i] = 0;
    }

    for (int i = 0; i < V; i++) {
        if (visited[i] == 0) {
            DFSRec(adj, visited, i);
        }
    }
}

int main() {
    int V = 6;
    struct AdjList adj[V];

    for (int i = 0; i < V; i++) {
        adj[i].head = NULL;
    }

    const int E = 4;
    int edges[][2] = {{1, 2}, {2, 0}, {0, 3}, {4, 5}};

    for (int i = 0; i < E; i++) {
        addEdge(adj, edges[i][0], edges[i][1]);
    }

    printf("Complete DFS traversal of the graph:\n");
    DFS(adj, V);

    return 0;
}

