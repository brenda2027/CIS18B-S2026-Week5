# Mini-Assignment 6: Custom Iterable and Iterator Pattern

## Objective
Implement a custom `Iterable` domain model and compare multiple iterator strategies.

## Primary Competency
Custom `Iterable` design and iterator strategy comparison.

## Learning Objectives Alignment
Week 5 objectives 5, 6, 7, and 8.

## Estimated Time
50 to 70 minutes.

## Problem Statement
Build a small domain model such as a playlist or assignment queue that supports both default traversal and one alternate traversal strategy (for example, priority order). Then explain when this custom iterator design adds value beyond built-in collection iteration.

## Requirements
Complete the production code and tests so that:

* the domain model implements `Iterable<T>`
* `iterator()` returns the default traversal strategy
* the model exposes a second iterator strategy via a clearly named method
* both traversals operate over the same underlying data
* the program prints both traversal orders
* at least two JUnit tests verify the two traversal strategies
* one short written reflection explains when built-in iteration would have been enough

## Extension Challenge
Add a third traversal strategy such as reverse order or only-high-priority items.

## Self-Check

* Is each traversal strategy deterministic?
* Does each call return a fresh iterator with independent state?
* Did your tests assert actual sequence order values?

## Expected Output

```text
Default order: [Intro, Demo, Quiz]
Priority order: [Quiz, Demo, Intro]
```

## Run

```bash
mvn test
mvn exec:java
```

Use `mvn test` first for TDD. Tests validate insertion-order iteration, priority-order iteration, and repeated-iteration behavior.

Suggested JUnit targets:

```bash
mvn -Dtest=PlaylistTest test
```

## Rubric Focus

* Correct custom `Iterable` implementation
* Clear iterator strategy design
* Strong test coverage and explanation quality

## Reflection
 Built in iteration was able to be enough if the playlist only required one simple traversal order such as insertion order.The custom iterable adds value when same data needs multiple meaningful traversal strategies such as default order and priority order, without different writing.

