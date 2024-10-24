#include "Queue.h"
#include <iostream>

Queue::Queue() {}

bool Queue::isEmpty() const {
	return enq.empty() && deq.empty();
}

void Queue::popAll(stack<int>& stk, stack<int>& target) {
	while (!stk.empty()) {
		target.push(stk.top());
		stk.pop();
	}
}

void Queue::enqueue(int x) {
	if (!deq.empty()) {
		popAll(deq, enq);
	}

	enq.push(x);
}

int Queue::dequeue() {
	if (deq.empty()) {
		if (enq.empty()) {
			throw std::out_of_range("Cannot dequeue from an empty queue");
		}
		else {
			popAll(enq, deq);
		}
	}

	int x = deq.top();
	deq.pop();

	return x;
}

void Queue::printQueue() {

	if (isEmpty()) {
		std::cout << "Queue is empty." << endl;
	}
	else {
		std::cout << "Queue size: " << enq.size() + deq.size() << endl;
		std::cout << endl;
	}

}

Queue::~Queue() {}
