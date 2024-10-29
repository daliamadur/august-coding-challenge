void Graph::Dijkstra(const string& sourceID) {
	
	//initalise distance to 0
	Vertex* source = vertices.at(sourceID);
	source->setDistance(0);

	//initalise priority queue
	priority_queue<Vertex*, vector<Vertex*>, VertexComparator> queue;
	queue.push(source);

	while (!queue.empty()) {
		//remove vertex with smallest distance
		Vertex* vertex = queue.top();
		queue.pop();

		//calculate potential distance between vertex and neighbours
		for (auto& v : vertex->getNeighbours()) {
			Vertex* neighbour = v.first;
			int weight = v.second;
			int newDistance = vertex->getDistance() + weight;

			//if new distance is smaller, update neighbours distance, set previous to current
			if (neighbour->getDistance() > newDistance) {
				neighbour->setDistance(newDistance);
				neighbour->setPrevious(vertex);

				//push updated vertex back into queue
				queue.push(neighbour);
			}
		}
	}
}
