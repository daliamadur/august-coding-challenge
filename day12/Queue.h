#pragma once
#include <stack>

using namespace std;

class Queue
{
	stack<int> enq;
	stack<int> deq;

public:
	Queue();
	~Queue();

	void printQueue();
	void enqueue(int);
	int dequeue();

	bool isEmpty() const;

	void popAll(stack<int>&, stack<int>&);
};

