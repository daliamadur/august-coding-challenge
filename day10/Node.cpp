#include "Node.h"

Node::Node() : data(0), next(nullptr) {}

Node::Node(int x) : data(x), next(nullptr) {}

//data
void Node::setData(int x) { data = x; }
int Node::getData() const { return data; }

//next
void Node::setNext(Node* x) { next = x; }
Node* Node::getNext() const { return next; }
