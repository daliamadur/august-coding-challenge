#pragma once
#include "Node.h"

class Stack
{
	Node* topElement;
	int minInt;

public:
	Stack();

	void push(int);
	int pop();
	Node* top();
	int min();
};
