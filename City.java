public class City {
    private String name;
    private Connection[] connections;
    private int connectionCount;
    private static final int MAX_CONNECTIONS = 10;

    public City(String name) {
        this.name = name;
        this.connections = new Connection[MAX_CONNECTIONS];
        this.connectionCount = 0;
    }

    public City(String name, Connection[] connections) {
        this.name = name;
        this.connections = new Connection[MAX_CONNECTIONS];
        this.connectionCount = 0;
        for (Connection connection : connections) {
            if (connectionCount < MAX_CONNECTIONS) {
                this.connections[connectionCount] = connection;
                connectionCount++;
            } else {
                System.out.println("Превышено максимальное количество соединений для города " + name);
                break;
            }
        }
    }

    public void addConnection(City city, int cost) {
        if (connectionCount < MAX_CONNECTIONS) {
            connections[connectionCount] = new Connection(city, cost);
            connectionCount++;
        } else {
            System.out.println("Превышено максимальное количество соединений для города " + name);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" -> ");
        for (int i = 0; i < connectionCount; i++) {
            sb.append(connections[i].getCity().getName()).append(":").append(connections[i].getCost()).append(" ");
        }
        return sb.toString().trim();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Connection[] getConnections() {
        return connections;
    }
    public void setConnections(Connection[] connections) {
        this.connections = connections;
    }
    public static class Connection {
        private City city;
        private int cost;

        public Connection(City city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        public City getCity() {
            return city;
        }

        public int getCost() {
            return cost;
        }
    }
}