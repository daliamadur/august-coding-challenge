#pragma once
#include <map>
#include "Vertex.h"

using namespace std;

class Graph
{
	map<string, Vertex*> vertices;

public:
	void addVertex(const string&); //ID
	void addEdge(const string&, const string&, int); //source, destination + weight
	void Dijkstra(const string&); //source
	void printShortestPath(const string&); //destination

	//functor class
	class VertexComparator {
	public:
		bool operator()(Vertex* a, Vertex* b) const {

			return a->getDistance() > b->getDistance();

		}
	};
};
