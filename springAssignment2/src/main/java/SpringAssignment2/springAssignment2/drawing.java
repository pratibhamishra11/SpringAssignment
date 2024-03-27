package SpringAssignment2.springAssignment2;

public class drawing {
		private String color, shape;

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getShape() {
			return shape;
		}

		public void setShape(String shape) {
			this.shape = shape;
		}

		@Override
		public String toString() {
			return "Drawing [color=" + color + ", shape=" + shape + "]";
		}
}
