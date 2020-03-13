package builderPattern;

public class Builder {

	static class Vehicle {
        private Vehicle(Builder1 builder) {
            this.model = builder.model;
            this.cost = builder.cost;
        }
        private String model;
        private int cost;
        public static class Builder1 {
            private String model; 
            private int cost;
            public Builder1(String model) {
                this.model = model;
            }
            public Builder1(int cost) {
                this.cost = cost;
            }
            
            public Vehicle build() {
                return new Vehicle(this);
            }
			public Builder1 cost(int cost) {
				this.cost = cost;
				return this;
			}
        }
        @Override
        public String toString() {
            return String.format("Vehicle : %s\nCost=%d", this.model, cost);
        }
    }
    public static void main(String[] args) {
        Vehicle Vehicle = new Builder.Vehicle.Builder1("Harley Davidson").cost(150000).build();
        System.out.println(Vehicle);
    }

}
