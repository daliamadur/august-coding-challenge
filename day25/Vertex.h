#pragma once
#include <iostream>
#include <vector>

using namespace std;

class Vertex
{
	string id;
	int distance; //from source to vertex
	Vertex* previous; //pointer to prev vertex on the shortest path
	vector<pair<Vertex*, int>> neighbours; //all neighbouring vertices with weights

public:
	Vertex(string);
	
	//setters
	
	void setDistance(int);
	void setPrevious(Vertex*);

	//getters
	string getId() const;
	int getDistance() const;
	Vertex* getPrevious() const;
	const vector<pair<Vertex*, int>>& getNeighbours() const;

	void addNeighbour(Vertex*, int);
};
