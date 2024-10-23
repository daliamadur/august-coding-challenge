#pragma once
class Node
{
	int data;
	Node* next;

public:
	
	Node();
	Node(int);

	void setData(int);
	int getData() const;

	void setNext(Node*);
	Node* getNext() const;

};
