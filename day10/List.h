#pragma once
#include "Node.h"

class List
{
	Node* head;
	Node* tail;
	int size;

public:
	List();
	~List();
	
	bool isEmpty() const;

	//add
	void addFirst(int);
	void addLast(int);

	//delete
	void removeFirst();
	void removeLast();

	//traverse
	void traverse() const;

};
