#include "Stack.h"
#include <limits.h>
#include <iostream>

Stack::Stack() : topElement(nullptr), minInt(INT_MAX) {}

void Stack::push(int x) {
	
	Node* node = new Node(x); //create new node with int value
	node->setPrev(topElement); //set previous top to prev element

	topElement = node; //set top to new node

	//set element to min if it's smallest in stack
	if (x < minInt) {
		minInt = x;
	}

	node->setStackMin(minInt);

}

int Stack::pop() {

	int popped = topElement->getData();

	if (topElement->getPrev() != nullptr) {
		//set new top to previous node
		topElement = topElement->getPrev();
		minInt = topElement->getStackMin();
	}
	else {
		topElement = nullptr;
	}

	return popped;

}

Node* Stack::top() {
	if (topElement == nullptr) {
		throw std::out_of_range("Stack is empty");
	}
	else {
		return topElement;
	}
	
}

int Stack::min() {
	if (topElement == nullptr) {
		throw std::out_of_range("Stack is empty");
	}
	else {
		return minInt;
	}

}
