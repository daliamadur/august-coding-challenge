#include "Node.h"

Node::Node() : data(0), stackMin(0), prev(nullptr) {}

Node::Node(int x) : data(x), stackMin(0), prev(nullptr) {}

//data
void Node::setData(int x) { data = x; }
int Node::getData() const { return data; }

//prev
void Node::setPrev(Node* x) { prev = x; }
Node* Node::getPrev() const { return prev; }

//stackMin
void Node::setStackMin(int x) { stackMin = x; }
int Node::getStackMin() const { return stackMin; }
