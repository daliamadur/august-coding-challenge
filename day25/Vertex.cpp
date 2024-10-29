#include "Vertex.h"

using namespace std;

Vertex::Vertex(string name) : id(name), distance(INT_MAX), previous(nullptr) {};

//setters
void Vertex::setDistance(int n) { distance = n; }
void Vertex::setPrevious(Vertex* vertex) { previous = vertex; }

void Vertex::addNeighbour(Vertex* vertex, int weight) {
	pair<Vertex*, int> neighbour;
	neighbour.first = vertex;
	neighbour.second = weight;
	neighbours.push_back(neighbour);
}

//getters
string Vertex::getId() const { return id; }
int Vertex::getDistance() const { return distance; }
Vertex* Vertex::getPrevious() const { return previous; }
const vector<pair<Vertex*, int>>& Vertex::getNeighbours() const { return neighbours; }
