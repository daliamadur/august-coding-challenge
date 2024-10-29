#include "Graph.h"
#include "Vertex.h"
#include <queue>
#include <stack>

void Graph::addVertex(const string& vertexID) {

	vertices.insert({ vertexID, new Vertex(vertexID) });
}

void Graph::addEdge(const string& sourceID, const string& destID, int weight) {
	
	Vertex* source = vertices.at(sourceID);
	Vertex* destination = vertices.at(destID);

	source->addNeighbour(destination, weight);

}
