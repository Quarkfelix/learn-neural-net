package Matrix;

import java.util.List;

public class Driver {
	static double [][] X= {
			{0,0,0},
			{1,0,1},
			{0,1,1},
			{1,1,1},
			{1,0,0}
	};
	static double [][] Y= {
			{0},{1},{0},{1},{1}
	};

	//output for {1,0} should be {1}
	
	public static void main(String[] args) {
		
		NeuralNetwork nn = new NeuralNetwork(3,40,1);
		
		
		List<Double>output;
		
		nn.fit(X, Y, 50000);
		double [][] input = {
				{0,1,0}
		};
		for(double d[]:input)
		{
			output = nn.predict(d);
			System.out.println(output.toString());
		}		

	}
}
