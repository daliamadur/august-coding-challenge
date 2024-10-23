#include "List.h"
#include <iostream>

List::List() : head(nullptr), tail(nullptr), size(0) {}

bool List::isEmpty() const { return head == nullptr; }

//add
void List::addFirst(int x) {
	//create node
	Node* newNode = new Node(x);

	// if list empty, set head + tail to node
	if (isEmpty()) {
		head = newNode;
		tail = newNode;
	}
	else {
		//set node.next to head
		newNode->setNext(head);
		//set node to head
		head = newNode;
	}
	size++;
	
}
void List::addLast(int x) {
	//create node
	Node* newNode = new Node(x);

	// if list empty, set head + tail to node
	if (isEmpty()) {
		head = newNode;
		tail = newNode;
	}
	else {
		//set tail.next to node
		tail->setNext(newNode);
		//set node to tail
		tail = newNode;
	}
	size++;
}


//delete
void List::removeFirst() {

	if (isEmpty()) {
		return;
	}

	Node* headNode = head;
	if (head == tail) {
		head = nullptr;
		tail = nullptr;
	}
	else {
		//set head.next to head
		head = head->getNext();
	}
	//delete head
	delete headNode;
	size--;
	
}

void List::removeLast() {

	if (isEmpty()) {
		return;
	}

	Node* tailNode = tail;
	Node* newTail;
	Node* node;

	if (head == tail) {
		head = nullptr;
		tail = nullptr;
	}
	else {
		//traverse list until node.next == tail
		node = head;
		while (node->getNext() != tailNode) {
			node = node->getNext();
		}

		//delete tail
		delete tailNode;
		
		//set node to tail
		tail = node;
		//set node.next to nullptr
		tail->setNext(nullptr);
		
	}
	
	size--;
}

//traverse
void List::traverse() const {
	
	if (isEmpty()) {
		return;
	}
	
	Node* node = head;
	//while next != nullptr print node, node++
	while (node != nullptr) {

		std::cout << node->getData() << " ";
		node = node->getNext();
		
	}
}

List::~List() {
	while (head != nullptr) {
		List::removeLast();
	}
}
