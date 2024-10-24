#pragma once
class Node
{
	Node* prev;
	int data;
	int stackMin;

public:
	Node();
	Node(int);

	void setData(int);
	int getData() const;
	
	void setPrev(Node*);
	Node* getPrev() const;

	void setStackMin(int);
	int getStackMin() const;
};
