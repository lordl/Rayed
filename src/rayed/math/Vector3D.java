package rayed.math;

public class Vector3D {
	private double x,y,z;
	
	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3D add(Vector3D other) {
		return new Vector3D(x+other.x, y+other.y, z+other.z);		
	}
	
	public Vector3D sub(Vector3D other) {
		return new Vector3D(x-other.x, y-other.y, z-other.z);		
	}
	
	public Vector3D mag(Vector3D other) {
		return new Vector3D(x*other.x, y*other.y, z*other.z);		
	}
	
	public Vector3D cross(Vector3D other) {
		return new Vector3D(y * other.z - z * other.y, 
				            z * other.x - x * other.z,
				            x * other.y - y * other.x);		
	}
	
	public Vector3D normalized() {
		double len = length();
		
		return new Vector3D(x/len, y/len, z/len);
	}
	
	public double dot(Vector3D other) {
		return x*other.x + y*other.y + z*other.z;		
	}
	
	public double length() {
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	public double lengthSq() {
		return x*x + y*y + z*z;
	}
	
	public double x() {
		return x;		
	}
	public double y() {
		return y;		
	}
	public double z() {
		return z;		
	}
	
}
