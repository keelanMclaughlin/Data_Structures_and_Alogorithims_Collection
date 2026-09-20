# Data Structures & Algorithms Collection

Java implementations for a collection of data structures and algorithims. completed for **COMP 7035 – Linear Data Structures & Algorithms** at [MTU (Munster Technological University)](https://www.mtu.ie/).

## Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Assignment 1 — Linked Lists, Stacks & Queues](#assignment-1--linked-lists-stacks--queues)
- [Assignment 2 — Divide & Conquer, Greedy Algorithms and compresion](#assignment-2--divide--conquer-and-greedy-algorithms)
- [Provided vs. Implemented Files](#provided-vs-implemented-files)


## Overview
This repository contains a collection of Datastructures and algorithims created for two assessements for the Linear data structures and algorithims module MTU. Neccisary information needed for context on alogrithinms and data structures can be referenced from the two attached pdfs containing project outlines and questions. To see what algorithims and data structures were used, refer to the project structure below. 

## Project Structure

```
src/main/java/
├── Algorithims/
│   ├── Activity.java              # Provided: activity record (start/finish interval)
│   ├── DivideAndConquer.java      # Assignment 2, Task 1.A — fibonacci, search, hanoi
│   ├── Greedy.java                # Assignment 2, Task 1.B — activitySelection, makeChange
│   ├── MergeSort.java             # Assignment 2, Task 2.A — merge, mergesort
│   └── QuickSort.java             # Assignment 2, Task 2.B — partition, quicksort
│
└── Data_Structures/
    ├── Lists/
    │   ├── List.java              # Provided: generic list interface
    │   └── DoubleLinkedList.java  # Assignment 1, Task 1 — full implementation
    │
    ├── Queues/
    │   ├── Queue.java             # Provided: generic queue interface
    │   ├── ArrayQueue.java        # Assignment 1, Task 3.A — array-backed queue
    │   └── DynamicQueue.java      # Assignment 1, Task 3.B — linked-list-backed queue
    │
    ├── Stacks/
    │   ├── Stack.java             # Provided: generic stack interface
    │   ├── ArrayStack.java        # Assignment 1, Task 2.A — array-backed stack
    │   └── DynamicStack.java      # Assignment 1, Task 2.B — linked-list-backed stack
    │
    └── Trees_and_compresion/
        ├── BinaryTrie.java        # Provided: binary trie node for Huffman codes
        ├── HeapOfBinaryTries.java # Assignment 2, Task 3.A — heapify, constructor, extractMin, insert
        └── Huffman.java           # Assignment 2, Task 3.B — findOptimalCode
```
.

## Assignment 1 — Linked Lists, Stacks & Queues

Submitted files: `DoubleLinkedList.java`, `ArrayStack.java`, `DynamicStack.java`, `ArrayQueue.java`, `DynamicQueue.java`.

| Task | Description |
|---|---|
| 1 — Linked list | Implement `List<Object>` as a doubly linked list: constructor, `prepend`, `getFirst`, `deleteFirst`, `append`, `getLast`, `deleteLast`, `empty` |
| 2.A — Array stack | Implement `Stack<Object>` backed by a fixed-size array |
| 2.B — Dynamic stack | Implement `Stack<Object>` backed by `DoubleLinkedList` |
| 3.A — Array queue | Implement `Queue<Object>` backed by a fixed-size array |
| 3.B — Dynamic queue | Implement `Queue<Object>` backed by `DoubleLinkedList` |

## Assignment 2 — Divide & Conquer and Greedy Algorithms

Submitted files: `DivideAndConquer.java`, `Greedy.java`, `MergeSort.java`, `QuickSort.java`, `HeapOfBinaryTries.java`, `Huffman.java`.

| Task | Description |
|---|---|---|
| 1.A — Divide & conquer | `fibonacci`, `search` (binary search), `hanoi` (Tower of Hanoi) — must follow the divide & conquer schema |
| 1.B — Greedy | `activitySelection` (max set of non-overlapping activities), `makeChange` (greedy coin change) |
| 2.A — Merge sort | `merge` and `mergesort` |
| 2.B — Quicksort | `partition` (Hoare-style, in place) and `quicksort` |
| 3.A — Heap of binary tries | `heapify`, constructor, `extractMin`, `insert` for a min-heap of `BinaryTrie` nodes |
| 3.B — Huffman codes | `findOptimalCode`, building the optimal prefix code tree from the heap |

## Provided vs. Implemented Files

The assignment briefs distributed some supporting files that weren't part of the graded deliverable — they're included here because the project needs them to compile and run, but the actual implementation work was in the files listed above.

| Provided | Purpose |
|---|---|
| `List.java`, `Stack.java`, `Queue.java` | Interfaces implemented by the graded classes |
| `Activity.java` | Interval type used by `Greedy.activitySelection` |
| `BinaryTrie.java` | Trie node type used by `HeapOfBinaryTries` and `Huffman` |




