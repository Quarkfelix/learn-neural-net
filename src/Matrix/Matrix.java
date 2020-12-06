package Matrix;

public class Matrix {
	public double[][] data;
	public int rows, cols;
	
// ======================================== CONSTRUCTOR ========================================
	public Matrix(int rows, int cols) {
		data = new double[rows][cols];
		this.rows = rows;
		this.cols = cols;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				data[i][j] = Math.random()*2-1;
			}
		}
	}

// ======================================== METHODS ============================================
	//subtracts matrix b from a
	public static Matrix subtract(Matrix a, Matrix b) {
		Matrix temp = new Matrix(a.rows, a.cols);
		for (int i = 0; i < a.rows; i++) {
			for (int j = 0; j < a.cols; j++) {
				temp.data[i][j] = a.data[i][j] - b.data[i][j];
			}
		}
		return temp;
	}
	
	//reverses all entries 2/4 -> 4/2
	public static Matrix transpose(Matrix a) {
		Matrix temp = new Matrix(a.cols, a.rows);
		for (int i = 0; i < temp.rows; i++) {
			for (int j = 0; j < temp.cols; j++) {
				temp.data[j][i] = a.data[i][j];
			}
		}
		return temp;
	}
	
	//multiplies a and b;
	public static Matrix multiply(Matrix a, Matrix b) {
		Matrix temp=new Matrix(a.rows,b.cols);
        for(int i=0;i<temp.rows;i++)
        {
            for(int j=0;j<temp.cols;j++)
            {
                double sum=0;
                for(int k=0;k<a.cols;k++)
                {
                    sum+=a.data[i][k]*b.data[k][j];
                }
                temp.data[i][j]=sum;
            }
        }
        return temp;
	}
	
	
	//adds parameter to every entry in matrix
	public void add(double scalar) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				this.data[i][j] += scalar;
			}
		}
	}
	
	//adds 1/1 and 1/1 | 1/2 and 1/2 etc.
	public void add(Matrix m) {
		if(cols != m.cols || rows != m.rows) {
			System.out.println("shape mismatch");
			return;
		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				this.data[i][j] += m.data[i][j];
			}
		}
	}
	
	//multiplies a with local matrix
	public void multiply(Matrix a) {
        for(int i=0;i<a.rows;i++)
        {
            for(int j=0;j<a.cols;j++)
            {
                this.data[i][j]*=a.data[i][j];
            }
        } 
    }
    
	//multiplies local matrix by a;
    public void multiply(double a) {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                this.data[i][j]*=a;
            }
        }
    }
	
// ======================================== GET/SET METHODS ====================================
// ======================================== PAINT-METHODS ======================================
	
	
}
